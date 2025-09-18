import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {

        LinkedList lList = new LinkedList();
        
// Add Element

        lList.add(10);
        lList.add(20);
        lList.add(30);
        lList.add("Piyush");
        lList.add("Raju");

        System.out.println("LinkedList Data : "+lList);

// Add First and Last Element

        lList.addFirst("Ram");
        lList.addLast(40);
        System.out.println("After Add Fast and Last Data :"+lList);

// Get First and Last Element

        System.out.println("Get First Element :"+lList.getFirst());
        System.out.println("Get Last Element :"+lList.getLast());

// Get Element Any Index Position

        System.out.println("Get Element Index Num 4 : "+lList.get(4));

// Set the Element in LinkedList

        lList.set(2,"4546");
        System.out.println("Set Element Index Num 2 : "+lList);

// Remove First and Last Element

        lList.removeFirst();
        lList.removeLast();
        System.out.println("Remove First and Last Element "+lList);

// Size of LinkList

        System.out.println("Size Of LinkedList : "+lList.size());

// Clear the Element

        lList.clear();
        System.out.println("Clear All Element : "+lList);

    }
}
