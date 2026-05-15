package Array.revision;

public class q3 {
    public static void main(String[] args) {
        int[]arr = {2,3,10,20};
        int mul = 1;
        for(int i = 0; i <= arr.length - 1; i++){
            mul = mul * arr[i];
        }
        System.out.println(mul);

    }
}
