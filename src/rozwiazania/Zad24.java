package rozwiazania;

import java.util.Random;

public class Zad24 {

    public static void main(String[] args) {
        System.out.println(zwrocUlubiona());
        System.out.println(zwrocSume(2, 4, 6));
        System.out.println(zwrocSume(345, 567.5, 23));
        System.out.println(losujLiczby());


        System.out.println(ileDni(10));
        System.out.println(ileDni(3));
        int lata = 23;
        System.out.println("Lata: " + lata);
        int dni = ileDni(lata);
        System.out.println("Dni: " + dni);

        System.out.println(podziel(34, 45));
        System.out.println(podziel(34, 0));

        System.out.println(formatujDate(13, 3, 2021));
        System.out.println(formatujDate(14, 3, 2021));

        int liczba = 10; // system dziesiętny 10
        int liczba2 = 0b1010110011011; // system binarny 2
        int liczba3 = 0234;// system oktalny 8
        int liczba4 = 0x89abcdef; // system heksadecymalny  16
        System.out.println(liczba2);
        System.out.println(liczba3);
        System.out.println(liczba4);

        if (czyIdentyczne(liczba, liczba2, liczba3)) {
            System.out.println("Identyczne~!");
        } else {
            System.out.println("różne");
        }
        int[] wartosci = {123, 456, 5678, 345, 123, 56, 2};
        System.out.println(sumujTablice(wartosci));


        System.out.println("Czy w tablicy \"wartosci\" jest liczba wieksza niz 1000?");
        System.out.println(czyJestWieksza(wartosci,1000));

    }

//    metoda zwraca Twoją ulubioną liczbę. Przyjmij do zmiennej w main i wyświetl wartość zwróconą
//    metoda przyjmuje trzy liczby i zwraca ich sumę
//    metoda losuje liczbę od 1 do 10 i zwraca

    public static int zwrocUlubiona() {
        return 25;
    }

    public static double zwrocSume(double a, double b, double c) {
        return a + b + c;
    }

    public static int losujLiczby() {
        Random random = new Random();
        int wylosowana = random.nextInt(10) + 1;
        return wylosowana;
    }

//    metoda przyjmuje ilość lat i zwraca ilość dni
//    metoda przyjmuje dwie liczby i dzieli pierwszą przez drugą.
//    Jeśli druga liczba to 0 metoda ma zwrócić -1 aby zakomunikować błąd.
//    metoda przyjmuje dzień, miesiąc i rok urodzenia i zwraca je
//    w postaci String formatując w ten sposób: “RRRR-MM-DD”

    public static int ileDni(int lata) {
        return lata * 365;
    }

    public static double podziel(double liczba1, double liczba2) {
        if (liczba2 == 0) {
            return -1;
        } else {
            return liczba1 / liczba2;
        }
    }

    //    metoda przyjmuje dzień, miesiąc i rok urodzenia i zwraca je
//    w postaci String formatując w ten sposób: “RRRR-MM-DD”
    public static String formatujDate(int dzien, int miesiac, int rok) {
        return rok + "-" + miesiac + "-" + dzien;
    }

   /* public static boolean czyIdentyczne(int a, int b, int c){
        if(a == b && a == c){
            return true;
        }else {
            return false;
        }
    }*/

    public static boolean czyIdentyczne(int a, int b, int c) {
        return a == b && a == c;
    }


//    metoda przyjmuje trzy liczby, zwraca true jeśli wszystkie trzy liczby są identyczne,
//    wykorzystaj metodę wywołując ją w miejscu na warunek ifa w mainie

   /* public static int sumujTablice(int[] liczby) {
        int suma = 0;
        for (int i = 0; i < liczby.length; i++) {
            suma += liczby[i];
        }
        return suma;
    }*/

    public static int sumujTablice(int[] liczby) { // wersja z for-each
        int suma = 0;
       for(int liczba : liczby ){
           suma += liczba;
        }
        return suma;
    }

//    metoda przyjmuje tablicę liczb i zwraca ich sumę

    public static boolean czyJestWieksza(int[] liczby, int graniczna){
        for(int liczba : liczby){
            if (liczba> graniczna) {
                return true;
            }
        }
        return false;
    }

//    metoda przyjmuje tablicę liczb oraz liczbę całkowitą, zwraca true jeśli w tablicy
//    istnieje liczba większa od przekazanej, false jeśli nie


}
