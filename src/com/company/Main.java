package com.company;

public class Main {
    public static void main(String[] args) {
        String a = "BAREV TIGRAN";
        System.out.println(a.length());

        int x = 2;
        int y = 1;
        int z = 18;
        if (x > y && x > z) {
            System.out.println("x max");
            if (y > z) {
                System.out.println("y");
                System.out.println("z");
            } else {
                System.out.println("z");
                System.out.println("y");
            }
        }
        if (y > x && y > z) {
            System.out.println("y max");
            if (x > z) {
                System.out.println("x");
                System.out.println("z");
            } else {
                System.out.println("z");
                System.out.println("x");
            }
        }
        if (z > x && z > y) {
            System.out.println("z max");
            if (x > y) {
                System.out.println("x");
                System.out.println("y");
            } else {
                System.out.println("y");
                System.out.println("x");
            }
        }

    }

}

