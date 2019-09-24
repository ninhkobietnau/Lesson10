package codeDemoLs10;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("ni");
        System.out.println(hashSet);
        hashSet.add("hieu");
        System.out.println(hashSet);
        hashSet.add("sangg");
        for (String hset : hashSet){
            System.out.print(hset + " ");
        }
        System.out.println(hashSet.size());
        hashSet.clear();
        System.out.println(hashSet);

        Set<Integer> set = new HashSet<Integer>();
        set.add(13);
        set.add(16);
        set.add(6);
        set.add(13);
        System.out.println(set);
    }
}
