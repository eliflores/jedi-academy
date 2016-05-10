package com.programming.exercises;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MathMagicTest {
    @Test
    public void factorial() {
        MathMagic mathMagic = new MathMagicImpl();
        assertThat(mathMagic.factorial(0), is(1L));
        assertThat(mathMagic.factorial(1), is(1L));
        assertThat(mathMagic.factorial(4), is(24L));
        assertThat(mathMagic.factorial(7), is(5040L));
        assertThat(mathMagic.factorial(9), is(362880L));
    }

}