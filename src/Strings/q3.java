package Strings;

public class q3 {
    static int getVowelsCount(String str){
        int count = 0;
        for(int i = 0 ; i< str.length();i++ ){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o'  || ch == 'o'){
                count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "hina modhvadiya";
        System.out.println(getVowelsCount(str));
    }
}
