package com.programming.exercises.hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/hourrank-6/challenges/bear-and-workbook
 */
public class LisasWorkbook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfChapters = in.nextInt();
        int maxOfProblemsPerChapter = in.nextInt();
        int numberOfSpecialProblems = 0;
        int totalNumberOfPages = 0;

        for (int i = 0; i < numberOfChapters; i++) {
            int numberOfProblemsPerChapter = in.nextInt();
            int numberOfPagesForChapter = (int) Math.ceil(numberOfProblemsPerChapter / (double) maxOfProblemsPerChapter);
            totalNumberOfPages += numberOfPagesForChapter;

            if (numberOfProblemsPerChapter >= totalNumberOfPages) {
                int minProblemIndex = 1;
                int maxProblemIndex = maxOfProblemsPerChapter;
                int initialPageForChapter = (totalNumberOfPages - numberOfPagesForChapter) + 1;

                for (int currentPage = initialPageForChapter; currentPage <= totalNumberOfPages; currentPage++) {
                    if (currentPage >= minProblemIndex && currentPage <= maxProblemIndex) {
                        numberOfSpecialProblems++;
                    }

                    if (minProblemIndex + maxOfProblemsPerChapter > numberOfProblemsPerChapter) {
                        minProblemIndex = numberOfProblemsPerChapter;
                    } else {
                        minProblemIndex += maxOfProblemsPerChapter;
                    }

                    if (minProblemIndex + maxOfProblemsPerChapter > numberOfProblemsPerChapter) {
                        maxProblemIndex = numberOfProblemsPerChapter;
                    } else {
                        maxProblemIndex += maxOfProblemsPerChapter;
                    }
                }
            }
        }

        System.out.println(numberOfSpecialProblems);
    }
}
