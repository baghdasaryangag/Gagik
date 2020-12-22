package com.company;

import java.util.Scanner;

public class LessonThreeExOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write length");
        double y = scanner.nextDouble();

            switch (0) {
                case 0:
                    double dm = y / 10;
                    System.out.println("decimeter to meter  " + "=" + dm + "meter");
                case 1:
                    double km = y * 1000;
                    System.out.println("kilometer to meter  " + "=" + km + "meter");
                case 2:
                    double mt = y;
                    System.out.println("meter to meter  " + "=" + mt + "meter");
                case 3:
                    double mm = y / 1000;
                    System.out.println("milimeter to meter  "  + "=" + mm + "meter");
                case 4:
                    double sm = y / 100;
                    System.out.println("santimeter to meter  " + "=" + sm + "meter");
            }


    }
}
