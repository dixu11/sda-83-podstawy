package rozwiazania;

import java.util.Locale;

public class Zad28 {

    static String dna = "cgccctcccgctagtatacaggacgttgcg";

    public static void main(String[] args) {
//        W nowej klasie zadeklaruj pole odpowiedniego typu o nazwie “dna”,
//        a jego treść uzupełnić losową sekwencją 30 liter wykorzystując ten generator kodu DNA.
//
//        Stwórz metody, które wykonają następujące operacje:
//        zapisanie kodu dużymi literami,
//        zmiana wszystkich A na T i wszystkich G na C,
//        przycięcie kodu do pierwszych 15 znaków,
//
//                wariant trudniejszy: wstawienie spacji co trzeci znak.

        zapiszDuzymiLiterami();
        System.out.println(dna);
        podmienLitery();
        System.out.println(dna);
        przytnijDo(15);
        System.out.println(dna);
        wstawSpacje();
    }

    public static void zapiszDuzymiLiterami(){
        dna = dna.toUpperCase();
    }

    public static void podmienLitery() {
//        dna = dna.replace("A","T");
//        dna = dna.replace("G", "C");
        dna = dna.replace("A","T").replace("G","C");
    }

    public static void przytnijDo(int ilePrzyciac){
        dna = dna.substring(0,ilePrzyciac);
    }

    public static void wstawSpacje(){
        //sposob 1 przegladania znakow z tekstu -> charAt + i
        for(int i = 0; i< dna.length();i++){
            char litera = dna.charAt(i);
            System.out.println(litera);
        }
        System.out.println("-------");
        //sposob 2 toCharArray + foreach
       char[] tablicaLiter = dna.toCharArray();
        for(char znak:tablicaLiter){
            System.out.println(znak);
        }


    }





}
