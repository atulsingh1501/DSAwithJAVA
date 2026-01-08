package week3QuestionsPractice;
import java.util.Arrays;
public class q10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//How loop works (in plain English)
//
//Start from left (i = 0)
//
//Go till middle (i < arr.length / 2)
//
//Swap i with arr.length - 1 - i


//First, forget Java. Imagine people in a line.
//
//Array:
//
//Index:  0  1  2  3
//Value:  A  B  C  D
//
//
//Goal after reverse:
//
//D  C  B  A
//
//What the loop is REALLY doing
//for (int i = 0; i < n / 2; i++)
//
//
//This means:
//
//“I will walk from the left side to the middle only.”
//
//For 4 elements:
//
//n/2 = 2
//
//So i = 0, 1
//
//That’s it. No magic.
//
//Now the confusing part: n - 1 - i
//
//Let’s build it slowly.
//
//n = length of array = 4
//
//Last index = n - 1 = 3
//
//So:
//
//when i = 0 → n - 1 - i = 3
//
//when i = 1 → n - 1 - i = 2
//
//👉 This gives the mirror position from the end.
//
//Think:
//
//i = 0 ↔ 3
//i = 1 ↔ 2
//
//
//That’s all it does.
//
//Now the swap — step by step (NO SKIP)
//i = 0
//temp = arr[0];      // save A
//arr[0] = arr[3];   // put D in place of A
//arr[3] = temp;     // put A in place of D
//
//
//Line becomes:
//
//D  B  C  A
//
//i = 1
//temp = arr[1];      // save B
//arr[1] = arr[2];   // put C in place of B
//arr[2] = temp;     // put B in place of C
//
//
//Line becomes:
//
//D  C  B  A
//
//
//STOP. Middle reached.
//
//Why we STOP at n/2
//
//If we continue:
//
//we will swap again
//
//and undo the reverse
//
//That’s why i < n/2 is critical.
//
//The ONE sentence that kills confusion
//
//“i goes from left, n-1-i goes from right, and we swap them.”
//
//That’s it. Nothing more hidden.