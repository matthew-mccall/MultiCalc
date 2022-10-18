package dev.mmccall.multicalc.math;

import java.util.function.Consumer;

public class Blank implements Expression {
    @Override
    public Expression evaluate() {
        return this;
    }

    @Override
    public Expression copy() {
        return new Blank();
    }

    @Override
    public Expression addChild(Expression child) {
        return null;
    }

    @Override
    public String toHTML() {
        return " ";
    }

    @Override
    public void forEachChild(Consumer<Expression> function) {

    }

    @Override
    public void recurseForEachChild(Consumer<Expression> function) {

    }
}
