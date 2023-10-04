package date_format;

import java.time.LocalDate;

public class Test_Local_Date {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.of(2020,9,31);
        System.out.println(localDate);

        //runtime exception: sentyabr ayı 30-na kimidir.
    }
}
