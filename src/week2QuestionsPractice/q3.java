package week2QuestionsPractice;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%3==0){
                sum = sum+i;
            }
        }
        System.out.println("sum "+sum);
    }
}
