package StringBuilder;

public class printStream {

        public static void main(String[] args) {

            // System is a built-in Java class
            // 'out' is a static PrintStream object inside System
            // println() is a method of PrintStream
            System.out.println("Hello World");


            // Print text
            System.out.print("Hello ");

            // print() does NOT move to the next line
            System.out.print("Atul");


            // println() prints the value
            // and then moves the cursor to the next line
            System.out.println();


            // We can print numbers
            System.out.println(100);

            // We can print calculations
            System.out.println(10 + 20);


            // We can create variables
            String name = "Atul";
            int age = 23;

            // Print the variables
            System.out.println(name);
            System.out.println(age);


            // We can combine text and variables
            System.out.println("My name is " + name);
            System.out.println("My age is " + age);
        }
}
