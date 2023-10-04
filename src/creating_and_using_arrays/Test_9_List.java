package creating_and_using_arrays;

import java.util.ArrayList;
import java.util.List;

public class Test_9_List {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
//        Integer i=new Integer(100);      // line 1
//        list.remove(i);                  // line 2
        list.remove(100);            // line 3

        System.out.println(list);

        // runtime error bash verecek. remove(int) tipi qebul etse, index`i silir ve burada 100-cu index`si tapa bilmedeyinden
        // IndexOutOfBoundsException xetasi bash verecek.
        // remove(object) tipi qebul etse, o zaman true ve false neticeni qaytarir.

        // line 1 ve line 2 commentden cixartsaq, line 3 commente alsaq netice olaraq [200, 100, 200] qaytaracaq. Cunki -
        // remove (Object) tipi qebul edir ve equals(object) methodundan istifade edir. true`sa hemin ededi silir.
    }
}
