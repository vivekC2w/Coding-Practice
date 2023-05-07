package HashMap;

import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        // ----------------Insertion---------------------
        map.put("user1@1", "utkarsh");
        map.put("user2@2", "akash");
        map.put("user3@3", "shivam");
        //map.put("user3@3", "Mayank");
        //when we have same key the value will be over ridden

        System.out.println(map);

        //---------------Searching------------------------

        map.get("user1@1" + " value of the key");

        //-------------------Deletion------------------

        map.remove("user3@3");

        System.out.println(map);

        //------------------KeySet aka keys-------------------

        Set<String> keys = new map.keySet();
        System.out.println(keys);

        for(String : keys) {
            System.out.println("hey there key: " + key + "value: " + map.get(key));
        }

        //-----------------EntrySet---------------
       // Map.Entry<String, String> entrySet = (Map.Entry<String, String>) map.entrySet();
        System.out.println(map.entrySet());
    }
}
