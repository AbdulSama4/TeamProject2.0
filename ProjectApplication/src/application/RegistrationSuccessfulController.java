package application;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class RegistrationSuccessfulController {

    @FXML
    private AnchorPane mainMenu;

    @FXML
    private Button returnToMenuButton;

    // Initialize method
    @FXML
    void initialize() {
        // Set an action for the Return to Menu button
        returnToMenuButton.setOnAction(event -> {
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