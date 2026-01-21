package multidimensionalArray;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[][] arr = { /* indivisual array have a dofferent size */
//                {1,2,3},//0th index
//                {4,5},//1st index
//                {6,7,8,9}//2nd index-> arr2D[2][0] = {6,7,8,9}
//        };
//input
        int [][] arr = new int [3][3];
        System.out.println(arr.length);
        for(int row = 0; row < arr.length; row++){
            //for each column in every row
            //every array at that row are the length of that array
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        //output
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
