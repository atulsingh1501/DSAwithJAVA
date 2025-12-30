package Functions;

public class swapFunction {
//swaping number in function
    public static void main(String[] args) {
        int[] arr = {5, 30};
        swap(arr);
        System.out.println(arr[0] + " " + arr[1]); // 30 5
    }

    static void swap(int[] a) {
        int tmp = a[0];
        a[0] = a[1];
        a[1] = tmp;
    }
}
