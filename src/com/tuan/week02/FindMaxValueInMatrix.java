package com.tuan.week02;

public class FindMaxValueInMatrix {
    public static void main(String[] args) {
        int[][] myMatrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };
        System.out.println("Max value in Matrix is: " + getMaxValueInMaxtrix(myMatrix));
    }

    public static int getMaxValueInMaxtrix(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
