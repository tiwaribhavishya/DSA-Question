package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapFunctions {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();
        // functionality of the put() function
        hashmap.put(1, "bhavishya");
        hashmap.put(2,"ayushi");
        hashmap.put(3, "preeti");
        hashmap.put(9, "mummy");
        hashmap.put(11, "papa");
        //hashmap.put(3,"kanha");
        System.out.println("hashmap of the given data is : " + hashmap);
        // Update put() function the same key in the map
        hashmap.put(3,"kanha");
        System.out.println(hashmap);

        //////////////////////////////////////////////////////////////////////
        // functionality of the get() function
        String result = hashmap.get(9);
        System.out.println("hashmap of the given key : "+result);

        //////////////////////////////////////////////////////////////////////
        // functionality of the containskey() function
        // conatinskey() function is boolen type
        System.out.println(hashmap.containsKey(11));

        //////////////////////////////////////////////////////////////////////
        // functionality of the remove() function
        hashmap.remove(1);
        System.out.println("Updated hashmap : "+hashmap);

        /////////////////////////////////////////////////////////////////////
        // functionality of the entryset() function iterating using the for loop
        for(Map.Entry<Integer,String> e: hashmap.entrySet()){
            System.out.println("Hashmap is : "+e.getKey()+":"+e.getValue());
        }





    }
}
