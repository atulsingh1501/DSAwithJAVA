package patternPractice;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattrn2(n);
    }
    static void pattrn2(int n){
      for(int i = 0; i < n; i++){
          for(int j = 0; j < n; j++){
              System.out.print(" * ");
          }
          System.out.println();
      }
    }
}
//****
//****
//****
//****