package linearSearch;

public class searchRange {
    public static void main(String[] args) {
        int[] arr = {10,2,30,3,5,60,7,80,0,9};
        int target = 3;

        int ans = range(arr, target, 1, 4);
        System.out.println(ans);
    }

    static int range(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
