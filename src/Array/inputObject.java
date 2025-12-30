package Array;

import java.util.Arrays;
import java.util.Scanner;

public class inputObject {
//    array of object or non primitive
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
