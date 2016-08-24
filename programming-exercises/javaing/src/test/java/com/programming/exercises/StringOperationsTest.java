package com.programming.exercises;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StringOperationsTest {
    private final StringOperations stringOperations = new StringOperationsImpl();

    @Test
    public void countSubstrings() {
        assertThat(stringOperations.countSubstrings(null, null), is(0));
        assertThat(stringOperations.countSubstrings(null, ""), is(0));
        assertThat(stringOperations.countSubstrings("", null), is(0));
        assertThat(stringOperations.countSubstrings("", ""), is(0));

        assertThat(stringOperations.countSubstrings("foo", ""), is(0));
        assertThat(stringOperations.countSubstrings("", "foo"), is(0));
        assertThat(stringOperations.countSubstrings("patita", "foo"), is(0));

        assertThat(stringOperations.countSubstrings("    ", " "), is(4));
        assertThat(stringOperations.countSubstrings("foo", "f"), is(1));
        assertThat(stringOperations.countSubstrings("aaaaaaa", "a"), is(7));
        assertThat(stringOperations.countSubstrings("foofoo", "fo"), is(2));
        assertThat(stringOperations.countSubstrings("foo", "foo"), is(1));

        assertThat(stringOperations.countSubstrings("patita paseaba patita", "patita"), is(2));
    }

    @Test
    public void stringStartsWithUppercaseLetter() {
        assertFalse(stringOperations.stringStartsWithUppercaseLetter(null));
        assertFalse(stringOperations.stringStartsWithUppercaseLetter(""));
        assertFalse(stringOperations.stringStartsWithUppercaseLetter("-"));
        assertFalse(stringOperations.stringStartsWithUppercaseLetter("?"));
        assertFalse(stringOperations.stringStartsWithUppercaseLetter("hola"));
        assertTrue(stringOperations.stringStartsWithUppercaseLetter("Hola"));
    }
}