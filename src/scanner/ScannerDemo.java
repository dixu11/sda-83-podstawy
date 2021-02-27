package scanner;

import java.util.Scanner;

class ScannerDemo {

    public static void main(String[] args) {
        Scanner wczytywacz = new Scanner(System.in);
        System.out.println("Jaki masz ulubiony kolor?");
        String kolor = wczytywacz.nextLine();
        System.out.println("Też lubię " + kolor + "!");

        System.out.println("Podaj pierwszą liczbę");

        double liczba1 = wczytywacz.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        double liczba2 = wczytywacz.nextInt();

        double iloczyn = liczba1 * liczba2;
        System.out.println("Wynik to : " +iloczyn);
    }



}
