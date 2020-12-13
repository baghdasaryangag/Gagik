package com.company;

import java.util.Arrays;

public class LessonTwoExFourFour {
    public static void main(String[] args) {
        int[] oneArray = new int[5];
        oneArray[0] = 2;
        oneArray[1] = 16;
        oneArray[2] = 3;
        oneArray[3] = 11;
        oneArray[4] = 121;
        for (int i = 0; i < oneArray.length; i++) {
            if (oneArray[i] % 2 != 0) {
                int[] twoArray = {oneArray[i]};
                System.out.println(Arrays.toString(twoArray));
            }
        }
    }
}
