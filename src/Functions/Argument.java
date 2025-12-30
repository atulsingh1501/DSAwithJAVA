package Functions;

public class Argument {
    // 'a' and 'b' are parameters
    static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        int ans = sum(20,30);//In sum(20, 30) the arguments are 20 and 30.
        System.out.println(ans);

        int ans2 = sum(200,30);//In sum(200, 30) the arguments are 200 and 30.
        System.out.println(ans2);
    }

}
