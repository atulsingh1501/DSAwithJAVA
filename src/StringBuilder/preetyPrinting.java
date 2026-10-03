package StringBuilder;


public class preetyPrinting {


    public static void main(String[] args) {

        String name = "Atul";
        int age = 22;
        double gpa = 6.5;
        char grade = 'A';
        boolean passed = true;

        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("GPA: %.2f%n", gpa);
        System.out.printf("Grade: %c%n", grade);
        System.out.printf("Passed: %b%n", passed);
    }
}