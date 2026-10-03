package Array.Revision2;

public class findSum {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 25, 9, 3};
        System.out.println(findSum(arr));
    }
    static int findSum(int []num){
        int sum = 0;
        for (int i = 0; i < num.length; i++){
            sum = sum + num[i];
        }
        return sum;
    }
}
