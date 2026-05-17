package Array.revision;

public class MaxValue2DArray {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3},
                {3,4,5},
                {4,5,6,8}
        };
        int max = arr[0][0];

        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                if(arr[i][j]>max)
                    //update max
                    max = arr[i][j];
            }
        }
        System.out.println(max);
    }
}
