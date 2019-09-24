package codeDemoLs10;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer , String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(1, "ninh");
        linkedHashMap.put(4, "sang");
        linkedHashMap.put(3, "hieu");

        System.out.println(linkedHashMap);
        linkedHashMap.remove(1);
        System.out.println(linkedHashMap);

    }

}
