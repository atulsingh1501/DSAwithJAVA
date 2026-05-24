package impactQuestions;

public class q3 {
    public static void main(String[] args) {
//        Write a Java program to count the number of vowels in a string.
        String str = "education";
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Vowels: " + count);
    }
}
