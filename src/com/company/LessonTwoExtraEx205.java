package com.company;

public class LessonTwoExtraEx205 {
    public static void main(String[] args) {
        int num = 1564;
       int h=0;
        for (double i = String.valueOf(num).length(); i > 0; i--) {
            h= (int) (num/Math.pow(10,i-1));
            num = (int) (num - (h*Math.pow(10,i-1)));
            System.out.println(h);
        }
    }
}
