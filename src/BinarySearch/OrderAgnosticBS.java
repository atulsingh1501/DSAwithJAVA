package BinarySearch;
public class OrderAgnosticBS{
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // detect order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // descending
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] asc = {2,4,6,8,10};
        int[] desc = {10,8,6,4,2};

        System.out.println(search(asc, 6));   // 2
        System.out.println(search(desc, 6));  // 2
    }
}
