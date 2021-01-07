package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] arrayOne = new int[10];
        Random rd = new Random();

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = rd.nextInt(10);
        }

        maxArray(arrayOne);
        minArray(arrayOne);
        averageArray(arrayOne);
    }

    public static void maxArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.println("Max: " + max);
    }

    public static void minArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }

        }
        System.out.println("Min:" + min);
    }

    public static void averageArray(int[] array) {
        double average = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        average = sum / array.length;
        System.out.println("Avarage:" + average);
    }
}
