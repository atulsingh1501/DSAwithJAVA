package week7QuestionsPractice;

import java.util.Arrays;

public class q3_minEelFunc {
    public static void main(String[] args) {
        int [] arr = {18,12,-7,3,14,28};
        int ans = minEL(arr);
        System.out.println(ans);
    }
    static int minEL(int [] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
