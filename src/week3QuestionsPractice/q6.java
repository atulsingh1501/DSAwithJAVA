package week3QuestionsPractice;
import java.util.Arrays;
public class q6 {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
//Answer without code:
//
//What is printed when i = 2?
//
//Why do we use i < arr.length and not <=?
//Index starts from 0
//
//Last valid index = arr.length - 1
//
//If you write i <= arr.length, Java will try to access
//arr[arr.length] ❌ → ArrayIndexOutOfBoundsException
//
//So yes — we try to access an element that doesn’t exist.