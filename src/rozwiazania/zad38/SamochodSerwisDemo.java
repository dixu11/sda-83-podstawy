package rozwiazania.zad38;

import rozwiazania.zad34.Samochod;

import java.util.Scanner;

public class SamochodSerwisDemo {

 /*   W tym zadaniu wykorzystaj wcześniej przygotowaną klasę Samochod. zaprogramuj aplikację pytającą o model
    Twojego samochodu oraz przebieg.
    Możesz zrobić to w metodzie main. Aplikacja ta ma stworzyć obiekt samochód i sprawdzić czy dany
    samochód powinien zrobić przegląd czy nie. Jeśli tak, powinna wyświetlić “samochód o marce … powinien
    zrobić przegląd już … kilometrów temu!”, a jeśli wszystko jest okej może wyświetlić “Dla samochodu o marce …
    zostało jeszcze … kilometrów do przeglądu”.

    Przenieś kod obsługujący kontrolę przeglądów do osobnego obiektu typu SamochodSerwis. Powinieneś w nowej
    klasie uzyskać dwie metody, jedna tworząca samochód i zwracająca go a druga przyjmująca samochód i
    wyświetlająca dane na temat przeglądu.
    wariant trudniejszy: Przygotuj w main tablicę samochodów. Oblicz ich łączny przebieg wykorzystując pętlę
    foreach. Przenieś nową funkcjonalność do klasy CarService jako metodę przyjmującą tablicę i zwracającą int.*/

    public static void main(String[] args) {
        // klasa Samochod pochodzi z pakietu zad34
        Samochod samochod1 = new Samochod("BMW"); // korzysta z konstruktora z jednym parametrem
        Samochod samochod2 = new Samochod("Tesla",2000); // wykorzystuje inny konstruktor

        SamochodSerwis serwis = new SamochodSerwis();
        Samochod zbudowanySamochod = serwis.przygotujSamochod();
        serwis.sprawdzPrzeglady(zbudowanySamochod);
        serwis.zrobPrzeglad(zbudowanySamochod);
        serwis.sprawdzPrzeglady(zbudowanySamochod);






    }
}
