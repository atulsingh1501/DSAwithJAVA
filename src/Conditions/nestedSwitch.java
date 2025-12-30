package Conditions;
import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day =  sc.nextInt(); // 1 = Monday
        int time = sc.nextInt();  // 1 = Morning, 2 = Evening

        switch (day) {
            case 1:
                System.out.println("Monday");

                switch (time) {
                    case 1:
                        System.out.println("Good Morning");
                        break;
                    case 2:
                        System.out.println("Good Evening");
                        break;
                }
                break;
        }
    }
}