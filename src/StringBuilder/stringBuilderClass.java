package StringBuilder;

public class stringBuilderClass {
    public static void main(String[] args) {
//StringBuilder is a Java class used to create and modify strings efficiently. and it is mutable
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println(sb);
        // Output: Hello World

        // Change a character
        sb.setCharAt(0, 'Y');
        System.out.println(sb);
        // Output: Yello World

        // Delete a character
        sb.deleteCharAt(1);
        System.out.println(sb);
        // Output: Yllo World

        // Reverse the StringBuilder important
        sb.reverse();
        System.out.println(sb);
        // Output: dlroW ollY

        // Convert StringBuilder to String
        String result = sb.toString();

        System.out.println(result);
    }
}
//StringBuilder sb = new StringBuilder("Hello");
//                 ↓
//              Creates object
//
//sb.append(" World");    → Add
//sb.setCharAt(0, 'Y');   → Change
//sb.deleteCharAt(1);     → Delete
//sb.reverse();           → Reverse
//sb.toString();          → Convert to String/