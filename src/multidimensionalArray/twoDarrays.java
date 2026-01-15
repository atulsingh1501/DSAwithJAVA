package multidimensionalArray;
import java.util.Arrays;
public class twoDarrays {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = arr.length;        // number of rows
        int m = arr[0].length;     // number of columns

        for (int i = 0; i < n; i++) {     // loop for rows
            int sum = 0;                  // reset sum for each row

            for (int j = 0; j < m; j++) { // loop for columns
                sum = sum + arr[i][j];
            }

            System.out.println("Row " + (i + 1) + " sum = " + sum);
        }
    }
}

//What is a Multidimensional Array?
//
//A multidimensional array is basically an array of arrays.
//Most commonly, you’ll see a 2D array (rows × columns), like a table / matrix.
////Declaration
//int[][] arr;
////Initialization
// int[][] arr = {
//    {1, 2, 3},
//    {4, 5, 6}
//};
////This looks like:
//
//1  2  3
//4  5  6
//
//
//2 rows
//
//3 columns