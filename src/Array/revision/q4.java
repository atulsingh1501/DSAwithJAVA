package Array.revision;

public class q4 {
    public static void main(String[] args) {
       //find the max value
        int arr[] = {4,2,-5,21,15};
        int max = arr[0] ;
        for(int i = 0; i <= arr.length -1 ;i++){
            if(arr[i]>max){

                max = arr[i];
            }
        }
        System.out.println(max);


    }
}
