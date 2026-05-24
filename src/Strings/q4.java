package Strings;

public class q4 {
    public static void main(String[] args) {
        //Reverse a string
        String str = "Atulya";
        String reverse = "";
        for(int i = str.length()-1;i>=0;i-- ){
            char ch = str.charAt(i);
            reverse = reverse + ch;

        }
        System.out.println(reverse);
    }
}
