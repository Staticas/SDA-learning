package com.company.sdacademy;


import sun.security.jca.GetInstance;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DateExample {
    public static void main(String[] args){
        long timeStart = System.currentTimeMillis();
        System.out.println("Hello");
        Random r = new Random();
        r.nextInt ( 100000 );
        long timeDelta = System.currentTimeMillis() - timeStart;
        System.out.println("It took: " + timeDelta + "ms to say 'Hello'");

        Date now = new Date(System.currentTimeMillis());
       System.out.println("Date now: " + now);
        System.out.println("A bad way to do this");
        System.out.println("Year: " + now.getYear()); // doesn't work
        System.out.println("Month: " + now.getMonth()); // doesn't work
        System.out.println("Day: " + now.getDay()); // doesn't work

        Calendar cal = Calendar.getInstance();
        System.out.println("A better way");
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + cal.get(Calendar.MONTH)); // doesn't work why? caz pc conts from 0 til 11
        System.out.println("Day: " + cal.get(Calendar.DAY_OF_MONTH));

        String someDate = "2009-04-09";
        LocalDate dateParsed = LocalDate.parse(someDate); // LocalDate is a Library thru Alt + Enter
        System.out.println("Parsed month: "
                + dateParsed.getMonthValue()
                + " which is " + dateParsed.getMonth());
        LocalDate givenDate = LocalDate.of(2009, 9, 9);
        System.out.println("Given month: "
                + givenDate.getMonthValue()
                + " which is " + givenDate.getMonth());
        System.out.println(givenDate // cheking the true or false  like birth date
                + " is after " + dateParsed + "? " // cheking the true or false  like birth date
                + givenDate.isAfter(dateParsed)); // cheking the true or false  like birth date

        LocalTime parsedTime = LocalTime.parse("06:30"); // digital clock starts 01 and ends 24!
        System.out.println("Parsed time is: " + parsedTime);

        LocalDateTime parsedDateTiame = LocalDateTime.parse("2009-09-09T06:30");
        System.out.println("Parsed datetime is: " + parsedDateTiame);
        // dd/MM/yyyy localization ISO standart is yyyy-MM-dd
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Time +15 min: " + LocalTime
                .now()
                .plusMinutes(15) // other way too do this line (.plus(1, ChronoUnit.HOURS);)
                .format(myFormat));

        // Time Zones

        ZoneId vilniusTimezone = ZoneId.of("Europe/Vilnius");
        ZoneId chinaTimezone = ZoneId.of("Asia/Shanghai");
        ZonedDateTime timeInChina = Instant.now().atZone(chinaTimezone);
        System.out.println("Time in China: " + timeInChina);

        LocalDate.now().plusDays(5); // adds 5 days to today
        Period fiveDays = Period.ofDays(5);
        LocalDate.now().plus(fiveDays);

        int marysAge = Period.between( /// Period for date
                LocalDate.parse("1970-01-01"),
                LocalDate.now())
                .getYears();

        System.out.println("Mary: " + marysAge +  " years old.");

        long timeTillTrain = Duration.between(
                LocalTime.now(),
                LocalTime.parse("17:50")
        ).getSeconds();

        System.out.println("Train at: " + LocalTime.now().plusSeconds(timeTillTrain));

        System.out.println("Time till train: " + timeTillTrain);

        long unixSeconds = Instant.now().getEpochSecond();
        long unixMillis = Instant.now(). toEpochMilli();

        System.out.println("Unix Seconds: " + unixSeconds);
        System.out.println("Unix Milliseconds: " + unixMillis);

        Year.of(2019);
        Month.of(12);


    }
}
