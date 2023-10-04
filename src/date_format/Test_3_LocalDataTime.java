package date_format;

import java.time.LocalDateTime;

public class Test_3_LocalDataTime {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        // indiki tarix ve saati gosterir.
        System.out.println(ldt.getSecond());
        //ldt.getSecond() - istenilen 0:59 araliginda saniyeni qaytarir
    }
}
