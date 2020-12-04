package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write number");
        int x = scanner.nextInt();
        int b = 0;
        int c;
        int a;
        if (x > 0) {
            b = x + 1;
            System.out.println(" " + b);
        }
        if (x < 0) {
            c = x - 2;
            System.out.println(" " + c);
        }
        if (x == 0) {
            a = x + 10;
            System.out.println(" " + a);
        }
    }

}
