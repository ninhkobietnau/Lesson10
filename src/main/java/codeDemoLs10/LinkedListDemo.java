package codeDemoLs10;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.push("ninh");
        System.out.println(linkedList);
        linkedList.push("dat");
        System.out.println(linkedList);
        linkedList.add("sang");
        System.out.println(linkedList);
        linkedList.add("hieu");
        System.out.println(linkedList);

        System.out.println(linkedList.size());
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.pop());
        System.out.println(linkedList);
        linkedList.pop();
        System.out.println(linkedList);


    }
}
