package rozwiazania;

import pola.PolaDemo;

import java.util.Arrays;
import java.util.Scanner;

public class Zad26 {

    /*Wykonaj następujące zadania:
    Wyświetl piątą potęgę liczby 2 wykorzystując bibliotekę Math.


    Podpowiedź: wykorzystaj metody charAt oraz metodę isDigit z biblioteki Character

    napisz metodę, w której za pomocą scannera pobierzesz liczbę i ją zwrócisz.
    Metoda ma zwracać -1jeśli poda się tekst.

    Podpowiedź: wczytaj liczbę jako tekst, sprawdź czy jest tam na pewno liczba a potem przekonwertuj
    ją do typu int za pomocą metody parsującej z biblioteki Inteeger

    wariant trudniejszy: jeśli poda się litery metoda ma pozwolić na powtórne wprowadzanie danych do skutku.*/


    public static void main(String[] args) {
      int wynik =  (int)Math.pow(2,5);
        System.out.println(wynik);
        System.out.println("Czy ostatni jest cyfrą?" );
        System.out.println(czyOstatniJestCyfra("ul. Wiejska 1a"));

        System.out.println("podano: " + pobierzLiczbe());
    }


   // stwórz metodę która przyjmie tekst i zwróci true jeśli ostatni znak będzie cyfrą.
          //  Przykładowo “ul. Wiejska 1” -> true

/*    public static boolean czyOstatniJestCyfra(String tekst){
       char ostatniSymbol = tekst.charAt(tekst.length()-1); // pobieram ostatnią literę tekstu
        if (Character.isDigit(ostatniSymbol)) {
            return true;
        } else {
            return false;
        }
    }*/

    public static boolean czyOstatniJestCyfra(String tekst){ // maksymalnie skrocona wersja
       return Character.isDigit(tekst.charAt(tekst.length()-1));
    }

//    napisz metodę, w której za pomocą scannera pobierzesz liczbę i ją zwrócisz.
//    Metoda ma zwracać -1jeśli poda się tekst.

    public static int pobierzLiczbe(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        String pobranaString = scanner.nextLine(); // pobieram jako tekst zeby litery nie powodowaly bledu
        char[] znaki =  pobranaString.toCharArray(); // przerabiam w tablice znakow
        //System.out.println(Arrays.toString(znaki));
        for(char znak:znaki){ // przegladam znaki
            if (!Character.isDigit(znak)) { //jesli jakis znak NIE jest cyfrą
                System.out.println("Znaleziono znak! Nieprawidlowy symbol: " + znak);
                return -1; // zwracam -1
            }
        }
        return Integer.parseInt( pobranaString); // przerabiam na INT i zwracam
    }


}
