package obiektowe.serwisy;


public class Magazyn {

    public void doKtorychDarmowaWysylka(Produkt[] produkty){
        double darmowaWysylkaOd = 50; // darmowa wysylka od 50 zl
        for(Produkt produkt: produkty){
            if(produkt.dajLacznaCene() >darmowaWysylkaOd){
                System.out.println("Darmowa wysyła przy: " +produkt.nazwa);
            }else {
                System.out.println("Zwiekszam cene " + produkt.nazwa + " do: ");
                System.out.println("Doliczam 10 zł");
            }
        }
    }



}
