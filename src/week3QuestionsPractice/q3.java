package week3QuestionsPractice;
import java.util.Scanner;
import java.util.Arrays;
public class q3 {
    public static void main(String[] args) {
        int[] arr = {5,10,15,25,30};
        call(arr);
        }
        static void call(int[] arr){
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
        }
    }

////   package week3QuestionsPractice;
//
// No Scanner is needed here because we are not taking input from user
// Arrays import is also not needed now, but it's okay to remove later
//
//// public class q3 {
//
//     main() is the starting point of the program
////  public static void main(String[] args) {
//
//         Creating an integer array with 5 elements
//        Index positions: 0  1   2   3   4
//         Values:         5 10  15  25  30
////       int[] arr = {5, 10, 15, 25, 30};
//
//         Calling the function 'call'
//         We are passing the array 'arr' to the function
//         The function will receive this array and print its elements
////        call(arr);
//    }
//
//    // This function takes an integer array as parameter
//    // It does not return anything (void)
////    static void call(int[] arr) {
//
//        // Loop starts from index 0 (first element)
//        // Loop runs until i is less than arr.length
//        // arr.length gives total number of elements in array
////        for (int i = 0; i < arr.length; i++) {
//
//            // Printing the element at index i
//            // First iteration: arr[0] → 5
//            // Second iteration: arr[1] → 10
//            // and so on...
////           System.out.println(arr[i]);
//        }
//    }
//}
