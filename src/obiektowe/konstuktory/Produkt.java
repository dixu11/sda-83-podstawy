package obiektowe.konstuktory;

public class Produkt {
    String nazwa;
    int ilosc;
    double cena;

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

}
