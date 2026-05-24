package impactQuestions;

public class q4 {
    public static void main(String[] args) {
//        Write a Java program to find the length of the longest word in a string.
        String str = "Java is very powerful";
        String[] words = str.split(" ");

        int max = 0;

        for(String word : words) {

            if(word.length() > max) {
                max = word.length();
            }
        }
        System.out.println("Longest Length: " + max);
    }
}
