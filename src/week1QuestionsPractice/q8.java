package week1QuestionsPractice;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if(a>b){
            System.out.println(a);
        }else if(b>a){
            System.out.println(b);
        }else {
            System.out.println(a);
        }
    }
}
