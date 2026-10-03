package StringBuilder;
/*What is toString() in Java?

toString() is a method that converts an object into a String representation — basically, it tells Java:

"When you want to represent this object as text, this is what you should show."*/

class Students {

    String name;
    int age;
    double gpa;

    Students(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    /*@Override means: "I am replacing the version of this method that I inherited from the parent class."*/
    public String toString() {
        return "Name: " + name +
                ", Age: " + age +
                ", GPA: " + gpa;
    }
}


public class toString {
    public static void main(String[] args) {

        Students student1 = new Students("Atul", 22, 6.5);

        System.out.println(student1);
    }
}
