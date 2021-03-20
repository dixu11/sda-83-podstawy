package rozwiazania.zad24;

public class Samochod {
    //cechy
    String marka;
    int przebieg;
    int coIlePrzeglad =20_000;

    //zachowania
    void wyswietl(){
        System.out.println("Marka: " + marka + " przebieg: " + przebieg);
    }

    void jedz(int ile){
        przebieg += ile;
    }

    int ileDoPrzegladu(){
        int doPrzegladu = coIlePrzeglad - przebieg;
        return doPrzegladu;
    }

}
