package dev.mmccall.multicalc.math;

public class Add implements Expression {

    public Add(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression evaluate() {
        left.evaluate();
        right.evaluate();

        if (Value.isInstanceOf(left) && Value.isInstanceOf(right))
        {
            Value left = (Value) this.left;
            Value right = (Value) this.right;

            return new Value(left.value() + right.value());
        }

        return this;
    }

    private final Expression left;
    private final Expression right;
}
