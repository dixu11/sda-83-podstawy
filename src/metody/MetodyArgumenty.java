package metody;

import java.util.Random;

public class MetodyArgumenty {

    public static void main(String[] args) {

        Random random = new Random();

        int wylosowana = random.nextInt(1000) + 1;
        System.out.println(wylosowana);

        podniesDoPotegi(5);

        String zwierzeZMain = "Szarik";
        wyprowadzZwierzeta(zwierzeZMain,"Burek","Ruda");
        wyprowadzZwierzeta("Reksio","Maurycy","Max");


        wyprowadzZwierzeta("Filek");
        System.out.println("----------------");
        String[] stado = {"Mila","Dzeki", "Ari","Ara","Mruczek"};
        wyprowadzDuzoZwierzat(stado);
    }

    public static void podniesDoPotegi( int otrzymanaLiczba ) {
        System.out.println("Metoda otrzymała: " + otrzymanaLiczba);
        System.out.println("Potęgujemy i wychodzi...");
        int potega = otrzymanaLiczba * otrzymanaLiczba;
        System.out.println(potega);
    }

    public static void wyprowadzZwierzeta(String zwierze1, String zwierze2, String zwierze3) {
        System.out.println("Wyprowadzam zwierzęta:");
        System.out.println("Idę na spacer z: ");
//        System.out.println(zwierzeZMain);
        System.out.println(zwierze1);
        System.out.println(zwierze2);
        System.out.println(zwierze3);
    }

    public static void wyprowadzZwierzeta(String zwierze){ // wilekrotne uzywanie tej samej metody -> przeciązanie/przeladowywanie overloading
        System.out.println("Wyprowadzam " + zwierze);
    }

    public static void wyprowadzDuzoZwierzat(String[] zwierzeta){
        System.out.println("WYPROWADZAM CALA TA FERAJNE!");
        for(String zwierze: zwierzeta){
            System.out.println("Pora na: " + zwierze);
        }
        System.out.println("Wszystkie wyprowadzone!");
    }


}
