package codeDemoLs10;

import java.util.EnumSet;
import java.util.Set;
import java.util.Iterator;

enum days {
    SUNDAY , MONDAY , TUESDAY , WEDNESDAY , THURSDAY
 , FRIDAY , SATURDAY}

public class EnumSetDemo {
    public static void main(String[] args) {
        Set<days> set;
        set = EnumSet.of(days.MONDAY , days.TUESDAY , days.WEDNESDAY);
        Iterator<days> inter = set.iterator();
        while (inter.hasNext()) {
            System.out.println(inter.next());
        }
    }
}
