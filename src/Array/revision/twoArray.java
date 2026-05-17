package Array.revision;

public class twoArray {
    public static void main(String[] args) {
        int[][] brr = {
                {1,2},
                {2,3,4,5},
                {3,4,4,5,6,7},
                {4}
        };//jaked array
        for(int i = 0;i<brr.length;i++){
            for(int j = 0;j<brr[i].length;j++){
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
