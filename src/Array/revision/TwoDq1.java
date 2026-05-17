package Array.revision;
import java.util.Scanner;
public class TwoDq1 {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3},
                {3,4,5},
                {4,5,6,8}
        };
        int sum = 0;

        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr.length;j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
