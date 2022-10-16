package dev.mmccall.multicalc.controllers;

import dev.mmccall.multicalc.Application;
import dev.mmccall.multicalc.NumberBuilder;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.web.WebView;

import java.io.IOException;

public class MainView {

    public MainView() throws IOException {
//        FXMLLoader simpleFxmlLoader = new FXMLLoader(Application.class.getResource("main-view.fxml"));
//        Scene simpleScene = new Scene(simpleFxmlLoader.load());
//
//         simpleTabSubScene.setRoot(simpleScene.getRoot());
    }

    @FXML
    SubScene simpleTabSubScene;

}