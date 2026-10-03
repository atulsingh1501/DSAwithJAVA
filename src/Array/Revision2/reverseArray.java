package Array.Revision2;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.print(Arrays.toString(reverse(arr)));
    }
    static int[] reverse(int[] num){


        for(int i = 0 ; i < num.length/2; i++){
            int right = num.length - 1 - i;
            int temp = num[i];
            num[i] = num[right];
            num[right] = temp;
        }
        return num;
    }
}
