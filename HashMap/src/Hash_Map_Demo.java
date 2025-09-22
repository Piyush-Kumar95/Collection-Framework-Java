import java.util.HashMap;
import java.util.Map;

public class Hash_Map_Demo {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap();

// Add Element

        hm.put(101,"Apple");
        hm.put(102,"Banana");
        hm.put(103,"LiChi");
        hm.put(104,"Orange");

        System.out.println("HashMap Element : "+hm);

// Convert in Set

        System.out.println("HashMap Element in Set only Key : "+hm.keySet());

// Replace Value

        hm.replace(103,"Mango");
        System.out.println("Replace 103 Value :"+hm);

// Contain Value

        System.out.println("Present in Mango : "+hm.containsValue("Mango"));

// Print One by One

        System.out.println("----------------------");
        for (Map.Entry me : hm.entrySet()){
            System.out.println(me.getKey()+" -> "+me.getValue());
        }
        System.out.println("-----------------------");

// Remove Element

        hm.remove(102);
        System.out.println("Remove 102 Element : "+hm);

// Size of Element

        System.out.println("Size of HashMap : "+hm.size());

    }
}
