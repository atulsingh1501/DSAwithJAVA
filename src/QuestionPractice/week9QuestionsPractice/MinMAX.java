package QuestionPractice.week9QuestionsPractice;

public class MinMAX {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 45, 76, 7, 9,};
        minMax(arr);
    }

    static void minMax(int[] arr) {
        int l = arr[0];
        int s = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > l) {
                l = arr[i];
            } else if (arr[i] < s) {
                s = arr[i];
            }
        }

        System.out.println("Largest: " + l);
        System.out.println("Smallest: " + s);
    }
}