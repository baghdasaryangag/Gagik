package com.company;

public class LessonTwoExtraEx156 {
    public static void main(String[] args) {
        int countTwo = 5;
        int count = 3;
        int num = 0;
        for (int i = 10; i <= 200; i++) {
            if (i % count == 0 && i % countTwo == 0) {
                num = num + i;

            }

        }

        System.out.println(num);
    }
}

