package com.example.form;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.Optional;

public class HelloController {
    @FXML
    private TextField txtUserName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private CheckBox chkRemPassword;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnCancel;

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

    @FXML
    protected void onClearClick() {
        txtUserName.setText("");
        txtPassword.setText("");
        chkRemPassword.setSelected(false);
        btnLogin.setDisable(true);
    }

    @FXML
    protected void onCancelClick() {
        Alert a = new Alert(Alert.AlertType.WARNING, "End?", ButtonType.YES, ButtonType.NO);
        Optional<ButtonType> r = a.showAndWait();
        if(r.isPresent() && r.get() == ButtonType.YES) {
//            System.exit(0);
            Stage stage = (Stage) btnCancel.getScene().getWindow();
            stage.close();
        }
    }
}