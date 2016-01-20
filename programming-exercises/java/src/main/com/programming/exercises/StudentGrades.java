package com.programming.exercises;

public interface StudentGrades {
    /**
     * Given an array with all final grades for a course this method finds the highest grade.
     */
    public int findHighestGrade(int [] grades);

    /**
     * Given an array with all final grades for a course and the minimum grade that a student needs to have in order to pass the course.
     */
    public int getNumberOfStudentsThatPassed(int [] grades, int minGrade);

    /**
     * Sort the array of student grades in ascending order.
     */
    public void sortStudentsByGrade(int [] grades);
}
