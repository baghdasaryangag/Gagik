package com.company;

public class Main {

    public static void main(String[] args) {
        String text = "safsf889215 asw4 7";
        System.out.println(Integer.valueOf('0') + " " + Integer.valueOf('9'));
        char[] array = text.toCharArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (Integer.valueOf(array[i]) >= 48 && Integer.valueOf(array[i]) <= 57) {
                count++;
            }
        }
        System.out.println(count);


    }
}
