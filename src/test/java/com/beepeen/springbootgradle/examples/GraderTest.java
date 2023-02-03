package com.beepeen.springbootgradle.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bipinkarki
 */
class GraderTest {

    @Test
    void lessThanSixtyIsF(){
        var grader = new Grader();
        assertEquals('F', grader.determineGrade(59));
    }

    @Test
    void lessThanSeventyIsD(){
        var grader = new Grader();
        assertEquals('D', grader.determineGrade(69));
    }

    @Test
    void lessThanEightyIsC(){
        var grader = new Grader();
        assertEquals('C', grader.determineGrade(79));
    }

    @Test
    void lessThanNIntyIsB(){
        var grader = new Grader();
        assertEquals('B', grader.determineGrade(89));
    }

    @Test
    void greaterThanNightyIsA(){
        var grader = new Grader();
        assertEquals('A', grader.determineGrade(95));
    }

    @Test
    void lessThanZeroThrowsException(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> grader.determineGrade(-1));
    }

}