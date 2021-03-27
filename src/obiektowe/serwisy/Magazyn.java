package obiektowe.serwisy;


public class Magazyn {

    public Produkt[] przygotujProdukty(){
        Produkt produkt1 = new Produkt("kubek",3,13);
        Produkt produkt2 = new Produkt("pizza",2,30);
        Produkt produkt3 = new Produkt("cola",3,6);

        Produkt[] towary = new Produkt[3];
        towary[0] = produkt1;
        towary[1] = produkt2;
        towary[2] = produkt3;
        return towary;
    }


    public void doKtorychDarmowaWysylka(Produkt[] produkty){
        double darmowaWysylkaOd = 50; // darmowa wysylka od 50 zl
        for(Produkt produkt: produkty){
            if(produkt.dajLacznaCene() >darmowaWysylkaOd){
                System.out.println("Darmowa wysyła przy: " +produkt.getNazwa());
            }else {
                System.out.println("Zwiekszam cene " + produkt.getNazwa()+ " do: ");
                System.out.println("Doliczam 10 zł");
            }
        }
    }



}
