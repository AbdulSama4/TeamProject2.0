package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane mainMenu;

    @FXML
    private Button registerButton; // Assuming the button in mainMenu.fxml is named "registerButton"

    @FXML
    void initialize() {
        // Set an action for the Register button
        registerButton.setOnAction(this::openRegistrationForm);
    }

    private void openRegistrationForm(ActionEvent event) {
        try {
            // Load the RegistrationForm.fxml file
            Parent registrationForm = FXMLLoader.load(getClass().getResource("RegistrationForm.fxml"));

            // Create a new scene
            Scene registrationScene = new Scene(registrationForm);

            // Get the stage information
            Stage stage = (Stage) mainMenu.getScene().getWindow();

            // Set the new scene on the stage
            stage.setScene(registrationScene);

            // Show the stage
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately (e.g., show an error message)
        }
    }
}
