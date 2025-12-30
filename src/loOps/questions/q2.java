package loOps.questions;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
//        check weather it is upper case or lower case
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
//        .trim()means remove all the extra spaces at the end of these word
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("lower acse");
        }else{
            System.out.println("upper acse");
        }
    }
}
