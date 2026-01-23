package week5QuestionsPractice;

public class q7SumAll {
    //Find the sum of all elements in an array
        public static void main(String[] args) {
            int[] arr = {2, 4, 6, 8};

            int sum = 0;

            for (int num : arr) {
                sum += num;
            }

            System.out.println("Sum = " + sum);
        }
    }

