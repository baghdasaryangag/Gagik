package com.company;

public class LessonTwoExFourThree {
    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 22;
        array[1] = 12;
        array[2] = 3;
        array[3] = 8;
        array[4] = 53;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = sum / array.length;
        System.out.println("the arithmetic mean of the array elements = " + average);
    }
}
