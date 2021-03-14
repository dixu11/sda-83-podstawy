package metodyString;

import java.util.Locale;

public class StringDemo {

    public static void main(String[] args) {
        String tekst= "Ala ma kota";
        char litera = 'A';

      String duzymiLiterami = tekst.toUpperCase(); // zwieksz do duzych liter
       // System.out.println(tekst.toUpperCase());
        System.out.println(tekst);
        System.out.println(duzymiLiterami);
        System.out.println(tekst.substring(2,8));
        System.out.println(tekst.isEmpty());
        System.out.println(tekst.charAt(0));
        System.out.println(tekst.length());

        if (tekst.length() > 5) {
            System.out.println("Długi tekst");
        } else {
            System.out.println("Krótki tekst");
        }

        System.out.println(tekst.equalsIgnoreCase("ala ma kota"));
        System.out.println(tekst.trim()); // wywala białe znaki na poczatku i na koncu
        System.out.println(tekst.endsWith("kota"));
        String data = "1990-10-26";
      String[] tablica =  data.split("-"); // dzieli po fragmencie, dajac tablice

        String rok = tablica[0];
        String miesiac = tablica[1];
        String dzien = tablica[2];

        System.out.println(rok);
        System.out.println(miesiac);
        System.out.println(dzien);

        System.out.println(tekst.indexOf("ma")); // zwraca pozycje tego fragmentu
        System.out.println(tekst.repeat(5).length()); // buduje tekst 5x i zlicza laczna dlugosc
        System.out.println(tekst.concat(" coś tam jeszcze na koniec doklejone do zdania!")); // dokleja tekst
        System.out.println(tekst.concat(". ").repeat(5));
        System.out.println(tekst.toLowerCase().contains("ala")); // aby lapalo bez wzgledu na wielkosc liter
    }

}
