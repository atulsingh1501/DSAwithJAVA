package Functions;

public class varArgument {
    public static void main(String[] args) {
        sum();                 // prints 0
        sum(5);                // prints 5
        sum(1, 2, 3);          // prints 6
        sum(10, 20, 30, 40);   // prints 100

        greet("Atul");
        greet("Atul", "Rohit", "Sahil");


    }
//Variable Arguments (varargs) in Java let you pass 0, 1, or unlimited arguments to a method without overloading 10 versions of it.
    static void sum(int... nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        System.out.println(total);
    }
    static void greet(String... names) {
        for (String n : names) {
            System.out.println("Hello " + n);
//            Varargs allow a method to accept unlimited arguments, treated internally as an array.
        }
    }

}
