package Conditions;
import java.util.Scanner;
public class multipleIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        if (salary > 50000) {
            salary = salary + 10000;
        }else if (salary < 50000) {
            salary = salary + 5000;
        }else {
            System.out.println("no increment");
        }
        System.out.println("now you salary is: " + salary);
    }
}
