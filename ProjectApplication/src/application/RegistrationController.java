package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class RegistrationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField address;

    @FXML
    private TextField email;

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private AnchorPane mainMenu;

    @FXML
    private TextField password;

    @FXML
    private TextField securityQuestion;

    @FXML
    private Button signup;

    @FXML
    private TextField ssn;

    @FXML
    private TextField state;

    @FXML
    private TextField username;

    @FXML
    private TextField zipcode;
    
    @FXML
    private Button backButton;
    
    
    @FXML
    void initialize() {
        // Set an action for the Sign up button
        signup.setOnAction(event -> {
            try {
                // Load the RegistrationSuccessful.fxml file
                AnchorPane registrationSuccessfulPane = FXMLLoader.load(getClass().getResource("RegistrationSuccessful.fxml"));

                // Replace the current scene content with the RegistrationSuccessful.fxml content
                mainMenu.getChildren().setAll(registrationSuccessfulPane);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Set an action for the Back button
        backButton.setOnAction(event -> {
            try {
                // Load the mainMenu.fxml file
                AnchorPane mainMenuPane = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));

                // Replace the current scene content with the mainMenu.fxml content
                mainMenu.getChildren().setAll(mainMenuPane);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}

    