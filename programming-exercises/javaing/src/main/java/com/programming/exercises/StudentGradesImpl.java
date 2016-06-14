package com.programming.exercises;

import java.util.Arrays;

public class StudentGradesImpl implements StudentGrades {
    @Override
    public int findHighestGrade(int[] grades) {
        int highestGrade = 0;
        for (int grade : grades) {
            if (grade > highestGrade) {
                highestGrade = grade;
            }
        }
        return highestGrade;
    }

    @Override
    public int getNumberOfStudentsThatPassed(int[] grades, int minGrade) {
        int numberOfStudentsThatPassed = 0;
        for (int grade : grades) {
            if (grade >= minGrade) {
                numberOfStudentsThatPassed++;
            }
        }
        return numberOfStudentsThatPassed;
    }

    @Override
    public void sortStudentsByGrade(int[] grades) {
        Arrays.sort(grades);
    }
}
