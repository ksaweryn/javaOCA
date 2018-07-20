package com.demografiando.chap4;

import java.time.*;

class Timetest {
  public static void main(String args[]){
    LocalDate ld1 = LocalDate.of(2015, 12, 27);
    LocalDate ld2 = LocalDate.of(2015, Month.DECEMBER, 27);

    System.out.println(ld1);
    System.out.println(ld2); // both create the date in the specified data
    System.out.println(Month.JANUARY); //Prints the month, not the int representation of the month
    System.out.println(LocalDate.now()); //Today
    System.out.println(LocalDate.parse("2020-07-16")); //recieves string - format is 9999-99-99
    //System.out.println(LocalDate.parse("10000-07-16")); //Throws DateTimeParseException
    //System.out.println(LocalDate.parse("10000-15-16")); //Throws DateTimeParseException

    LocalDate date = LocalDate.parse("2020-08-30");
    System.out.println(date.getDayOfMonth());
    System.out.println(date.getDayOfWeek());
    System.out.println(date.getDayOfYear());
    System.out.println(date.getMonth());
    System.out.println(date.getMonthValue());
    System.out.println(date.getYear());

    System.out.println(ld1.isAfter(date));
    System.out.println(ld1.isBefore(date));
    System.out.println(ld1.isBefore(ld2));

    LocalDate firstSex = LocalDate.of(2036, 02, 28);
    System.out.println(firstSex);
    System.out.println(firstSex.withDayOfMonth(1));
    System.out.println(firstSex.withDayOfYear(1));
    System.out.println(firstSex.withMonth(7));
    System.out.println(firstSex.withYear(1));

    LocalDate interviewDate = LocalDate.of(2016,02,28);
    System.out.println(interviewDate.atTime(16, 30));
    System.out.println(interviewDate.atTime(16, 30, 20));
    System.out.println(interviewDate.atTime(16, 30, 20, 300));
    System.out.println(interviewDate.atTime(LocalTime.of(16, 30)));
    System.out.println(interviewDate.getClass());

    LocalDate launchBook = LocalDate.of(2016,2,8);
    LocalDate aDate = LocalDate.of(1970,1,8);
    System.out.println(launchBook.toEpochDay());
    System.out.println(aDate.toEpochDay());

  }
}

class LocalTimeTest {
  public static void main (String... args) {
    LocalTime lt1 = LocalTime.of(12, 12); //hours & minutes
    LocalTime lt2 = LocalTime.of(0, 12, 6); //hours, minutes & seconds
    LocalTime lt3 = LocalTime.of(14, 7, 10, 998654578); //hours, minutes, seconds & nanoseconds

    System.out.println(lt1);
    System.out.println(lt2);
    System.out.println(lt3);

    LocalTime date3 =  LocalTime.now();
    System.out.println(date3);
    LocalTime time = LocalTime.parse("15:08:23");
    System.out.println(time);

    time = LocalTime.of(16, 20, 12, 98547);
    System.out.println(time.getHour());
    System.out.println(time.getMinute());
    System.out.println(time.getSecond());
    System.out.println(time.getNano());

    LocalTime firstTime = LocalTime.parse("16:07:04");
    LocalTime secondTime = LocalTime.parse("16:07:06");

    if (firstTime.isBefore(secondTime)) {
      System.out.println("First");
    } else {
      System.out.println("Second");
    }

    LocalTime time2 = LocalTime.of(14, 10, 0); //LocalTime var is immutable
    LocalDate date = LocalDate.of(2016,02,28);
    LocalDateTime dateTime = time2.atDate(date);
    System.out.println(dateTime);

  }
}

class PeriodTest {
  public static void main (String[] args) {
    Period p1 = Period.parse("P5y"); //Prints the same
    System.out.println(p1);
    Period p2 = Period.parse("P52W1D"); //Prints the same
    System.out.println(p2);
    LocalDateTime dateTime = LocalDateTime.parse("2052-01-31T14:18:36");
    System.out.println(dateTime.plus(Period.ofMonths(1)));
    LocalDateTime dateTime2 = LocalDateTime.parse("2020-01-31T14:18:36");
    System.out.println(dateTime2.minus(Period.ofYears(2)));

    LocalDate date = LocalDate.of(2052, 01, 31);
    System.out.println(date.minus(Period.ofWeeks(4)));
    date = LocalDate.of(2052, 01, 31);
    System.out.println(date.minus(Period.parse("P32d")));

    Period period = Period.of(2,4,40);
    System.out.println(period.getYears());
    System.out.println(period.getMonths());
    System.out.println(period.getDays());
    period = Period.parse("P34W");
    System.out.println(period.getDays());

    Period days5 = Period.of(0, 0, 5);
    System.out.println(days5.isZero());

    Period daysMinu5 = Period.of(0, 0, -5);
    System.out.println(daysMinu5.isNegative());
  }
}
