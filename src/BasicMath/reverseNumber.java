package BasicMath;

public class reverseNumber {
    public static void main(String[] args) {
        int n = 242342314;
        int rev = 0;
        while(n>0){
                int digit = n % 10;
                rev = rev * 10 + digit; // rember
                n = n / 10;
            }
            System.out.println(rev);
        }
    }

