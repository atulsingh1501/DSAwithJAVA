package Conditions;
import java.util.Scanner;
public class ifCond {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int salary = sc.nextInt();
       if(salary >= 5000){
           salary = salary + 2000;
       }else{
           salary = salary + 1000;

       }
        System.out.println("your new salary is: " + salary);
    }
}
