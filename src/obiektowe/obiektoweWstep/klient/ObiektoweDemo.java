package obiektowe.obiektoweWstep.klient;

import java.util.Random;

public class ObiektoweDemo {

    public static void main(String[] args) {

        int zmiennaProsta = 12;

        Random zmiennaReferencyjna = new Random();
        String zmiennaReferencyjna2 = "Abcd";
        String zmiennaReferencyjna3 = new String("abcd");
        int[] zmiennaReferencyjna4 = new int[5];

       // Klient.mail = "abc@gmail.com"; // dostęp statyczny przez klasę

        //Klient.wyswietlDane(); // wywołanie metody statycznej

        Klient klient1 = new Klient("kowalski@gmail.com","marian123",3);
        Klient klient2 = new Klient("zofia@interia.pl","assdgdf", 10);
        Klient klient3 = new Klient("aaa@bbb.cc","asasdsd", 5);


        System.out.println(klient1);
        System.out.println(klient2);
        System.out.println(klient3);

       /* klient1.mail = "kowalski@gmail.com";
        klient1.haslo = "marian123";
        klient1.punkty = 3;

        klient2.mail = "zofia@interia.pl";
        klient2.haslo = "assdgdf";
        klient2.punkty = 10;

        klient3.mail = "aaa@bbb.cc";
        klient3.haslo = "asasdsd";
        klient3.punkty = 5;*/

        System.out.println(klient1.mail);
        System.out.println(klient2.mail);

        klient1.wyswietlDane();
        klient2.wyswietlDane();
        klient3.wyswietlDane();

        System.out.println("......");
        klient1.doliczPunktow(100);
        klient1.wyswietlDane();



    }

}
