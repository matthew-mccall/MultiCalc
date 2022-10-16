package dev.mmccall.multicalc.controllers;

import dev.mmccall.multicalc.NumberBuilder;
import javafx.fxml.FXML;
import javafx.scene.web.WebView;

public class SimpleView {

    public SimpleView()
    {
        numberBuilder = new NumberBuilder();
    }

    @FXML
    void onOneButtonClicked()
    {
        numberBuilder.appendDigit(1);
        updateSimpleDisplay();
    }

    @FXML
    void onTwoButtonClicked()
    {
        numberBuilder.appendDigit(2);
        updateSimpleDisplay();
    }

    @FXML
    void onThreeButtonClicked()
    {
        numberBuilder.appendDigit(3);
        updateSimpleDisplay();
    }

    @FXML
    void onFourButtonClicked()
    {
        numberBuilder.appendDigit(4);
        updateSimpleDisplay();
    }

    @FXML
    void onFiveButtonClicked()
    {
        numberBuilder.appendDigit(5);
        updateSimpleDisplay();
    }

    @FXML
    void onSixButtonClicked()
    {
        numberBuilder.appendDigit(6);
        updateSimpleDisplay();
    }

    @FXML
    void onSevenButtonClicked()
    {
        numberBuilder.appendDigit(7);
        updateSimpleDisplay();
    }

    @FXML
    void onEightButtonClicked()
    {
        numberBuilder.appendDigit(8);
        updateSimpleDisplay();
    }

    @FXML
    void onNineButtonClicked()
    {
        numberBuilder.appendDigit(9);
        updateSimpleDisplay();
    }

    @FXML
    void onZeroButtonClicked()
    {
        numberBuilder.appendDigit(0);
        updateSimpleDisplay();
    }

    @FXML
    void onAddButtonClicked()
    {

    }

    void updateSimpleDisplay()
    {
        if (numberBuilder.getValue() == (long) numberBuilder.getValue())
        {
            simpleDisplay.getEngine().loadContent(String.format("<mn>%d</mn>", (long) numberBuilder.getValue()));
            return;
        }

        simpleDisplay.getEngine().loadContent(String.format("<mn>%s</mn>", numberBuilder.getValue()));
    }

    @FXML
    WebView simpleDisplay;

    NumberBuilder numberBuilder;
    String serialization;
}
