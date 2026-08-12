package TwoDArrayBinarySearch;
import java.util.*;
public class SearchinginMatrix {
    public static void main(String[] args) {
//        int [][]arr = {
//                {10,20,30,40},
//                {15,25,35,45},
//                {28,29,37,49},
//                {33,34,38,50}};
//       int target = 37;
//       for(int i =0;i<arr.length;i++){
//           for(int j = 0;j<arr[i].length;j++){
//               if(arr[i][j] == target){
//                       System.out.println("Found at row = " + i + ", col = " + j);
//                       return;
//               }
//           }
//       }this is not optimised o(n*m) is time complexity
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        int target = 37;

        int[] ans = search(arr, target);

        System.out.println("Row = " + ans[0] + ", Col = " + ans[1]);
    }

    static int[] search(int[][] matrix, int target) {

        int r = 0;
        int c = matrix[0].length - 1; // top-right corner

        while (r < matrix.length && c >= 0) {

            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }

            if (matrix[r][c] < target) {
                r++; // move down
            } else {
                c--; // move left
            }
        }

        return new int[]{-1, -1}; // target not found
    }
}
