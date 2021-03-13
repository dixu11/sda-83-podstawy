package rozwiazania;

/*  Przygotuj następujące metody i przetesuj w main:


        metoda przyjmuje jako parametr imię i drukuje “Cześć <imie>!”
        metoda przyjmuje jako parametr liczbę całkowitą i drukuje Twoje imie tyle razy


        wariant trudniejszy: metoda przyjmuje ilość sztuk towaru, cenę oraz podatek.
        Powinna wyliczyć łączoną cenę towaru. Jeśli cena przekracza 100 zł powinna
        ustawić zmienną boolean darmowaWysylka na true. Przygotuj drugą, pomocniczą metodę dla tej pierwszej,
        która przyjmie łączoną cenę towaru oraz informację o darmowejWysylce i wyświetli stosowny komunikat o cenie
    do zapłaty oraz informację czy przesyłka będzie za darmo.
        Do wyświetlonej ceny powinna dodać ew. koszt wysyłki + 10zł.*/


import metody.MetodyDemo;

import java.util.Scanner;

public class Zad23 {

    public static void main(String[] args) {
        int jakasLiczba = 50;
        wyswietlLiczbe(jakasLiczba);
        wyswietlLiczbe(66);
        wyswietlLiczbe(22);
        wyswietlLiczbe(100);

        wyswietlHello();

        wyswietlImie("Daniel");
        wyswietlImie("Maria");
        System.out.println("----");

     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int wiek = scanner.nextInt();
        scanner.nextLine(); // do pominiecia "\n" przekazanego z liczbą
        System.out.println("Jak się nazywasz?");
        String imie = scanner.nextLine();


        przywitaj(imie, wiek);*/

//       pobierzDaneIPrzywitaj();
//       pobierzDaneIPrzywitaj();

        System.out.println("-------");
        //MetodyDemo.polskiObiad(); // przyklad wywolania metody publicznej z innego pakietu
//        MetodyDemo.zakonczenie();  // przyklad proby wywolania metody prywatnej z innej klasy - nie da sie!
        drukujImieAutoraTyleRazy(7);
    }

    public static void wyswietlLiczbe(int liczba) {
        System.out.println(liczba);
        System.out.println("Wyświetlone");
    }


    // metoda wyświetla napis “hello”
    public static void wyswietlHello() {
        System.out.println("Hello");
    }

    // metoda przyjmuje i drukuje imię 10 razy
    public static void wyswietlImie(String imie) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Imie to: " + imie);
        }
    }


    //metoda ogolna ktora korzysta z małej pomocniczej metody przywitaj
    public static void pobierzDaneIPrzywitaj() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int wiek = scanner.nextInt();
        scanner.nextLine(); // do pominiecia "\n" przekazanego z liczbą
        System.out.println("Jak się nazywasz?");
        String imie = scanner.nextLine();
        przywitaj(imie, wiek);
    }

    //    metoda przyjmuje dwa parametry imię oraz wiek. Jeśli przekazano niski wiek,
//    wyświetla “cześć <imie>” jeśli powyżej 20, wyświetla “dzień dobry <imie>”
//    metoda przyjmuje tablicę imion i wita wszystkie przekazane osoby :)
    public static void przywitaj(String imie, int wiek) {
        if (wiek > 20) {
            System.out.println("Dzień dobry " + imie);
        } else {
            System.out.println("Cześć " + imie);
        }
    }

    //    metoda przyjmuje jako parametr liczbę całkowitą i drukuje Twoje imie tyle razy
    public static void drukujImieAutoraTyleRazy(int ile) {
        for (int i = 0; i < ile; i++) {
            System.out.println("Daniel");
        }

    }

}
