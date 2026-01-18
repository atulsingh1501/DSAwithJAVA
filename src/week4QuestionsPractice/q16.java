package week4QuestionsPractice;
import java.util.Scanner;
public class q16 {
    static int maxNum(int a, int b){
        if(a>b){
            return a;
        }else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int max = maxNum(a,b);
        System.out.println(max);

        input.close();
    }
}
