package LeetCode;

public class q1 {
            public static void main(String[] args) {

                int n = 10; // number of terms to print

                int a = 0, b = 1;

                System.out.print(a + " " + b + " ");

                for (int i = 3; i <= n; i++) {
                    int c = a + b;
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                }
            }
        }


//LeetCode 509 – Fibonacci Number
//
//Problem:
//Given n, return the nᵗʰ Fibonacci number.
//
//Fibonacci rule:
//F(0) = 0
//F(1) = 1
//F(n) = F(n-1) + F(n-2)
//
//Example:
//n = 4 → 3
//(sequence: 0 1 1 2 3)

//class Solution {
//    public int fib(int n) {
//        if (n == 0) return 0;
//        if (n == 1) return 1;
//
//        int a = 0, b = 1;
//
//        for (int i = 2; i <= n; i++) {
//            int c = a + b;
//            a = b;
//            b = c;
//        }
//
//        return b;
//    }
//}