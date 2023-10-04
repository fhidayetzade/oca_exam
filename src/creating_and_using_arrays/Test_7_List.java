package creating_and_using_arrays;

import java.util.ArrayList;
import java.util.List;

public class Test_7_List {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(2));
        list.add(new Integer(1));
        list.add(new Integer(0));

        list.remove(list.indexOf(0));

        System.out.println(list);

        //remove overload method`dur. remove(int) oturulen index`i silir. Misal: remove(2) list`de 2-ci index`i, yeni list.add(0) silir.
        //remove(list.indexOf(0)) - list`de add olunan ededi silir. Index`i yox!
    }
}
