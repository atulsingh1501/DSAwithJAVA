package Array.revision;

public class q5 {
    //find the min in array
    public static void main(String[]args) {
        int[] arr = {3, 2, -5, 21, 10};
        int min = arr[0];
        for(int i = 0; i <= arr.length - 1;i++){
            if(arr[i]<min){
                min =arr[i];
            }
        }
        System.out.println(min);
    }
}
