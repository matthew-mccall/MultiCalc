package dev.mmccall.multicalc;

import dev.mmccall.multicalc.math.Add;
import dev.mmccall.multicalc.math.Expression;
import dev.mmccall.multicalc.math.Value;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {

        Value val1 = new Value(2);
        Value val2 = new Value(3);

        Add add = new Add(val1, val2);
        Expression result = add.evaluate();

        System.out.println(((Value) result).value());

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        
        stage.setTitle("MultiCalc");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}