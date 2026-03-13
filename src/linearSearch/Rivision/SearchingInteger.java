package linearSearch.Rivision;
import java.util.Scanner;
public class SearchingInteger {
    static boolean check(int[]arr,int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr  = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.println(check(arr,m));
    }
}
