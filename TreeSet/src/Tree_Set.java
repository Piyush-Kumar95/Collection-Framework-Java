import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

// Add Element in TreeSet

        ts.add(20);
        ts.add(45);
        ts.add(85);
        ts.add(98);
        ts.add(25);
        ts.add(65);

        System.out.println("TreeSet Element : "+ts);

// Not Store Different Data Type

       // ts.add("Jone");
       // System.out.println(ts);

// Contains The Element :

        System.out.println("45 is Present in TreeSet : "+ts.contains(45));

// Size of TreeSet

        System.out.println("Size Of TreeSet : "+ts.size());

// Remove Element in TreeSet

       ts.remove(65);
        System.out.println("Remove 65 : "+ts);

// Element Print One By One

      Iterator i =  ts.iterator();

        System.out.println("---------------------------");
        System.out.println("Element Print One By One : ");

      while (i.hasNext()){
          System.out.println(i.next());
      }
        System.out.println("-----------------------------");

// Remove All Element

        ts.clear();
        System.out.println("Clear All Element : "+ts);
    }
}
