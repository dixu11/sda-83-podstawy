package zmienne;

class ZmiennePraktyka {
    public static void main(String[] args) {
        int liczba;  // deklaracja zmiennej

        liczba = 3; // inicjalizacja zmiennej (przypisanie wartosci/literalu)
        System.out.println(liczba);

        int iloscProduktow= 10;
        System.out.println(iloscProduktow);

        //nadpisywanie nową wartością (zamienia wartosc przechowywana w zmiennej)
        iloscProduktow = 20;

        System.out.println(iloscProduktow);

        //dokładanie wartości
        iloscProduktow = iloscProduktow + 50;

        System.out.println("Po dostawie mamy : " + iloscProduktow);

        iloscProduktow += 5;
        System.out.println("Dorzuciło 5 i mamy: " + iloscProduktow);

        //zmiana znaku na przeciwny
        iloscProduktow *= -1;
        System.out.println(iloscProduktow);
        iloscProduktow *= -1;
        System.out.println(iloscProduktow);

        iloscProduktow = - iloscProduktow;
        System.out.println(iloscProduktow);

    }
}
