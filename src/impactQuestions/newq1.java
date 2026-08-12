package impactQuestions;

public class newq1 {

    int id;
    String name;
    float marks;

    newq1(int i, String n, float m) {
        id = i;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {

        newq1 s1 = new newq1(101, "Atul", 89.5f);

        s1.display();
    }
}