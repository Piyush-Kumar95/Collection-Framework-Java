import java.util.Stack;

public class Stack_Demo {
    public static void main(String[] args) {

        Stack s = new Stack();

// Add Element in Stack

        s.push(10);
        s.push("Jone");
        s.push(50);
        s.push("Ram");
        s.push(60);
        s.push("Bob");

        System.out.println("Stack Element : "+s);

// Pop the Element

        s.pop();
        System.out.println("Pop First Element : "+s);

// Peek The Element

        System.out.println("Peek First Element : "+s.peek());

// Search of Element

        System.out.println("Ram is Index No : " + s.search("Ram"));

// Check Empty

        System.out.println("Check Empty : "+s.empty());

// Check Contains

        System.out.println("Jone is Present In Stack : "+s.contains("Jone"));

// Clear  All  Element
        s.clear();
        System.out.println("Remove All Element : "+s);
   }
}
