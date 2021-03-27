package obiektowe.serwisy;


import java.util.Arrays;
import java.util.Scanner;

public class MagazynDemo {
    public static void main(String[] args) {
        Magazyn magazyn = new Magazyn();
        Produkt[] produkty =   magazyn.przygotujProdukty();
        System.out.println(Arrays.toString(produkty));
        magazyn.doKtorychDarmowaWysylka(produkty);
    }
}
