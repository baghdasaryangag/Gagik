package com.company;

import java.util.Arrays;

public class LessonTwoExFour {
    public static void main(String[] args) {
        int[] array = new int[6];
        array[0] = 2;
        array[1] = 5;
        array[2] = 7;
        array[3] = 12;
        array[4] = 21;
        array[5] = 8;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
