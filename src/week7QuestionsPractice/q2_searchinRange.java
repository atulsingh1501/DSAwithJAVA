package week7QuestionsPractice;

public class q2_searchinRange {
        public static void main(String[] args) {
            int[] arr = {5, 3, 7, 1, 9};
            int target = 3;

            int start = 1;
            int end = 4;

            int result = -1;

            for (int i = start; i <= end; i++) {
                if (arr[i] == target) {
                    result = i;
                    break;
                }
            }

            System.out.println(result);
        }
}


