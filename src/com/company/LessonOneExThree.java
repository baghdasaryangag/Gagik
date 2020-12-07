package com.company;

import java.util.Scanner;

public class LessonOneExThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kord x");
        double x = scanner.nextDouble();
        Scanner scannertwo = new Scanner(System.in);
        System.out.println("kord y");
        double y = scannertwo.nextDouble();
        if (x >= -1 && x <= 1 && y >= -1 && y <= 1 && x >= y) {
            System.out.println("The point is on a triangle");
        } else {
            System.out.println("The point is not on the triangle");
        }

    }
}
