package patternPractice;

import java.util.Scanner;

public class q4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern4(n);
    }
    static void pattern4(int n){
        for(int row = 1; row<= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print( col );
            }
            System.out.println(); //when one row is done ,we need to ad  row line
        }
    }
}
