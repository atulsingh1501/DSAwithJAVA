package week2QuestionsPractice;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int totalCount = 0;
        int evenCount = 0;

        for(int i = 1; i<=n; i++){
            System.out.println(i);
            totalCount++;
            if( i % 2 == 0){
               evenCount++;
            }
        }
        System.out.println("total number " + totalCount);
        System.out.println("even number " + evenCount);
    }
}
//🔁 QUESTION 1: Print & Count
//
//Problem
//
//Input: n
//
//Print numbers from 1 to n
//
//Count:
//
//total numbers
//
//even numbers
//
//🔍 How to THINK (this is the key)
//Step 1: What repeats?
//
//Printing numbers from 1 to n → repetition → loop.
//
//Step 2: Loop boundaries
//
//Start: 1
//
//End: n
//
//Step: +1
//
//So loop runs n times.
//
//Step 3: What happens inside loop?
//
//For every number i:
//
//Print i
//
//Increase total count
//
//Check if i is even
//
//Even means: divisible by 2 → remainder 0
//
//If yes → increase even count
//
//Step 4: After loop
//
//Print:
//
//total count (will be n)
//
//even count
//
//👉 Important realization
//Loop controls how many times.
//if controls what condition.
