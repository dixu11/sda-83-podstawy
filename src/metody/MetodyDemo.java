package metody;

import java.util.Scanner;

public class MetodyDemo {

    public static void main(String[] args) {

       /* Scanner scanner = new Scanner(System.in);
       System.out.println("Jak się nazywasz?");
        System.out.println("Cześć " + scanner.nextLine());*/

      /* mojaMetoda();
        System.out.println("Metoda wykonana");*/

        polskiObiad();
        System.out.println("Koniec programu");
    }

    public static void mojaMetoda(){
        System.out.println("Hello world!");
        System.out.println("Witamy w mojej pierwszej metodzie!");
    }

    public static void polskiObiad(){
       przygotowanieSkladnikow();
        System.out.println("Następny etap: przygotowanie potrawy:");
        przygotowaniePotrawy();
        System.out.println("Zakończenie:");
        zakonczenie();
    }

    public static void przygotowanieSkladnikow(){
        System.out.println("Przygotuj:");
        System.out.println("Ziemniaki");
        System.out.println("Kotlety schabowe");
        System.out.println("Ogórki");
        System.out.println("Rzeczy do panierki");
        System.out.println("Smietana");
    }

    public static void przygotowaniePotrawy() {
        System.out.println("Ugotować ziemniaki");
        System.out.println("Panierować kotlety");
        System.out.println("Usmazyc kotlety");
        System.out.println("Pokroić ogorki");
        System.out.println("Dodać smietany");
    }

    public static void zakonczenie(){
        System.out.println("smacznego!");
        System.out.println("Umyj naczynia po gościach :)");
    }

}
