package com.programming.exercises;

import java.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class StudentGradesTest {
    @Test
    public void testFindHighestGrade() throws Exception {
        StudentGrades studentGrades = new StudentGradesImpl();
        int[] grades = {1, 2, 8, 4, 5, 8, 3};
        assertEquals(8, studentGrades.findHighestGrade(grades));
    }

    @Test
    public void testGetNumberOfStudentsThatPassed() throws Exception {
        StudentGrades studentGrades = new StudentGradesImpl();
        int[] grades = {1, 2, 8, 4, 5, 8, 3};
        assertEquals(3, studentGrades.getNumberOfStudentsThatPassed(grades, 5));
    }

    @Test
    public void testSortStudentsByGrade() throws Exception {
        StudentGrades studentGrades = new StudentGradesImpl();
        int[] grades = {1, 9, 4, 5, 7};
        studentGrades.sortStudentsByGrade(grades);
        int[] expectedGrades = {1, 4, 5, 7, 9};
        assertTrue(Arrays.equals(expectedGrades, grades));
    }
}
