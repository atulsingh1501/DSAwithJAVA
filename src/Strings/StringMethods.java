package Strings;

public class StringMethods {
    public static void main(String[] args) {
        String txt = "Hello World";
        System.out.println("Length of the String is :- " + txt.length());
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"
        System.out.println(txt.indexOf("World"));//The indexOf() method returns the index (the position)
        // of the first occurrence of a specified text in a string (including whitespace)
        System.out.println(txt.charAt(0));// character at a specific position in a string
        System.out.println(txt.charAt(4));  // character at a specific position in a string

        String name = "  Hina  ";
        System.out.println("Before: [" + name + "]");//The trim() method removes whitespace
        System.out.println("After:  [" + name.trim() + "]");// // from the beginning and the end of a string:

        //To compare two strings, you can use the equals() method:
        String txt1 = "Hello";
        String txt2 = "Hello";

        String txt3 = "Greetings";
        String txt4 = "Great things";
//case sensetive
        System.out.println(txt1.equals(txt2));  // true
        System.out.println(txt3.equals(txt4));  // false
        System.out.println(txt1.equalsIgnoreCase(txt2));//not case sensetive
    }
}
