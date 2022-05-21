package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;


import java.io.IOException;


public class LoginFormController {
    public AnchorPane context;
    public JFXPasswordField txtPwp;
    public JFXTextField txtUser;
    public JFXButton btnAdministratorSign;


    public JFXButton btnCashierSign;


    public void initialize() {
    }

    public void AdministratorSignInOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../view/Admin-dashboard-form.fxml"));
        context.getChildren().add(parent);
    }

    public void CashierSignInOnAction(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../view/cashier-dashboard-form.fxml"));
        context.getChildren().add(parent);
    }
}
