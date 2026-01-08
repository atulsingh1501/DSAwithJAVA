package week3QuestionsPractice;
import java.util.Arrays;
public class q8 {
    public static void main(String[] args) {
//        Find the maximum element in an array
        int [] arr = {3,7,2,9,4};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
