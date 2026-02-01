public class q3_minElement {
    public static void main(String[] args) {
        int [] arr = {18,12,3,14,28};

        int min = arr[0];// correct way

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Minimum element is " + min);
    }
}
