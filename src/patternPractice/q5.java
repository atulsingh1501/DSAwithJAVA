package patternPractice;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern5(n);
    }
//    increasing
    static void pattern5(int n){
        for(int row = 1; row<= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println(); //when one row is done ,we need to ad  row line
        }
//        decreasing
        for(int i = n - 1; i >= 1;i--){
            for(int j = 1 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//  *
//  **
//  ***
//  ****
//  *****
//  ****
//  ***
//  **
//  *