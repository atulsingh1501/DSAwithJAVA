package Sorting;

import java.util.Arrays;

public class O1_cyclicSortFunction {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSOrt(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSOrt(int[]num){
        int i = 0;
        while(i<num.length){
            int correctIndex = num[i] - 1;
            if(num[i]!=num[correctIndex]){
                swap(num, i, correctIndex);
            }else{
                i++;
            }
        }

    }
    static void swap(int[] num, int first, int second){
        int temp = num[first];
        num[first] = num[second];
        num[second] = temp;


    }
}
