package dev.mmccall.multicalc.math;

public record Value(double value) implements Expression {

    @Override
    public Expression evaluate() {
        return this;
    }

    public static boolean isInstanceOf(Expression e)
    {
        return e instanceof Value;
    }

}
