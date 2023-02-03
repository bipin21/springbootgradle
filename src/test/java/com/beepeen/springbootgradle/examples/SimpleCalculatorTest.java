package com.beepeen.springbootgradle.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author bipinkarki
 */
class SimpleCalculatorTest {

    @Test
    void twoPlusTwoEqualsToFour(){
        var calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2,2));
    }

}