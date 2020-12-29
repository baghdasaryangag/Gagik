package com.company;

import java.util.Scanner;

public class LessonTwoExtraEx151 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write count");
        int count = scanner.nextInt();
        if (count < 0) {
            System.out.println("Count < 0");
            return;

        }
        int factor = 0;
        for (int i = 1; i < 500; i++) {
            if (i % count == 0) {
                factor = factor + i;

            }


        }
        System.out.println(factor);
    }
}
