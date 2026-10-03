package Array.Revision2;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 25, 9, 3};
        int max = arr[0];
        for(int i = 0; i< arr.length;i++){
          if(arr[i]>max){
              max = arr[i];
          }
        }
        System.out.println(max);
    }
}
