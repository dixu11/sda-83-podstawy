package rozwiazania.zad38enkapsulacja;

import rozwiazania.zad34.Samochod;

import java.util.Scanner;

public class SamochodSerwis {

    public Samochod przygotujSamochod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaki masz model?");
        String model = scanner.nextLine();
        System.out.println("Jaki przebieg?");
        int przebieg = scanner.nextInt();

        Samochod twojSamochod = new Samochod(model, przebieg);
        System.out.println("Twój samochód: " + twojSamochod);
        return twojSamochod;
    }

    public void sprawdzPrzeglady(Samochod twojSamochod) {
        System.out.println("Do przegladu przy: " + twojSamochod.getCoIlePrzeglad() + " km");
        if (twojSamochod.ileDoPrzegladu() > 0) {
            System.out.println("Do przeglądu zostało : " + twojSamochod.ileDoPrzegladu());
        } else {
            System.out.println("Przeglad trzeba było zrobić " + -twojSamochod.ileDoPrzegladu() + " km temu!");
        }
    }

    public void zrobPrzeglad(Samochod samochod){
        System.out.println("Robie przegląd samochodu");
        int ileDoPrzegladu = samochod.getCoIlePrzeglad();
        samochod.setCoIlePrzeglad(ileDoPrzegladu* 2);
    }
}

