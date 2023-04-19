package day21_datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C02_DateTime {
    public static void main(String[] args) {

            LocalDateTime ldt = LocalDateTime.now();

            System.out.println(ldt);// 2023-03-16T15:07:10.865735

            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("M/dd/yyyy - hh:mm a");
            String formattedLdt = dtf1.format(ldt);

            System.out.println(formattedLdt);// 3/16/2023 - 03:11 PM









    }
}
