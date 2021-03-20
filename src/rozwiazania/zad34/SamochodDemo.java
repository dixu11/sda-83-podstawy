package rozwiazania.zad34;

public class SamochodDemo {

//    Stwórz klasę typu Samochod. Obiekty typu Samochod mają
//    mieć dwie cechy - marka i przebieg.
//    Stwórz również pole informujące o tym przy jakim przebiegu
//    powinniśmy zrobić przegląd. W klasie do testów
//    (np. SamochodDemo) przygotuj metodę main, a w niej
//    stwórz dwa obiekty typu Samochod.
//
//    Dla obiektów typu Samochod przygotuj następujące
//    funkcjonalności oraz przetestuj je w main:
//
//    Stwórz metodę wyświetlającą markę samochodu oraz przebieg
//    Stwórz metodę przyjmującą odległość do przejechania
//    i zwiększającą przebieg samochodu o tę odległość
//    Stwórz metodę zwracającą ilość kilometrów jakie można
//    przejechać przed zrobieniem przeglądu. Jeśli przebieg
//    aktualny przekracza przebieg do przeglądu możesz zwrócić
//    ujemną wartość
//
//    wariant trudniejszy: stwórz w main tablicę samochodów
//    a następnie wykorzystując pętlę wyświetl markę oraz
//    przebieg każdego z nich



    public static void main(String[] args) {
        Samochod samochod1 = new Samochod("BMW");
//        samochod1.marka = "BMW";
//        samochod1.przebieg = 0;

        Samochod samochod2 = new Samochod("TESLA");
//        samochod2.marka = "Tesla";
//        samochod2.przebieg = 0;

        samochod1.wyswietl();
        samochod2.wyswietl();

        samochod1.jedz(130);
        samochod2.jedz(400);

        samochod1.wyswietl();
        samochod2.wyswietl();

        System.out.println("S1: " + samochod1.ileDoPrzegladu());
        System.out.println("S2: " + samochod2.ileDoPrzegladu());

        System.out.println("Wariant trudniejszy:");
        Samochod[]samochody = new Samochod[2];
        samochody[0] = samochod1;
        samochody[1] = samochod2;

        for(Samochod samochod :samochody){
            samochod.wyswietl();
        }


    }
}
