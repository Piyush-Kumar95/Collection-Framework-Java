import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector v = new Vector();

// Add Element

        v.add(10);
        v.add("Jone");
        v.add(20);
        v.addElement("Bob");

        System.out.println("Vector Element : "+v);

// Add First And Last Element

        v.addFirst("Manu");
        v.addLast(30);

        System.out.println("Add First and Last Element : "+v);

// Get First And Last Element

        System.out.println("Get First Element : "+v.getFirst());
        System.out.println("Get Last Element : "+v.getLast());

//  Get Any Element

        System.out.println("Get Element 3 Index No : "+v.get(3));

// Set Element Any Index Number

        v.set(2,555);
        System.out.println("Set Element 2 Index No : "+v);

// Check Capacity

        System.out.println("Check Capacity : " +v.capacity());

// Remove First And Last Element

        v.removeFirst();
        v.removeLast();
        System.out.println("Remove First And Last Element : "+v);

// Remove Any Element By Element  Name

        v.remove("Bob");
        System.out.println("Remove Bob Element : "+v);

// Remove Any Element By Index Number

        v.remove(1);
        System.out.println("Remove 1 index No : "+v);

// Clear
        v.clear();
        System.out.println("Remove All Element : "+v);


     }
}
