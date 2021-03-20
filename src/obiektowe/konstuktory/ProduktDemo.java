package obiektowe.konstuktory;

import java.util.Random;

public class ProduktDemo {
    public static void main(String[] args) {
        Produkt produkt1 = new Produkt("kubek",3,13);
       /* produkt1.nazwa = "kubek";
        produkt1.ilosc = 3;
        produkt1.cena = 13;*/

        Produkt produkt2 = new Produkt("pizza",2,30);
       /* produkt2.nazwa = "pizza";
        produkt2.ilosc = 2;
        produkt2.cena = 30;*/

        Produkt produkt3 = new Produkt("cola",3,6);


//        produkt1.wyswietlProdukt();
//        produkt2.wyswietlProdukt();
        System.out.println(produkt1);
        System.out.println(produkt2);
        System.out.println(produkt3);

        produkt1.zwiekszeCene(0.05);
        produkt2.zwiekszeCene(0.10);

//        produkt1.wyswietlProdukt();
//        produkt2.wyswietlProdukt();

        System.out.println(produkt1.toString()); // metoda toString - odziedziczona po klasie Object
        System.out.println(produkt2); // niejawne wykorzystanie metody .toString()

    }
}
