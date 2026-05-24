package impactQuestions;

public class q2 {
//    Write a Java program to check if a string is a palindrome.
public static void main(String[] args) {
    String str = "madam";
    String rev = "";
    for (int i = str.length() - 1; i >= 0; i--) {
        rev = rev + str.charAt(i);
    }
    if (str.equals(rev)) {
        System.out.println("Palindrome");
    } else {
        System.out.println("Not Palindrome");
    }
}
}


