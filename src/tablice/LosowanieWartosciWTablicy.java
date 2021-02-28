package tablice;

import java.util.Random;

class LosowanieWartosciWTablicy {
    public static void main(String[] args) {
        double[] ceny = new double[100000000];


        Random random = new Random();

       // System.out.println("Losowa cena to: " + losowaCena*100 + "zł");

        int i = 0;
        while (i < ceny.length){
            double losowaCena = random.nextDouble()* 100;
            ceny[i] = losowaCena;
            i++;
        }

        i = 0;
        while (i<ceny.length){
            System.out.println(ceny[i]);
            i++;
        }

    }
}
