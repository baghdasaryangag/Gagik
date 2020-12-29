package com.company;

public class LessonTwoExtraEx211 {
    public static void main(String[] args) {
        int[] array = {5, 12, 8, 7, 4};
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        System.out.println(sum / array.length);
    }
}
