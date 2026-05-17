package Array.revision;

import java.util.Scanner;

class takingIO {
    public static void main(String[] args) {

        int arr[][] = new int[3][4];

        Scanner sc = new Scanner(System.in);

        // input
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.println("Provide value for row = " + i + " and column = " + j);

                arr[i][j] = sc.nextInt();
            }
        }

        // print
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}