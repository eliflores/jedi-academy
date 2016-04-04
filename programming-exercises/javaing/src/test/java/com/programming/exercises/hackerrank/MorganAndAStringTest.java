package com.programming.exercises.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MorganAndAStringTest {

    @Test
    public void testGetTheLexicographicallyMinimalString() {
        System.out.println('A' - 'B');
        assertEquals("DAJACKNIEL", MorganAndAString.getTheLexicographicallyMinimalString("JACK", "DANIEL"));
        assertEquals("AABABACABACABA", MorganAndAString.getTheLexicographicallyMinimalString("ABACABA", "ABACABA"));

        assertEquals("DADADD", MorganAndAString.getTheLexicographicallyMinimalString("DAD", "DAD"));
        assertEquals("ABBCBACBA", MorganAndAString.getTheLexicographicallyMinimalString("ABCBA", "BCBA"));
        assertEquals("BABABC", MorganAndAString.getTheLexicographicallyMinimalString("BAC", "BAB"));
        assertEquals("DABCDAD", MorganAndAString.getTheLexicographicallyMinimalString("DAD", "DABC"));
        assertEquals("YZYYZYYZYZYYZYZYY", MorganAndAString.getTheLexicographicallyMinimalString("YZYYZYZYY", "ZYYZYZYY"));
    }
}