package rozwiazania.zad34v2;

import java.util.Scanner;

public class CarDemo {
    public static void main(String[] args) {

        Car car = new Car("Mercedess");
        Car car2 = new Car("BMW");

        System.out.println(car); // wykorzystujemy nadpisaną wersję metody toString
        System.out.println(car2);
//        car.show();
//        car2.show();

        car.ride(1000);
        car2.ride(5000);

        System.out.println(car);
        System.out.println(car2);

        System.out.println(car.howManyToOverview());
        System.out.println(car2.howManyToOverview());

        CarService carService = new CarService();
      Car customCar =  carService.buildCar();
        carService.checkOverview( customCar );
        carService.doOverview(customCar);
        System.out.println(customCar);
        carService.checkOverview(customCar);


    }
}

//ENKAPSULACJA // HERMETYZACJA
//Do cech obiektów mamy dostęp wyłącznie przez metody.
//Ich cechy powinny być ukryte przed resztą klas

//private -> tylko ta klasa
//package-default -> ta klasa i ten pakiet
//protected -> jw. + klasy dziedziczące
//public -> dostęp również w innych pakietach





/*
    Stwórz klasę typu Samochod. Obiekty typu Samochod mają
    mieć dwie cechy - marka i przebieg.
    Stwórz również pole informujące o tym przy jakim przebiegu
    powinniśmy zrobić przegląd. W klasie do testów
    (np. SamochodDemo) przygotuj metodę main, a w niej
    stwórz dwa obiekty typu Samochod.

    Dla obiektów typu Samochod przygotuj następujące
    funkcjonalności oraz przetestuj je w main:

    Stwórz metodę wyświetlającą markę samochodu oraz przebieg
    Stwórz metodę przyjmującą odległość do przejechania
    i zwiększającą przebieg samochodu o tę odległość
    Stwórz metodę zwracającą ilość kilometrów jakie można
    przejechać przed zrobieniem przeglądu. Jeśli przebieg
    aktualny przekracza przebieg do przeglądu możesz zwrócić
    ujemną wartość

    wariant trudniejszy: stwórz w main tablicę samochodów
    a następnie wykorzystując pętlę wyświetl markę oraz
    przebieg każdego z nich*/

//    W tym zadaniu wykorzystaj wcześniej przygotowaną
//    klasę Samochod. zaprogramuj aplikację pytającą o
//    model Twojego samochodu oraz przebieg. Możesz zrobić
//    to w metodzie main. Aplikacja ta ma stworzyć obiekt
//    samochód i sprawdzić czy dany samochód powinien
//    zrobić przegląd czy nie. Jeśli tak, powinna wyświetlić
//    “samochód o marce … powinien zrobić przegląd już …
//    kilometrów temu!”, a jeśli wszystko jest okej może
//    wyświetlić “Dla samochodu o marce … zostało jeszcze …
//    kilometrów do przeglądu”.
