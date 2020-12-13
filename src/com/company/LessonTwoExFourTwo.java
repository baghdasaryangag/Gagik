package com.company;

import java.util.Arrays;

public class LessonTwoExFourTwo {
    public static void main(String[] args) {
        int[] myArray = new int[6];
        myArray[0] = 1;
        myArray[1] = 5;
        myArray[2] = 9;
        myArray[3] = 12;
        myArray[4] = 4;
        myArray[5] = 53;
        for (int i = 0; i < myArray.length / 2; i++) {
            int x = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = x;
        }
        System.out.println(Arrays.toString(myArray));
    }

}
