package dev.mmccall.multicalc.controllers;

import dev.mmccall.multicalc.HTML;
import dev.mmccall.multicalc.HistoryEntry;
import dev.mmccall.multicalc.NumberBuilder;
import dev.mmccall.multicalc.math.Add;
import dev.mmccall.multicalc.math.Blank;
import dev.mmccall.multicalc.math.Expression;
import dev.mmccall.multicalc.math.Value;
import javafx.fxml.FXML;
import javafx.scene.web.WebView;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class SimpleView {

    @FXML
    WebView simpleDisplay;
    @NotNull NumberBuilder numberBuilder;
    String serialization;
    @NotNull Expression rootExpression;
    @NotNull Expression lastExpression;
    @NotNull ArrayList<HistoryEntry> history;

    public SimpleView() {
        history = new ArrayList<>();

        numberBuilder = new NumberBuilder();
        rootExpression = new Blank();
        lastExpression = rootExpression;
    }

    @FXML
    void onOneButtonClicked() {
        onNumberEntry(1);
    }

    @FXML
    void onTwoButtonClicked() {
        onNumberEntry(2);
    }

    @FXML
    void onThreeButtonClicked() {
        onNumberEntry(3);
    }

    @FXML
    void onFourButtonClicked() {
        onNumberEntry(4);
    }

    @FXML
    void onFiveButtonClicked() {
        onNumberEntry(5);
    }

    @FXML
    void onSixButtonClicked() {
        onNumberEntry(6);
    }

    @FXML
    void onSevenButtonClicked() {
        onNumberEntry(7);
    }

    @FXML
    void onEightButtonClicked() {
        onNumberEntry(8);
    }

    @FXML
    void onNineButtonClicked() {
        onNumberEntry(9);
    }

    @FXML
    void onZeroButtonClicked() {
        onNumberEntry(0);
    }

    @FXML
    void onAddButtonClicked() {
        Expression blank = new Blank();
        Expression newExpression = new Add(lastExpression, blank);
        numberBuilder = new NumberBuilder();

        rootExpression = replaceExpressionInTree(rootExpression, lastExpression, newExpression);

        lastExpression = blank;
        updateSimpleDisplay();
    }

    @FXML
    void onSubmitButtonClicked() {
        history.add(new HistoryEntry(rootExpression));
        rootExpression = new Blank();
        lastExpression = rootExpression;

        numberBuilder = new NumberBuilder();

        updateSimpleDisplay();
    }

    void updateSimpleDisplay() {
        StringBuilder html = new StringBuilder();

        for (HistoryEntry entry : history)
        {
            html.append(entry.toHTML());
        }

        html.append(HTML.math(rootExpression.toHTML()));

        simpleDisplay.getEngine().loadContent(HTML.html(html.toString()));
    }

    Expression replaceExpressionInTree(Expression oldTree, @NotNull Expression oldExpression, @NotNull Expression newExpression) {
        Expression tree;

        if (oldTree == oldExpression) {
            return newExpression;
        }

        if (oldTree != null) {
            tree = oldTree.copy();

            oldTree.forEachChild(child -> tree.addChild(replaceExpressionInTree(child, oldExpression, newExpression)));
            return tree;
        } else {
            return null;
        }

    }

    void onNumberEntry(int digit) {
        numberBuilder.appendDigit(digit);
        Expression newExpression = new Value(numberBuilder.getValue());

        rootExpression = replaceExpressionInTree(rootExpression, lastExpression, newExpression);

        lastExpression = newExpression;
        updateSimpleDisplay();
    }
}

