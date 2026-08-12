package impactQuestions;
import java.util.Scanner;
public class new8 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int[] arr = new int[n];

            // Input array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Count frequency
            for (int i = 0; i < n; i++) {

                int count = 1;
                boolean alreadyCounted = false;

                // Check if element already counted
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        alreadyCounted = true;
                        break;
                    }
                }

                // Skip if already counted
                if (alreadyCounted) {
                    continue;
                }

                // Count occurrences
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }

