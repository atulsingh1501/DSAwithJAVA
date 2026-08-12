package QuestionPractice.week6QuestionPractice;

public class O1_linearSearch {
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {5, 8, 12, 20, 35};
        int target = 20;

        int result = linearSearch(arr, target);

        System.out.println(result);
    }
}
