package codeDemoLs10;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer , String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(1, "ninh");
        treeMap.put(4, "sang");
        treeMap.put(6, "dat");
        treeMap.put(3, "ninh");

        System.out.println(treeMap.size());
        System.out.println(treeMap);
    }
}
