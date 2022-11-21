package com.playenglish.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {
    @FXML
    private Button btnContinue;

    @FXML
    private Label labelName;

    @FXML
    private Label labelSaludo;

    @FXML
    private TextField textFieldName;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML

    void saludarNombre(javafx.event.ActionEvent event) throws IOException {
        String nombre = textFieldName.getText();
        labelSaludo.setText("Hola " + nombre);
        labelSaludo.getStyleClass().setAll("lbl", "lbl-success");
        textFieldName.setText(null);

        //TODO: complete the change scene
//        root = FXMLLoader.load(getClass().getResource("gameView.fxml"));
//        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//
//        Parent blah = FXMLLoader.load(getClass().getResource("Home.fxml"));
//        Scene scene = new Scene(blah);
//        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        appStage.setScene(scene);
//        appStage.show();
    }

    @FXML
    void initialize() {
    }

}
