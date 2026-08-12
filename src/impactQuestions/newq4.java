package impactQuestions;

// 4. Method Overriding

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

public class newq4 extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {

        newq4 d = new newq4();

        d.sound();
    }
}