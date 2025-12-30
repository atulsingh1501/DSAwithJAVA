package loOps;

import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i <= 1; i--){
            n = n * (n-1)*(n-2);
            System.out.println(n);
        }
    }

}
