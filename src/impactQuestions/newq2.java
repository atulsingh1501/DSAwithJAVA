package impactQuestions;

public class newq2 {
    // 2. Default and Parameterized Constructor

        int id;
        String name;

        newq2() {
            id = 0;
            name = "Default";
        }

        newq2(int i, String n) {
            id = i;
            name = n;
        }

        void display() {
            System.out.println(id + " " + name);
        }

        public static void main(String[] args) {

            newq2 e1 = new newq2();
            newq2 e2 = new newq2(101, "Rahul");

            e1.display();
            e2.display();
        }
    }

