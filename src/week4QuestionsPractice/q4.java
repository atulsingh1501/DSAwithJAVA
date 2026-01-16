package week4QuestionsPractice;

public class q4 {
    public static void main(String[] args) {

        int[][] arr = {
                {2, 5, 8},
                {1, 4, 7},
                {6, 9, 10}
        };

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    count++;
                }
            }
        }

        System.out.println("Total even numbers = " + count);
    }
}
