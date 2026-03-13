package linearSearch.Rivision;

public class FindTarget {
    public static void main(String[] args) {
        int []arr = {11,15,16,18,20,21,24};
        System.out.println(sum(arr));
    }
    static int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%3==0){
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}
