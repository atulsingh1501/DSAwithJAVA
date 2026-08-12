package QuestionPractice.Week1Restart;

import java.util.Scanner;

public class GradePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mark = input.nextInt();
        if(mark >=90){
            System.out.println("A");
        }else if(mark >=75 ){
            System.out.println("B");
        }else if(mark >=50 ){
            System.out.println("C");
        }else{
            System.out.println("fail");
        }
    }
}
