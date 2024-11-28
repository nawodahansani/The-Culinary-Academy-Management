package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import lk.ijse.bo.BOFactory;
import lk.ijse.bo.custom.SignUpBO;
import javafx.scene.control.Alert;
import lk.ijse.dto.UserDTO;
import org.mindrot.jbcrypt.BCrypt;

public class SignUpFormController {
    public TextField txtUserName;
    public TextField txtRole;
    public TextField txtPassword;
    SignUpBO signUpBO = (SignUpBO) BOFactory.getBoFactory().getBO(BOFactory.BOType.SIGNUP);
    @FXML
    public void registerOnAction(ActionEvent actionEvent) {
        try {
            String userName = txtUserName.getText().trim();
            String role = txtRole.getText().trim().toLowerCase();
            String password = txtPassword.getText().trim();

            if (userName.isEmpty() || role.isEmpty() || password.isEmpty()) {
                new Alert(Alert.AlertType.WARNING,"Please fill all the fields!").show();
                return;
            }

            // Check if the role is valid
            if (!role.equals("admin") && !role.equals("admissions coordinator")) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Invalid Role");
                alert.setHeaderText(null);
                alert.setContentText("Role is wrong, check again!");
                alert.showAndWait();
                return;
            }

            // Hash the password using BCrypt
            String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());

            UserDTO userDTO = new UserDTO(userName, role, hashedPassword);

            signUpBO.saveUser(userDTO);

            txtUserName.clear();
            txtRole.clear();
            txtPassword.clear();

            new Alert(Alert.AlertType.INFORMATION,"User registered successfully!").show();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR,"Error during registration!").show();
        }

    }
}
