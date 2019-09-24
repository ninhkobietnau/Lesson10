package codeDemoLs10;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set <String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("ninh");
        linkedHashSet.add("dat");
        linkedHashSet.add("hieu");
        linkedHashSet.add("ninh");

        for (String str : linkedHashSet){
            System.out.print(linkedHashSet + " ");
        }
    }
}
