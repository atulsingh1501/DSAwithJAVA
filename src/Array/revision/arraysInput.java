package Array.revision;
import java.util.Scanner;

public class arraysInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        for(int i = 0; i<= arr.length-1;i++){
            arr[i]= sc.nextInt();
        }
        for(int i = 0; i <= arr.length - 1;i++){
            System.out.println(arr[i]);
        }
//        for(int i = 0; i < arr.length; i++){
//            arr[i]= sc.nextInt();
//
//        }
//        for(int i = 0;i < arr.length; i++){
//         System.out.println(arr[i] + " ");
//       }

    }
}