package Array.revision;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
         int arr[]; //allocation
        arr = new int[5]; //init
        int brr[] = {1,2,3}; //declaration
        System.out.println("value at index 1 is " + brr[1]);
//        String[] cars = {"BMW" ,"indigo" ,"alto"};
//        System.out.println(Arrays.toString(brr));// for printing whole arrya at once
        for(int i = 0; i <= brr.length - 1;i++){
            System.out.println(brr[i]);
        }
        // short form
        for(int val:brr){
            System.out.println(val);
        }

    }
}
