package codeDemoLs10;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Map <Integer , String> hashTable = new Hashtable<Integer, String>();
        //ko dc co ky tu null trong HashTable
        hashTable.put(1, "hieu hihi");
        hashTable.put(3, "hieu beo");
        hashTable.put(2, "ninh nau");
        System.out.println(hashTable);
    }
}
