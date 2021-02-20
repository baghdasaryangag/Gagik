package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(5);
        numbers.add(1);
        numbers.add(11);
        numbers.add(1);
        int sum = 0;
        List<Integer> sumList = new ArrayList<>();
        for (int i = 0; i < numbers.size() - 4; i++) {
            sum = 0;
            for (int j = i; j < i + 5; j++) {
                sum = sum + numbers.get(j);
            }
            sumList.add(sum);
        }
        System.out.println(sumList);
        int max = sumList.get(0);
        for (int i = 0; i < sumList.size(); i++) {
            if (sumList.get(i) > max ) {
                max = sumList.get(i);

            }
        }
        System.out.println(max);



    }
}
