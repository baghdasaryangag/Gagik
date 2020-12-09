package com.company;

import java.util.Scanner;

public class LessonTwoExOneB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("цена 1 кг конфет");
        int x = scan.nextInt();
        int i = 10;
        for (i = 1; i <= 10; i++) {
            System.out.println(" " + x * i);
        }
    }


}
