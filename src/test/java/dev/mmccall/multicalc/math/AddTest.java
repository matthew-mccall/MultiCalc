package dev.mmccall.multicalc.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    void evaluate() {
        Value left = new Value(2);
        Value right = new Value(3);

        Add add = new Add(left, right);
        Expression result = add.evaluate();

        assertTrue(result instanceof Value);
        assertEquals(5, ((Value) result).value());
    }
}