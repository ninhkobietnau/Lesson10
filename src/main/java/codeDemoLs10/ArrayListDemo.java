package codeDemoLs10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static java.util.Collections.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("and");
        arrayList.add("dund");
        arrayList.add("cent");

        System.out.println("cac phan tu cua string :");
        System.out.println(arrayList.size());
        System.out.println(arrayList);

        sort(arrayList);
        System.out.println("sap xep : " + arrayList);

        List<Integer> integers = new ArrayList<Integer>();
        integers.add(10);
        integers.add(15);
        integers.add(12);

        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.compareTo(t1);
            }
        });

        System.out.println("\ncac phan tu cua int :");
        System.out.println(integers.size());
        System.out.println(integers);

        sort(integers);
        System.out.println("sap xep : " + integers);
    }
}
