import java.util.ArrayList;
import java.util.Iterator;

public class Array_List {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

   //Add Element in Array

        arrayList.add(0,10);
        arrayList.add(1,20);
        arrayList.add(2,30);
        arrayList.add(3,40);
        arrayList.add(4,50);
        arrayList.add(5,60);

        System.out.println("Array : "+arrayList);
        System.out.println("---------------------------");

   // Remove Element in Array

        arrayList.remove(5);
        System.out.println("Remove Element : "+arrayList);

   //  Size of Array

        System.out.println("Size of Array : "+arrayList.size());

   //  Contains In Array

        System.out.println("Element is Present : "+arrayList.contains(50));

   // Get of Element in Array

        System.out.println("Get Element : "+arrayList.get(2));

   // Set of Element in Array

        arrayList.set(3,100);
        System.out.println("Set Element : "+arrayList);

   // IndexOf Element in Array

        System.out.println("Index Of Element : "+arrayList.indexOf(100));

        System.out.println("--------------------------------");



        System.out.println("Array 1 : " +arrayList);

        ArrayList arrayList2 = new ArrayList();

        arrayList2.add("Jone");
        arrayList2.add("Bob");
        arrayList2.add("Thor");
        arrayList2.add("Stone");

        System.out.println("Array 2 : "+arrayList2);

   // Add All Array

        System.out.println("------------------------------------------------------");
        arrayList.addAll(arrayList2);
        System.out.println("Array 3 :"+arrayList);

   // Iterator of Element
        System.out.println("----------------------------");
       Iterator i =  arrayList.iterator();
        System.out.println("Print Array One by One : ");
       while (i.hasNext()) {
           System.out.println(i.next());
       }

   // Clear Array

        System.out.println("-------------------------");
        arrayList.clear();
        System.out.println("Remove All Element in Array 3 : "+arrayList);

    }
}
