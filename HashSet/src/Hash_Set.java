import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
    public static void main(String[] args) {

        HashSet hs = new HashSet();
// Add Element in HashSet

        hs.add("Jone");
        hs.add(12);
        hs.add("Bob");
        hs.add(50);

        System.out.println("HashSet Element : "+hs);

// Not Store Duplicate Element

        hs.add("Jone");
        System.out.println("Not Store Duplicate Element :"+hs);

// Size of HashSet

        System.out.println("Size of HashSet : "+hs.size());

// Contains The Element

        System.out.println("Bob Present In HashSet : "+hs.contains("Bob"));

// One by One Print Element

     Iterator i =  hs.iterator();

        System.out.println("---------------------------");
     System.out.println("HashSet Element Print One by One : ");

     while (i.hasNext()){
         System.out.println(i.next());
     }
        System.out.println("-----------------------------");
// Check Empty In HashSet

        System.out.println("Check Empty in HashSet : "+hs.isEmpty());

// Remove Element

        hs.remove("Bob");
        System.out.println("Remove Bob : "+hs);

// Clear All Element

        hs.clear();
        System.out.println("Clear All Element : "+hs);
    }
}
