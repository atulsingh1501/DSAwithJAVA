package BasicMath;
import java.util.*;
public class printDigit {
    static void printDigit(int n) {
        while (n > 0) {
            int digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }
    }
    public static void main(String[] args) {
        int n = 8765858;
        printDigit(n);

//        int n = 53127;
////        for(int i =0;i<n;i++)
//        while(n>0){
//         int digit = n % 10;
//            System.out.println(digit);
//            n = n/10;
        }
    }

