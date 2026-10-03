package Sorting;

import java.util.Arrays;

public class O4_cyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        int i = 0;

        while(i < arr.length){

            int correctIndex = arr[i] - 1;

            if(arr[i] !=arr[correctIndex] ) {

                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
