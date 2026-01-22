package DynamicArray;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {

        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
       list.add(67);
       list.add(3445);
       list.add(6653);
       list.add(6653);
       list.add(53);
       list.add(6623);
       list.add(626);
       list.add(646);
       list.add(626);
       list.add(664);
       list.add(667);
       list.add(6645);

/*
An ArrayList in Java is a resizable array implementation of
the List interface, found in the java.util package. Unlike standard,
fixed-size arrays, an ArrayList can dynamically grow or shrink in
size as elements are added or removed during runtime.
 */


        System.out.println(list.contains(654));//for checking conatain--check that the array contain 654 if it contain the it print true else print false
        System.out.println(list.contains(67));
        System.out.println(list);
        list.set(0,99);//for changing value -- index 0 will become 99
        list.remove(2);//for removing element--element at index 2 will remove
        System.out.println(list);



    }
}
