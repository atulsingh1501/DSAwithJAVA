package Functions;

public class funcnOverloading {
    public static void main(String[] args) {

        print(10);          // calls int version
        print("Atul");      // calls String version
        print(3.14);        // calls double version
    }

    static void print(int a) {
        System.out.println("int method");
    }

    static void print(String s) {
        System.out.println("String method");
    }

    static void print(double d) {
        System.out.println("double method");
    }
}
