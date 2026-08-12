package QuestionPractice.week5QuestionsPractice;

public class q2 {

    static int countEven(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7};

        int result = countEven(arr);
        System.out.println("Even numbers count: " + result);
    }
}
//Question: Count Even Numbers in an Array
//
//Problem statement:
//Given an integer array arr, count how many even numbers are present in it.
// same questoion but in the for of creting new function