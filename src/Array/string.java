package Array;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {

        String[] names = {
                "apple", "banana", "mango", "orange", "grapes",
                "papaya", "kiwi", "pineapple", "guava", "peach","Atul"
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to search: ");
        String input = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(input)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("String is present in the array");
        } else {
            System.out.println("String is NOT present in the array");
        }

        sc.close();
    }
}
