package loOps.questions;

import java.util.Scanner;
// find nth fibanaci number
public class q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // ✅ Edge cases (VERY IMPORTANT)
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }

        int a = 0;     // F(0)
        int b = 1;     // F(1)
        int c;         // Next Fibonacci
//        for (int i = 2; i<=n;i++){
//        c = a + b;
//        a = b;
//        b = c;
//        }
        int count = 2;

        while (count <= n) {
            c = a + b;   // next fib
            a = b;       // purana b  ab new a ho gaya
            b = c;       // naya calulated C ab naya b ban gaya
            count++;
        }

        System.out.println(b);  // ✅ Correct F(n)
    }
}
