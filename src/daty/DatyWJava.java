package daty;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;

public class DatyWJava {
    public static void main(String[] args) {
        String data = "23-05-2021";
        String data2 = "2021.07.24";
        String data3= "2021.13.37";
        System.out.println(data);
        System.out.println(data2);
        System.out.println(data3);
        //problemy:
        //różne formaty
        //brak kontroli nad poprawnością daty
        //brak 0 przy np. 9-7-1995



//        String date = readDate();
//        System.out.println("Twoja data: " + date);

        //YYYY-MM-DD
        LocalDate myDate = LocalDate.of(2020, 2, 29);
        //daty mają metody do operacji na datach
        System.out.println(myDate);
        myDate = myDate.plusYears(3); // daty są immutable -> każde stworzenie daty generuje nową date więc musimy nadpisać zmienną tą nową datą
        myDate = myDate.plusWeeks(1);
        System.out.println(myDate);
        LocalDate actual = LocalDate.now();
        System.out.println(actual);
        System.out.println(actual.isAfter(myDate));
        System.out.println(actual.isLeapYear());
        System.out.println(actual.format(DateTimeFormatter.ofPattern("dd.MMM.yy"))); // własne formatowanie daty


        LocalDate yourDate = readDateToLocalDate();
        System.out.println("Twoja data: " + yourDate);
        System.out.println("Dzień roku: " + yourDate.getDayOfYear());
        System.out.println("Dzień tygodnia: " + yourDate.getDayOfWeek());
        LocalDate endOfYear = LocalDate.of(2022,1,1);
        //wyciąganie okresu między 2 datami:
//        System.out.println("Dni do 1 stycznia: " + yourDate.until(endOfYear));
        System.out.println("Dni do 1 stycznia: " + yourDate.until(endOfYear, ChronoUnit.DAYS));
    }

    private static String readDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dzień");
        int day = scanner.nextInt();
        System.out.println("Podaj miesiąc");
        int month = scanner.nextInt();
        System.out.println("Podaj rok");
        int year = scanner.nextInt();
        if (year<100){
            year += 2000;
        }
        return String.format("%d-%d-%d",day,month,year);
    }

    private static LocalDate readDateToLocalDate() {
        System.out.println("Podaj datę z tego roku");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dzień");
        int day = scanner.nextInt();
        System.out.println("Podaj miesiąc");
        int month = scanner.nextInt();
        System.out.println("Podaj rok");
        int year = scanner.nextInt();
        return LocalDate.of(year,month,day);
    }

}
