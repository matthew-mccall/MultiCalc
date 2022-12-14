package dev.mmccall.multicalc.math;

import java.util.function.Consumer;

public record Value(double value) implements Expression {

    @Override
    public Expression evaluate() {
        return this;
    }

    @Override
    public Expression copy() {
        return new Value(value);
    }

    @Override
    public Expression addChild(Expression child) {
        return null;
    }

    @Override
    public String toHTML() {
        if (value == (long) value)
        {
            return String.format("<mn>%d</mn>", (long) value);
        }

        return String.format("<mn>%s</mn>", value);
    }

    @Override
    public void forEachChild(Consumer<Expression> function) {
    }

    @Override
    public void recurseForEachChild(Consumer<Expression> function) {
        function.accept(this);
    }

    public static boolean isInstanceOf(Expression e)
    {
        return e instanceof Value;
    }

}
