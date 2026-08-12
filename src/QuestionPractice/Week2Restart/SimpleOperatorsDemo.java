package QuestionPractice.Week2Restart;
public class SimpleOperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // Arithmetic Operators
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction

        // Relational Operator
        System.out.println("a > b ? " + (a > b));  // Greater than

        // Logical Operator
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y));  // Logical AND

        // Assignment Operator
        a += 5;  // a = a + 5
        System.out.println("a after += 5 : " + a);

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);
    }
}