package dev.mmccall.multicalc.controllers;

import dev.mmccall.multicalc.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.stage.FileChooser;

public class MainView {

    @FXML
    void initialize()
    {

    }

    @FXML
    void onNewWindow()
    {

    }

    @FXML
    void onOpen()
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open");
        fileChooser.showOpenDialog(Application.getStage());
    }

    @FXML
    void onSave()
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save");
        fileChooser.showSaveDialog(Application.getStage());
    }

    @FXML
    Menu openRecentMenu;

}