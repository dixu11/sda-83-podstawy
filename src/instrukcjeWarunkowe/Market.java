package instrukcjeWarunkowe;

import java.util.Scanner;

class Market {
    public static void main(String[] args) {
        double cenaTruskawek = 14.90;
        double iloscTruskawek = 100;
        System.out.println("Witam w sklepie, truskawki kosztują " + cenaTruskawek + "zł");
        System.out.println("Ile kg chcesz kupić? Nie więcej niż " + iloscTruskawek);
        Scanner scanner = new Scanner(System.in);
        double iloscKupiona = scanner.nextDouble();
        if(iloscKupiona>iloscTruskawek){
            System.out.println("Nie mamy tyle truskawek");
            System.exit(1);
//            return;
        }
        double doZaplaty = iloscKupiona * cenaTruskawek;
        System.out.println("Do zapłaty: " + doZaplaty + "zł");
        System.out.println("Ile płacisz?");
        double kwotaZaplacona = scanner.nextDouble();
        if(doZaplaty >=kwotaZaplacona){
            System.out.println("Nie stać Cię");
            return;
        }
        double reszta = kwotaZaplacona - doZaplaty;
        System.out.println("Twoja reszta to : " + reszta + "zł");
        iloscTruskawek -= iloscKupiona;
        System.out.println("W sklepie pozostało: " + iloscTruskawek + "kg truskawek");


    }
}
