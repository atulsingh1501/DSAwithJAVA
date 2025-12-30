package Functions;

public class greetingAandP {
    static String myGreet(String name){
        String message = "Hello "+name;
        return message;
    }

    public static void main(String[] args) {

       String personalised = myGreet("Atul singh");
        System.out.println(personalised);

    }
}
