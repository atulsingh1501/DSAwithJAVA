package linearSearch;

public class Searching {
    public static void main(String[] args) {
        int [] arr = {5, 10, 15,36,86,19,61,69,20};
        int target = 77;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    //search in the array:return the index if item found
    static int search(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
    }

