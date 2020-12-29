package com.company;

public class LessonTwoExtraEx250 {
    public static void main(String[] args) {
        double[] array = {15, 5, 12, 6, 8};
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i * array[i]) % 3 == 2) {
                sum=Math.pow(array[i],2)*sum;

            }

        }
        System.out.println(sum);
    }
}
