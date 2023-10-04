package date_format;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTime_AtTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("1947-08-14");
        System.out.println("date "+date); // təkcə tarix çapa verilir.
        LocalTime time = LocalTime.MAX;
        System.out.println("time "+time); // tekce vaxt capa verilir.
        System.out.println("atTime "+date.atTime(time)); // atTime ise tarix+vaxt capa verir.

       /* LocalTime.MIN --> {00:00},
        LocalTime.MAX --> {23:59:59.999999999},
        LocalTime.MIDNIGHT --> {00:00},
        LocalTime.NOON --> {12:00}.
*/
        // date.atTime(LocalTime) metodu tarix və vaxt hissələrini birləşdirərək LocalDateTime nümunəsi yaradır.
        //LocalDateTime classi toString() metodu böyük hərflə T ilə ayrılmış tarix və vaxt hissələrini çap edir.
    }
}
