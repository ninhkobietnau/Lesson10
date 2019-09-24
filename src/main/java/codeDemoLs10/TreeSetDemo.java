package codeDemoLs10;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(14);
        treeSet.add(5);
        treeSet.add(9);
        treeSet.add(14);

        System.out.println(treeSet);

        for (Integer str : treeSet) {
            System.out.print(str + " ");
        }
    }
}
