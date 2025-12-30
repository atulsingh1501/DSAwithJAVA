package loOps.questions;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        find the largest of 3 number
        int max = a;
        if(b>max){
            max = b;
        }if(c>b){
            max = c;
        }else{
            max = a;
        }
        System.out.println("largest num in these 3 is: "+ max);
    }
}
