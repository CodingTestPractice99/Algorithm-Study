package juyoungoh.beakjoon;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class _16170 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date.getYear());
        System.out.println(dateTime.getMonthValue());
        System.out.println(dateTime.getDayOfMonth());
    }
}
