package petleWhile;

import java.util.Scanner;

class Zad14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisuj punkty cząstkowe, nakoniec podliczymy je razem");
        int punkty;
        int wszystkiePunkty=0;

         do{
            System.out.println("Ile punktów otrzymałeś? Zakończ wpisując -1");
            punkty = scanner.nextInt();
            wszystkiePunkty += punkty;
        }while (punkty != -1);

        wszystkiePunkty++;
        System.out.println("Lacznie otrzymałeś punktów: " + wszystkiePunkty);

//        do {
//
//        }while (warunek);
    }
}

//do-while -> minimum 1 raz
