package scanner;

import java.util.Scanner;

public class ScannerProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę zwierząt");
        int ilosc = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj gatunek zwierząt");
        String gatunek = scanner.next();

        System.out.println("Ilość: " + ilosc);
        System.out.println("Gatunek: " + gatunek);

    }


}
