package BasicMath;
import java.util.*;
public class countDigit {
//    static int countdigit(int n){
//        int count = 0;
//        while(n>0){
//            int digit = n % 10;
//            count++;
//            n = n / 10;
//        }
//        return count;
//    }

    public static void main(String[] args) {
        int n = 3123213;
//        int ans = countdigit(n);
//        System.out.println(ans);
        int count = 0;
        while(n>0){
            int digit = n % 10;
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
