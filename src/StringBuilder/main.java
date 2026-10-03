package StringBuilder;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        String a = "Atul Singh";
        String b = "Atul Singh";
         a = a + " Rajput"; // here the original string is samee Atul Singh(unchnaged) Atul Singh Rajput is a new String
        // now the variable (a) is made to point to new object beacuse string is  immutable
        // we cant change the  orignal string object we just create a another new object and point that object  inside string pool of heap
        System.out.println(a);

        System.out.println(a==b); //a and b are points to same object inside the string pool and
        // string pool is a special area inside the jvm heap


        String s = new String("Atul Singh"); //it is not inside the heap string pool we are creating a different object inside  the normal heap
        String name  = new String("Atul Singh");

        System.out.println(a==s); // == check refrence {"Are a and s referring to the exact same object? false"}

        System.out.println(b.equals(s)); //.equals check contents of the Strings {"Do these two String objects contain the same characters? ture"}
        System.out.println(a.equals(s));
        System.out.println(s.equals(name));
    }
}
