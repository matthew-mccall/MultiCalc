package dev.mmccall.multicalc.math;

import dev.mmccall.multicalc.HTML;

import java.util.function.Consumer;

public class Add implements Expression {

    public Add(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression evaluate() {
        Expression leftResult = left.evaluate();
        Expression rightResult = right.evaluate();

        if (Value.isInstanceOf(leftResult) && Value.isInstanceOf(rightResult))
        {
            Value left = (Value) leftResult;
            Value right = (Value) rightResult;

            return new Value(left.value() + right.value());
        }

        return this;
    }

    @Override
    public Expression copy() {
        return new Add(null, null);
    }

    @Override
    public Expression addChild(Expression child) {

        if (left == null)
        {
            left = child;
            return left;
        }

        if (right == null)
        {
            right = child;
            return right;
        }

        return null;
    }

    @Override
    public String toHTML() {

        String leftHTML = "", rightHTML = "";

        if (left != null)
        {
            leftHTML = left.toHTML();
        }

        if (right != null)
        {
            rightHTML = right.toHTML();
        }

        return String.format("%s%s%s", leftHTML, HTML.mo("+"), rightHTML);
    }

    @Override
    public void forEachChild(Consumer<Expression> function) {
        function.accept(left);
        function.accept(right);
    }

    @Override
    public void recurseForEachChild(Consumer<Expression> function) {
        if (left != null)
        {
            left.recurseForEachChild(function);
        }

        if (right != null)
        {
            right.recurseForEachChild(function);
        }

        function.accept(this);
    }

    private Expression left;
    private Expression right;
}
