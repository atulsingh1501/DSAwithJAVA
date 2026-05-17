package Array.revision;

public class twoDArrays {
    public static void main(String[] args) {
        int[][] arr;//decalration
        arr = new int[3][4];//alloction
        int[][] brr = {
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5}
        };//init
//        System.out.println(brr[3][1]);
        int rowLength = brr.length;
        int colLength = brr[0].length;
        for(int i = 0; i<=brr.length-1; i++){
            for(int j = 0; j <= brr[0].length-1; j++){
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
