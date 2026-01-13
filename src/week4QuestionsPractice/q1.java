package week4QuestionsPractice;
//Write a function that takes an array of integers and prints all even numbers from the array.
//
//Example:
//Input: [1, 4, 7, 8, 10]
//Output: 4 8 10
//
//👉 Focus: for loop + array traversal + if
import java.util.Arrays;
public class q1 {
    public static void main(String[] args) {
        int [] Array={1,4,7,8,10};
        for(int i=0;i<Array.length;i++){
            if(Array[i]%2==0){
                System.out.println(Array[i]);
            }
        }
    }
}
