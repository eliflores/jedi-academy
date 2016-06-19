package com.programming.exercises;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArraysMiscExercisesTest {
    @Test
    public void sumUsingStreams() throws Exception {
        ArraysMiscExercises arraysMiscExercises = new ArraysMiscExercises();
        assertThat(arraysMiscExercises.sumUsingStreams(null), is(0));
        assertThat(arraysMiscExercises.sumUsingStreams(new int[]{}), is(0));
        assertThat(arraysMiscExercises.sumUsingStreams(new int[]{1}), is(1));
        assertThat(arraysMiscExercises.sumUsingStreams(new int[]{1, 4, 5, 8}), is(18));

    }

    @Test
    public void sumUsingForLoop() {
        ArraysMiscExercises arraysMiscExercises = new ArraysMiscExercises();
        assertThat(arraysMiscExercises.sumUsingForLoop(null), is(0));
        assertThat(arraysMiscExercises.sumUsingForLoop(new int[]{}), is(0));
        assertThat(arraysMiscExercises.sumUsingForLoop(new int[]{1}), is(1));
        assertThat(arraysMiscExercises.sumUsingForLoop(new int[]{1, 4, 5, 8}), is(18));
    }

    @Test
    public void sumUsingWhileLoop() {
        ArraysMiscExercises arraysMiscExercises = new ArraysMiscExercises();
        assertThat(arraysMiscExercises.sumUsingWhileLoop(null), is(0));
        assertThat(arraysMiscExercises.sumUsingWhileLoop(new int[]{}), is(0));
        assertThat(arraysMiscExercises.sumUsingWhileLoop(new int[]{1}), is(1));
        assertThat(arraysMiscExercises.sumUsingWhileLoop(new int[]{1, 4, 5, 8}), is(18));
    }

    @Test
    public void sumUsingRecursion() {
        ArraysMiscExercises arraysMiscExercises = new ArraysMiscExercises();
        assertThat(arraysMiscExercises.sumUsingRecursion(null), is(0));
        assertThat(arraysMiscExercises.sumUsingRecursion(new int[]{}), is(0));
        assertThat(arraysMiscExercises.sumUsingRecursion(new int[]{1}), is(1));
        assertThat(arraysMiscExercises.sumUsingRecursion(new int[]{1, 4, 5, 8}), is(18));
    }
}