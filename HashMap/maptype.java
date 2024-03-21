package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class maptype {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(1, "bahvishya");
        hashmap.put(2, "ayushi");
        hashmap.put(11, "papa");
        hashmap.put(6, "ayu");
        System.out.println(hashmap);

        // LinkedHashMap
        LinkedHashMap<Integer,String>map = new LinkedHashMap<>();
        map.put(1, "ashok");
        map.put(8, "kanha");
        map.put(9, "bhav");
        map.put(5, "neha");
        System.out.println(map);

        // Sorted table using treemap
        TreeMap<Integer,String> map1 = new TreeMap<>();
        map1.put(2,"roshan" )   ;
        map1.put(6, "suraj");
        map1.put(4, "amma");
        map1.put(9, "kakka");
        System.out.println(map1);
    }
}