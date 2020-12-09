package com.company;

import java.util.Scanner;

public class LessonTwoExOne {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("цена 1 кг конфет");
        int x = scaner.nextInt();
        int i = 12;
        for (i = 2; i < 11; i++) {
            System.out.println("" + x*i);
            i=i+1;
        }
    }
}
