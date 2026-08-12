package BasicMath;
import java.util.*;
public class q2 {
    //implementing stack using array
    static int[] stack=new int[10];
    static int top=0;
    public static void push(int element){
        stack[top++]=element;
    }
    public static void pop(){
        top--;
    }
    public static void printStack(){
        for (int i=0;i<top;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        printStack();
        pop();
        push(50);
        printStack();
    }
}
