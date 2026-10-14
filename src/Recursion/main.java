package Recursion;

public class main {
    static void message(){
        System.out.println("Hello duniya");
        message1();
    }
    static void message1(){
        System.out.println("Hello duniya");
        message2();
    }
    static void message2(){
        System.out.println("Hello duniya");
        message3();
    }
    static void message3(){
        System.out.println("Hello duniya");
        message4();
    }
    static void message4(){
        System.out.println("Hello duniya");
    }
    public static void main(String[] args) {
       message();
    }
}

