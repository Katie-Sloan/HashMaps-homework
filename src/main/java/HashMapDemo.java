//import java.util.HashMap;
//
//public class HashMapDemo {
//    public static void main(String[] args) {
////        HashMap favouriteFruits = new HashMap();
//        HashMap<String, String> favouriteFruits = new HashMap<String, String>();
//
//        favouriteFruits.put("Alice", "Apple");
//        favouriteFruits.put("Sarah", "Banana");
//        favouriteFruits.put("Bob", "Strawberry");
//
//        System.out.println(favouriteFruits.get("Alice"));
//    }
//
//}

//import java.util.HashMap;
//
//public class HashMapDemo {
//    public static void main(String[] args) {
//        HashMap<String, Integer> ages = new HashMap<String, Integer>();
//
//        ages.put("Alice", 52);
//        ages.put("Bob", 24);
//
//        Integer aliceAge = ages.get("Alice");
//
//        String output = "Alice's age is " + aliceAge.toString();
//        System.out.println(output);
//    }
//}

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> populations = new HashMap<String, Integer>();

        populations.put("UK", 64100000);
        populations.put("Germany", 80620000);
        populations.put("France", 66030000);
        populations.put("Japan", 127300000);

        Integer UKPopulation = populations.get("UK");
        Integer germanyPopulation = populations.get("Germany");
        Integer francePopulation = populations.get("France");
        Integer japanPopulation = populations.get("Japan");
        populations.values();
        populations.keySet();

        System.out.println(UKPopulation);
        System.out.println(germanyPopulation);
        System.out.println(francePopulation);
        System.out.println(japanPopulation);
        System.out.println(populations.values());
        System.out.println(populations.keySet());
    }
}

