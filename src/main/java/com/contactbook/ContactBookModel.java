package com.contactbook;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class ContactBookModel
{
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick()
    {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}