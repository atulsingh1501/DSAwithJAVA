package BinarySearch;

public class binarySearch {
    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        int target = 14;

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == target){
                System.out.println("Found at index: " + mid);
                return;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        System.out.println("Not found");
    }
}
