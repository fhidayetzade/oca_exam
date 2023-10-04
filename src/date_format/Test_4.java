package date_format;

import java.time.LocalDate;

public class Test_4 {
    public static void main(String[] args) {
        LocalDate newYear = LocalDate.of(2018, 1, 1);
        LocalDate christmas = LocalDate.of(2018, 12, 25);
        boolean flag1 = newYear.isAfter(christmas);
        boolean flag2 = newYear.isBefore(christmas);
        System.out.println(flag1 + ":" + flag2);

        // 1 Yanvar 2018 - 25 Dekabr 2018-den sonra gelir? Xeyr, false.
        // 1 Yanvar 2018 - 25 Dekabr 2018-den evvele tesaduf edir? Beli, true.
    }
}
