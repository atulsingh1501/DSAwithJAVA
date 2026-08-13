package Sorting;
import java.util.*;
public class O1_selectionSort {
    public static void main(String[] args) {

        int [] arr = {5,23,1,8,98,69,58};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;


        }
        System.out.println(Arrays.toString(arr));
    }
}
