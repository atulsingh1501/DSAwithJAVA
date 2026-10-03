package Array.Revision2;

public class findminimum {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 25, 9, 3};
        minimum(arr);
    }
    static void minimum(int[]arr){
        int min = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);

    }

}
