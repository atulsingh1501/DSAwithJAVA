package Array.Revision2;

public class countEvenandOdd {

    public static void main(String[] args) {
        int[] arr = {4, 7, 12, 5, 8, 3, 10};
        countEvenOdd(arr);
    }static void countEvenOdd(int[] arr){
        int even = 0;
        int odd = 0;
        for(int i = 0 ;i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }else{
                odd++ ;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}