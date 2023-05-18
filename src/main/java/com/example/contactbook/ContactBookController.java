package com.example.contactbook;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class ContactBookController {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("IS413 SP23 ContactBook");
        Pane myPane = (Pane) FXMLLoader.load(getClass().getResource("fxml_tableview.fxml"));
        Scene myScene = new Scene(myPane);
        primaryStage.setScene(myScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}