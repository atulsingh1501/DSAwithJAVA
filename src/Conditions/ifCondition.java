package Conditions;
import java.util.Scanner;
public class ifCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        if(age > 18) {
            System.out.println("You are too adult");
        }else{
               System.out.println("You are too young");
           }

        }
    }
