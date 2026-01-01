package functionPractice;

public class q3 {
        public class CountDigits {

            static int countDigits(int n) {
                int count = 0;

                if (n == 0) {
                    return 1;
                }

                while (n != 0) {
                    n = n / 10;
                    count++;
                }

                return count;
            }

            public static void main(String[] args) {
                int result = countDigits(9080);
                System.out.println(result);
            }
        }

}

