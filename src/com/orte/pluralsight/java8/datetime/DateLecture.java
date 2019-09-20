package com.orte.pluralsight.java8.datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class DateLecture {

    // before java 8
    // Date date = new Date();
    // get 10.02.2014
    // Calendar cal = Calendar.getInstance();
    // cal.set (2014, 1, 10); //january from 0
    // Date feb10th = cal.getTime();

    // add 7 days
    // cal.add(Calendar.DAY_OF_MONTH, 7);
    // Date oneWeekLater = cal.getTime();
    // Date class is mutable

    // defensive copy pattern!!!
    // public class Customer{
    // private Date creationDate;
    // public Date getCreationDate(){
    // return new Date(this.creationDate.getTime();
    // }}

    // having mutable Date class has a cost!!!

    // JAVA 8 NEW API
    // java.time package
    // new key concepts
    // legacy code interoperation

    // 1. Concept of instant
    // Instant is a point on the time line with precision of nanosecond
    // Instant of 0 => 01.01.1970 00:00 gmt
    // Instant.min => 1 billion years ago
    // Instant.max => is Dec. 31 of year 1000000
    // Instant.now => current instant
    // Instant obj => immutable
    // usage
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Instant start = Instant.now();
        for (int i = 0; i < 50000; i++) {
            list.add(0, i);
        }
        Instant end = Instant.now();
        // new concept DURATION
        Duration elapsed= Duration.between(start, end);
        long sec = elapsed.toSeconds();
        System.out.println(sec);
        LocalDate now = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(1564, Month.APRIL, 23);
        System.out.println(now); //2019-08-11
        System.out.println(dateOfBirth);//1564-04-23

        Period p = dateOfBirth.until(now);
        System.out.printf("%s years\n" , p.getYears());//455 years

        long days =  dateOfBirth.until(now, ChronoUnit.DAYS);
        System.out.printf("%s days\n" , days); // 166296 days

        LocalDate nextSunday = now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println(nextSunday); //2019-08-18
    }
    // 2. Concept of duration
    // amount of time between two instant
    // has many methods like toMills(), toMinutes();
    // different boolean checks

    // 3. Concept of LocalDate
    // Just date with day precision
    // LocalDate now = LocalDate.now();
    ///LocalDate dateOfBirth = LocalDate.of(1564, Month.APRIL, 23);

    // 4. Concept of Period
    // amount of time between two LocalDate objects (same as Duration)

    // 5. Concept of DateAdjuster
    // add and substract and amount of time to an Instant or LocalDate
    // TemporalAdjasters methods help to adjust Instant of LocalDate
    // firstInMonth(DayOfWeek.MONDAY);
    // dayOfWeekInMonth(2, DayOfWeek.THURSDAY)

    // 6. Concept of LocalTime
    // just time of the day
    // LocalTime now = LocalTime.now();
    // LocalTime time = LocalTime.of(10,20); //10:20
    // set of methods to manipulate time
    // LocalTime wakeUp = now.plusHours(2);

    // 7. Concept of Zoned time
    // Time Zones over Earth
    // java uses IANA database
    // zones are available from
    // Set<String> allZonesIds = ZoneId.getAvailableZoneIds();
    // String ukTZ = ZoneId.of("Europe/London");

    // Date formatting
    // new formatter: DateTimeFormatter
    // proposes a set of predefined formatters available as constants
    // ZonedDateTime nextMeetingUS = nextMeeting.withZoneSameInstant(ZoneId.of("US/Central"));
    // System.out.println(
    // DateTimeFormatter.ISO_DATE_TIME.format(nextMeetingsUS));

    // from old Date()
    // Date date = Date.from(instant);
    // Instant instant = date.toInstant();///
    // TimeStamp time = TimeStamp.form(instant);
    // Instant instant = time.toInstant();///
    // Date date = Date.from(localDate);
    // LocalDate localDate = date.toLocalDate();///
    // Time time = Time.from(localTime);
    // LocalTime localTime = time.toLocalTime();///



}
