package loOps.questions;

//find  how many times the 3 is occuring in n = 13839
public class q5 {
    public static void main(String[] args) {
        int n = 1333333839;
        int count = 0;
        while (n>0) {
            int rem = n%10;
            if (rem==3)
                count++;
            n/=10;
        }
        System.out.println(count);
    }
}
