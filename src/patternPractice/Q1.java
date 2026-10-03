package patternPractice;

import java.util.Scanner;

public class Q1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern1(n);
    }
    static void pattern1(int n){
        for(int row = 1; row<= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(" * ");
            }
            System.out.println(); //when one row is done ,we need to ad  row line
        }
    }
}
//q1
//*
//* *
//* * *
//* * * *