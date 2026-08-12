package impactQuestions;

// 6. Abstract Class Shape

abstract class Shape {

    abstract void area();
}

class Circle extends Shape {

    void area() {

        int r = 5;

        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {

    void area() {

        int l = 4, b = 6;

        System.out.println("Area of Rectangle: " + (l * b));
    }
}

public class newq6 {

    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.area();
        r.area();
    }
}