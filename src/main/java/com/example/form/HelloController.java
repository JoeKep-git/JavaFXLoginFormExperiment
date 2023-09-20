package com.example.form;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TextField txtUserName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private CheckBox chkRemPassword;

    @FXML
    private Button btnLogin;

    String username = "Admin";
    String password = "Password";

    @FXML
    protected void onLoginClick() {
        if(txtUserName.getText().equalsIgnoreCase(username) && txtPassword.getText().equals(password)) {
            Alert a = new Alert(Alert.AlertType.CONFIRMATION, "Login successful!");
            a.showAndWait();
        } else {
            Alert a = new Alert(Alert.AlertType.WARNING, "Login failed!");
            a.showAndWait();
        }
    }

    @FXML
    protected void usrKeyPress() {
        if(!txtPassword.getText().isEmpty() && !txtUserName.getText().isEmpty())
            btnLogin.setDisable(false);
        else
            btnLogin.setDisable(true);
    }

    @FXML
    protected void passKeyPress() {
        if(!txtPassword.getText().isEmpty() && !txtUserName.getText().isEmpty())
            btnLogin.setDisable(false);
        else
            btnLogin.setDisable(true);
    }
}