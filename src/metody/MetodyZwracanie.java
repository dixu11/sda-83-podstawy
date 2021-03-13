package metody;

import java.util.Random;

public class MetodyZwracanie {

    public static void main(String[] args) {

        Random random = new Random();
        int wylosowana = random.nextInt(10);

        int otrzymana = dajLiczbe();
        System.out.println(otrzymana);
        System.out.println(dajLiczbe());
        if (dajLiczbe() > 7) {
            System.out.println("Większe");
        }

        int suma = dodajLiczby(10,7);
        System.out.println(suma);

        System.out.println(dodajLiczby(2,3));
        System.out.println(dodajLiczby(-2,3));
        System.out.println(dodajLiczby(-2,dajLiczbe()));


        double szansaNaDeszczJutro =wylosujProcent();
        System.out.println("Będzie padać na " + szansaNaDeszczJutro + " %");

        System.out.println(przygotujPrzedrostek("Zofia", 'k'));
        System.out.println(przygotujPrzedrostek("Marcin",'m'));


    }

    public static int dajLiczbe() {
        return 9;
    }

    public static int dodajLiczby (int liczba1, int liczba2){
        return liczba1 + liczba2;
    }

    public static double wylosujProcent(){
        Random random = new Random();
        double wylosowana = random.nextDouble() * 100;  // to daje 0 do 1.0
       return wylosowana;
    }

    public static String przygotujPrzedrostek(String imie, char plec){
        if (plec == 'm') {
            return "Pan " + imie;
        }else{
            return "Pani " + imie;
        }
    }

    //metoda przyjmuje imie i informacje o plci (k - kobieta - m mezczyzna) jesli
    // kobieta to zwraca tekst "Pani <imie>" jeśli mężczyzna to "Pan <imie>"




}
