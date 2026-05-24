package impactQuestions;

public class q1 {
    public static void main(String[] args) {
//        Write a Java program to reverse a given string

                String str = "hello";
                String rev = "";

                for(int i = str.length() - 1; i >= 0; i--) {
                    rev = rev + str.charAt(i);
                }
                System.out.println("Reversed String: " + rev);
    }
}
