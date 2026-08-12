package QuestionPractice.Week1Restart;

public class q5 {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        int num = 10;

        boolean result = isEven(num);

        System.out.println(result);
    }
}
