package LeetCode;
// https://leetcode.com/problems/missing-number/description/
class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,2,1,4};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];

            if (arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        for (i = 0; i < arr.length; i++) {

            if (arr[i] != i) {
                return i;
            }
        }

        return arr.length;

    }

    static void swap(int[] num, int first, int second) {
        int temp = num[first];
        num[first] = num[second];
        num[second] = temp;

    }
}
//leetcode questions like this
//https://leetcode.com/problems/find-the-duplicate-number/description/
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
