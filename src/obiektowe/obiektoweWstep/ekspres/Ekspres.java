package obiektowe.obiektoweWstep.ekspres;

public class Ekspres {

    //cechy
    int iloscZiarenek = 0;
    boolean nalanaWoda = false;
    boolean podstawionyKubek = false;


    //zachowania
    public void nasypKawy(int ileDosypano) {
        iloscZiarenek += ileDosypano;
    }

    public void nalejWody() {
        nalanaWoda = true;
    }

    public void podstawKubek() {
        podstawionyKubek = true;
    }


    public void przygotujKawe() {
        if (iloscZiarenek < 25) {
            System.out.println("Za mało ziarenek kawy!");
            return;
        }
        if (!nalanaWoda) {
            System.out.println("Brak wody!");
            return;
        }
        if (!podstawionyKubek) {
            System.out.println("Podstaw kubek");
            return;
        }
        System.out.println("Robimy kawe...");
        System.out.println("Oto Twoja kawa!");
        iloscZiarenek -= 20;
    }


}

//nasypac kawy
//przygotowac kubek
//nalać wodę
//wybrać program
