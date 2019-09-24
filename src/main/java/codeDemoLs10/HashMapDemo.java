package codeDemoLs10;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map <String , Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("ninh", 19);
        hashMap.put("dat", 20);
        hashMap.put("sang", 23);
        System.out.println(hashMap);

        System.out.println(hashMap.size());

        Map<Integer , String> map = new HashMap<Integer , String>();
        map.put(null,"ninh");
        map.put(4,null);
        map.put(8,null);
        System.out.println(map);
    }
}
