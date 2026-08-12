package impactQuestions;
// 3. Single Inheritance

class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}

public class newq3 extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }

    public static void main(String[] args) {

        newq3 c = new newq3();

        c.start();
        c.drive();
    }
}
