package com.cts.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTime {
public static void main(String[] args) {
	LocalDate localedate=LocalDate.now();
	System.out.println("localedate"+localedate);
	LocalDateTime localedatetime=LocalDateTime.now();
	System.out.println("localedate"+localedate);
	DateTimeFormatter datetimeformat=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	ZonedDateTime currentZone=ZonedDateTime.now();
	ZoneId tokyoID = ZoneId.of("Asia/Tokyo");
    ZonedDateTime tokyoZone =
            currentZone.withZoneSameInstant(tokyoID);
    System.out.println("tokyoZone"+tokyoZone);
    
    LocalDate date = LocalDate.now();
    System.out.println("current date is :" +
                        date);
 
    // adding 2 years to the current date
    LocalDate year =
         date.plus(2, ChronoUnit.YEARS);
     
    System.out.println("next to next year is " +
                        year);
         
    // adding 1 month to the current data
    LocalDate nextMonth =
              date.plus(1, ChronoUnit.MONTHS);
     
    System.out.println("the next month is " +
                        nextMonth);
 
    // adding 1 week to the current date
    LocalDate nextWeek =
              date.plus(1, ChronoUnit.WEEKS);
     
    System.out.println("next week is " + nextWeek);
 
    // adding 2 decades to the current date
    LocalDate Decade =
              date.plus(2, ChronoUnit.DECADES);
    
               
    System.out.println("20 years after today " +
                        Decade);
	
}
}
