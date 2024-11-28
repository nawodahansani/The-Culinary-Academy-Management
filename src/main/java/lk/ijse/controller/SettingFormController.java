package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import lk.ijse.tm.UserTm;

public class SettingFormController {
    public TextField txtUserName;
    public TextField txtPassword;
    public TextField TxtConfirmPassword;
    public TextField txtNewPassword;
    public AnchorPane rootNode;
    public TableView<UserTm> tblUser;
    public TableColumn<?,?> colUserName;
    public TableColumn<?,?> colUserRole;

    public void updateOnAction(ActionEvent actionEvent) {

    }
}
