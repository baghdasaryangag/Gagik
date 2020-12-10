package com.company;

import java.util.Scanner;

public class LessonTwoExTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write number A");
        double a = scanner.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("write number N");
        int n = scanner2.nextInt();
        int i;
        double sum = 1;
        for (i = 1; i <= n; i++) {

            sum = sum + a * i;


        }
        System.out.println("1 + A + A 2 + A 3 + … + AN = " + sum);
    }
}
