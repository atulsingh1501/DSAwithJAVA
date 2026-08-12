package QuestionPractice.week5QuestionsPractice;

public class q1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 7};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Even numbers count: " + count);
    }
}
//Question: Count Even Numbers in an Array
//
//Problem statement:
//Given an integer array arr, count how many even numbers are present in it.