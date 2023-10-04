package creating_and_using_arrays;

import java.util.ArrayList;
import java.util.List;

public class Test_2 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        if(list.contains('O')) {
            list.remove('8');
        }

        for(char ch : list) {
            System.out.print(ch);
        }
        // List`in tipi Character tipindədir. `O` ASII cədvəlində 79 simvolun qarşılığıdır. remove overload method
        // olduğundan, int tipində value qəbul edir. Ona görə, char simvolu int tipinə çevirərək, 79 dəyəri ifadə edir.
        // list`in uzunluğu 4-dür. remove methodu 79 indexi tapmadığından runtime exception xətası verəcəck.
    }
}
