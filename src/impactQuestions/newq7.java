package impactQuestions;

// 7. Interface Implementation

interface Printable {

    void print();
}

public class    newq7 implements Printable {

    public void print() {

        System.out.println("Printing...");
    }

    public static void main(String[] args) {

        newq7 d = new newq7();

        d.print();
    }
}