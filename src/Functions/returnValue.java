package Functions;

public class returnValue {
    public static void main(String[] args) {
        String message = Greet();
        System.out.println(message);
    }
    static String Greet(){
        String greeting = "Good Morning";
        return greeting;
    }
}
