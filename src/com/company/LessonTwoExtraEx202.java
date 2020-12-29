package com.company;

public class LessonTwoExtraEx202 {
    public static void main(String[] args) {
        int num = 665444;
        int k = 0;
        int sum = 0;
        while (num > 1) {
            k = num % 10;
            num = (num - k) / 10;
            sum += k;

        }
        System.out.println(sum);
    }
}

