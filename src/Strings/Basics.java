package Strings;

public class Basics {
    public static void main(String[] args) {
        String name1 = "Atul";
        String name2= "Hina";

        if(name1 == name2){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Both stringh are not equal");
        }
        //comparison string
        String txt1 = "Hello";
        String txt2 = "Hello";

        String txt3 = "Greetings";
        String txt4 = "Great things";
        System.out.println(txt1.equals(txt2));  // true
        System.out.println(txt3.equals(txt4));
    }
}
