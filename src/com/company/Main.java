package com.company;

public class Main {

    public static void main(String[] args) {

        int m = 4;
        int[][] matricName = {{5, 6, 7, 8}, {4, 3, 2, 1}, {10, 11, 12, 13}, {14, 15, 16, 17}};
        int sum = 0;

        for (int i = m - 1; i >= 0; i--) {

            for (int j = m - 1; j > i; j--) {


                if (matricName[i][j] % 2 == 0) {
                    sum = sum + matricName[i][j];

                }

            }
        }
        System.out.println(sum);
    }
}
