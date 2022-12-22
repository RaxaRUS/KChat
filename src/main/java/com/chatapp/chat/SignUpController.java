package com.chatapp.chat;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private TextField signUpAge;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField signUpName;

    @FXML
    private TextField signUpNumber;

    @FXML
    void initialize() {
        signUpButton.setOnAction(event -> {

            signUpNewUser();
        });
    }

    private void signUpNewUser() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String firstname    = signUpName.getText();
        String login        = login_field.getText();
        String password     = password_field.getText();
        String age          = signUpAge.getText();
        String number       = signUpNumber.getText();

        User user = new User(firstname, age, login, password, number);

        dbHandler.signUpUser(user);
    }

}
