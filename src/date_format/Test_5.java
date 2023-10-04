package date_format;

import java.time.Period;

public class Test_5 {
    public static void main(String[] args) {
        Period period1 = Period.of(0, 0, 0);
        Period period2 = Period.of(1, 2, 0);
        Period period3 = Period.of(1, 2, 3);
        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);

        // Period 0-a beraberdir. 0-a beraber oldugu ucun, P0D kimi gosterilir.
    }
}
