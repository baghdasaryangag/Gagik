package com.company;

public class Main {

    public static void main(String[] args) {
        int m = 4;
        int [][] matric={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for (int i=0; i<m; i++){
            for (int j=0; j<i; j++){
                System.out.print(matric[i][j]+" ");
            }
            System.out.println();
        }
    }
}
