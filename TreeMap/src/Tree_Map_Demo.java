import java.util.TreeMap;

public class Tree_Map_Demo {
    public static void main(String[] args) {

        TreeMap tm = new TreeMap();

// Add Element

        tm.put(111,"Ram");
        tm.put(113,"Ankit");
        tm.put(112,"Rana");
        tm.put(116,"Jone");
        tm.put(119,"Bob");

        System.out.println("TreeMap Element : "+tm);

// Ceiling Element

        System.out.println("Ceiling Element : "+tm.ceilingEntry(115));

// Floor Element

        System.out.println("Floor Element : "+tm.floorEntry(115));

// Get First Element

        System.out.println("Get First Element : "+tm.firstEntry());

// Poll First Element

        System.out.println("Poll First Element : "+tm.pollFirstEntry());


    }
}
