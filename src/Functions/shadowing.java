package Functions;

public class shadowing {
    static int x =500; //this will be shadowed
    public static void main(String[] args) {
        int x = 10; // shadows static x
        System.out.println(x); // prints 10
//“If two variables have the same name, the one in the closest scope wins. The outer one gets shadowed.”
    }

}
