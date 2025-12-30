package loOps;
import java.util.Scanner;
public class forLoop {
    public static void main(String[] args) {
//        print a number from 1 to n
     Scanner input = new Scanner(System.in);
     int n = input.nextInt();
     for(int num = 1; num <= n; num++){
         System.out.println( num + " ");
     }
    }
}
