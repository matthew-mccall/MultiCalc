package dev.mmccall.multicalc;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {

        Font.loadFont(Objects.requireNonNull(Application.class.getResource("fonts/inter/Inter.ttf")).toExternalForm(), 13);

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        Application.stage = stage;

        Application.stage.setTitle("MultiCalc");
        Application.stage.setScene(scene);
        Application.stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static Stage getStage()
    {
        return stage;
    }

    private static Stage stage;
}