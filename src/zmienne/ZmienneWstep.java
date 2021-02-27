package zmienne;

class ZmienneWstep {
    public static void main(String[] args) {
        //String
        //int
        //double
        //char
        //boolean

        String imie = "Daniel";
        double cenaProduktu = 3000.0;
        int iloscRat = 24;
        char litera = 'J';
        boolean premiaZaIloscRat = iloscRat >20;

        System.out.println("Kupujący: " + imie);
        System.out.println("Produkt kosztuje : " + cenaProduktu + "zł");
        System.out.println("Produkt na " + iloscRat + " rat kosztuje: " + cenaProduktu / iloscRat);
        double cenaZPodatkiem = cenaProduktu/iloscRat * 1.21;
        System.out.println("Cena z podatkiem 21% to " + cenaZPodatkiem);
        System.out.println("Naliczono rabat za ilosc rat: " + premiaZaIloscRat);


    }
}
