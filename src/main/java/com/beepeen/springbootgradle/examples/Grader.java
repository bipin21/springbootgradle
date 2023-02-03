package com.beepeen.springbootgradle.examples;

/**
 * @author bipinkarki
 */
public class Grader {
    public char determineGrade(int marks) {
        if (marks < 0) throw new IllegalArgumentException("marks cannot be negative");
        if (marks < 60) return 'F';
        if (marks < 70) return 'D';
        if (marks < 80) return 'C';
        if (marks < 90) return 'B';
        if (marks < 100) return 'A';
        return 0;
    }
}
