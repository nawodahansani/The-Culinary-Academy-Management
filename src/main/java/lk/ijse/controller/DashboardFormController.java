package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DashboardFormController {
    public Label lblUser;
    public Label date;
    public AnchorPane rootNode;

    public void LogOutOnAction(ActionEvent actionEvent) {
    }

    public void settingOnAction(ActionEvent actionEvent) {
        try {
            rootNode.getChildren().setAll((Node) FXMLLoader.load(this.getClass().getResource("/view/settingForm.fxml")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void homeOnAction(ActionEvent actionEvent) {

    }
}
