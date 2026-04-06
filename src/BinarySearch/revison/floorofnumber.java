package BinarySearch.revison;

public class floorofnumber {

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target<arr[start]){
            return - 1;
        }
        while(start<= end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return end;

    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 10;

        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}