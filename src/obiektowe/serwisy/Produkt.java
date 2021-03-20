package obiektowe.serwisy;

public class Produkt {
    //cechy
   private String nazwa;
   private int ilosc;
   private double cena;

    //konstruktory
   /* public Produkt(){ //bez typu zwracanego, nazwa taka jak klasa
        nazwa = "";
        ilosc = 1;
        cena = -1;
    }*/

    public Produkt(String nowaNazwa, int nowaIlosc, double nowaCena){
        nazwa = nowaNazwa;
        ilosc = nowaIlosc;
        cena = nowaCena;
    }



    //zachowania
    /*public void wyswietlProdukt() {
        System.out.println("Produkt: " + nazwa);
        System.out.println("Ilość: " + ilosc + "sztuk");
        System.out.println("Cena: " + dajLacznaCene() + " zł");
    }*/

    public double dajLacznaCene (){
        return ilosc * cena;
    }

    public void zwiekszeCene(double ileProcent) {
        cena = cena * (ileProcent+1);
    }

    public String toString(){
       return "Nazwa: " + nazwa + " ilość: " + ilosc + " cena: " + dajLacznaCene();
    }

    public String getNazwa(){
        return nazwa;
    }

}
