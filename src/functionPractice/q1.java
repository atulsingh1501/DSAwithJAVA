package functionPractice;
import java.util.Scanner;
public class q1 {
    void num(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        q1 obj = new q1();
        obj.num(n);
    }
}
