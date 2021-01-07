package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arrayOne = new int[10];
        arrayOne[0] = (int) (Math.random() * 10);
        arrayOne[1] = (int) (Math.random() * 10);
        arrayOne[2] = (int) (Math.random() * 10);
        arrayOne[3] = (int) (Math.random() * 10);
        arrayOne[4] = (int) (Math.random() * 10);
        arrayOne[5] = (int) (Math.random() * 10);
        arrayOne[6] = (int) (Math.random() * 10);
        arrayOne[7] = (int) (Math.random() * 10);
        arrayOne[8] = (int) (Math.random() * 10);
        arrayOne[9] = (int) (Math.random() * 10);
        maxArray(arrayOne);
        minArray(arrayOne);
        averageArray(arrayOne);
    }

    public static void maxArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.println("Max: " + max);
    }

    public static void minArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
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
        double avarage = sum / array.length;
        System.out.println("Avarage:" + avarage);
    }
}
