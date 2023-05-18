package com.example.contactbook;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ContactBookController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}