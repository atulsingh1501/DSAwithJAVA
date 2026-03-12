package Week1Restart;

import java.util.Scanner;

public class q6 {
    static int square(int n){
        int a = n *n;
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S_n = square(n);
        System.out.println(S_n);
    }
}
