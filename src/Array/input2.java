package Array;
import java.util.Arrays;
import java.util.Scanner;
public class input2 {
    public static void main(String[] args) {
// input using for loops
//        array of primitive
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0;i < arr.length; i++){
            arr[i]= in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//        for(int i = 0;i < arr.length; i++){
//            System.out.println(arr[i] + " ");
//        }
//        for (int num : arr) {// for every element in array,print the element
//            System.out.println(num + " "); //here num represent element in the array
//        }
    }
}
