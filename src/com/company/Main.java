package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[8];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
        String arrayString = "";
        for (int i = 0; i < array.length; i++) {
            arrayString = arrayString + array[i];
        }
        System.out.println(arrayString);
        for (int i = 1; i < array.length; i = i + 2) {
            array[i] = 0;

        }
        for (int element : array) {
            System.out.print(element + ", ");

        }
    }
}
