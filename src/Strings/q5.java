package Strings;

public class q5 {

    // check palindrome
    public static void main(String[] args) {

        String str = "NOON";
        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--){

            char ch = str.charAt(i);

            reverse = reverse + ch;
        }

        if(str.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }


        int l = 0,r=str.length()-1;
        boolean p=true;
        while (l<r){
            if(str.charAt(l) == str.charAt(r)){
                l++;
                r--;
            }else {
                p=false;
                break;
            }
        }
        if(p){
            System.out.println("PAL");
        }else{
            System.out.println("not");
        }
    }
}