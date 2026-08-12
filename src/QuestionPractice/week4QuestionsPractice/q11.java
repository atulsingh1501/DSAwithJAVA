package QuestionPractice.week4QuestionsPractice;
import java.util.Scanner;
public class q11 {
//    Task:
//
//Take a number from user
//
//Print "Even" if divisible by 2
//
//Else print "Odd"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        sc.close();
    }
}
