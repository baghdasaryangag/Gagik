package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 3;
        int y;

        if (x > 0) {
            y = 2 * x - 10;
            System.out.println("y=" + y);
        }
        if (x == 0) {
            y=x;
            System.out.println("y="+y);

        }
        if(x<0){
            y=Math.abs(x)*2-1;
            System.out.println("y="+y);
        }


    }
}
