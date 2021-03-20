package rozwiazania.zad34;

public class Samochod {
    //cechy
   private String marka;
   private int przebieg;
   private int coIlePrzeglad =20_000;

    //konstruktory
    public Samochod(String startowaMarka){
        marka = startowaMarka;
        przebieg = 0;
    }

    public Samochod(String startowaMarka, int startowyPrzebieg){
        marka = startowaMarka;
        przebieg = startowyPrzebieg;
    }

    //zachowania
    void wyswietl(){
        System.out.println("Marka: " + marka + " przebieg: " + przebieg);
    }

    void jedz(int ile){
        przebieg += ile;
    }

   public int ileDoPrzegladu(){
        int doPrzegladu = coIlePrzeglad - przebieg;
        return doPrzegladu;
    }

    public String toString(){
        return "Marka: " + marka + " przebieg: " + przebieg;
    }

    //getter
    public int getCoIlePrzeglad(){ // pozwa odczytać wartość zmiennej "coIlePrzeglad" z innej klasy
        return coIlePrzeglad;
    }

    //setter
    public void setCoIlePrzeglad(int nowyCoIlePrzeglad){ // pozwa zmienić wartość zmiennej "coIlePrzeglad" z innej klasy
        coIlePrzeglad = nowyCoIlePrzeglad;
    }
}
