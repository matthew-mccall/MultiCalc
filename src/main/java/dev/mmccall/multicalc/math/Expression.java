package dev.mmccall.multicalc.math;

import dev.mmccall.multicalc.HTMLRenderable;

import java.util.function.Consumer;

public interface Expression extends HTMLRenderable {

    Expression evaluate();
    Expression copy();
    Expression addChild(Expression child);
    void forEachChild(Consumer<Expression> function);
    void recurseForEachChild(Consumer<Expression> function);

}
