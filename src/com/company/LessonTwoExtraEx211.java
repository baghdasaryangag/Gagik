package com.company;

public class LessonTwoExtraEx211 {
    public static void main(String[] args) {
        int[] array = {5, 12, -8, 7, 4};
        double sum = 0;
        int countElements=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>0) {
                sum = array[i] + sum;
                countElements++;

            }

        }
        System.out.println(sum / countElements);
    }
}
