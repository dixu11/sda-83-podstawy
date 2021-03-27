package obiektowe.obiektoweWstep;

import obiektowe.obiektoweWstep.klient.Klient;

import java.util.Random;

public class ZmienneReferencyjne {
    public static void main(String[] args) {

        int zmiennaProsta = 12; // zmienne proste/prymitywne: byte,short,int,long,float,double,boolean,char
        //zmienne referencyjne: wszystkie inne
        Random zmiennaReferencyjna = new Random();
        String zmiennaReferencyjna2 = "Abcd";
        String zmiennaReferencyjna3 = new String("abcd");
        int[] zmiennaReferencyjna4 = new int[5];
        Klient klient1 = new Klient("a@a.pl","123",2);
        // Klient.mail = "abc@gmail.com"; // dostęp statyczny przez klasę

        //Klient.wyswietlDane(); // wywołanie metody statycznej
 /*
        roznice:
        zmienne proste:
             z małej litery, tylko 8
             przechowują proste dane (z ograniczeniem pamięci)

        zmienne referencyjne:
            z dużej litery (od nazwy klasy) - nieskończenie wiele
            przechowują adres obiektu (tworzone przez 'new')
            można wywoływać na nich metody
            zmienną referencyjną można ustawić na null -> brak obiektu
            wywołanie metody na zmiennej z null -> NullPointerException -> krytyczny błąd, najpopularniejszy w javie
        */
        String pusty = null; // nie wskazuje na obiekt
        String pusty2 = "";
        String pusty3 = "null";
        String pusty4 = "    ";

        //System.out.println(pusty.toUpperCase());
        System.out.println(pusty2.toUpperCase());
        System.out.println(pusty3.toUpperCase());
        System.out.println(pusty4.toUpperCase());

        Klient klient2 = new Klient( "kowalski@gmail.com","marian123",10); // null oznacza brak obiektu
        System.out.println(klient2);
        klient2.wyswietlDane();

        if (klient2.getMail() != null) { // przykład zabezpieczenia przed nullem
            System.out.println(klient2.getMail().toUpperCase());
        }


    }
}
