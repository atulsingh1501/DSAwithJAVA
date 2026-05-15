package Array.revision;

public class q2 {
    public static void main(String[] args) {
        //add the every element of array and print their sum
        int arr[] = {10,20,20,22,28};
        int sum = 0;
        for(int i = 0; i <= arr.length-1;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
