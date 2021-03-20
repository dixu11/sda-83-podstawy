package obiektowe.serwisy;


import java.util.Arrays;

public class MagazynDemo {
    public static void main(String[] args) {
        Produkt produkt1 = new Produkt("kubek",3,13);
        Produkt produkt2 = new Produkt("pizza",2,30);
        Produkt produkt3 = new Produkt("cola",3,6);

        Produkt[] towary = new Produkt[3];
        towary[0] = produkt1;
        towary[1] = produkt2;
        towary[2] = produkt3;

        System.out.println(Arrays.toString(towary));

        Magazyn magazyn = new Magazyn();
        magazyn.doKtorychDarmowaWysylka(towary);




    }
}
