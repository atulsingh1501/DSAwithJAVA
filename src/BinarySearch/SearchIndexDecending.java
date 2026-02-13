package BinarySearch;

public class SearchIndexDecending {
    public static void main(String[] args) {
        int[] arr = {90,75,18,12,6,4,3,1};
        int target = 75;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            // Descending order logic
            if(target > arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
