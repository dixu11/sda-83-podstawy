package codeReview;

import java.util.Scanner;

public class PoryRoku {
    public static void main(String[] args) {
        int miesiac = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            System.out.println("Podaj miesiąc: "); // Pętla do poprawnego wpisania miesiąca z przedziału 1-12.
            miesiac = scanner.nextInt();
            if (miesiac < 0 || miesiac > 12) {
                System.out.println("Nie ma takiego miesiąca! Podaj poprawną wartość: ");
                i--;
            }
        }
        for (int x = 0; x < 1; x++) {              // Pętla do poprawnego wpisania ilości dni w zależności od miesiąca
            System.out.println("Podaj dzień: ");
            int dzien = scanner.nextInt();
            if (dzien > 0 || dzien < 31) {
                if (miesiac == 2) {
                    if (dzien >= 28) {
                        System.out.println("Luty nie ma tyle dni! Podaj poprawną wartość: ");
                        x--;
                    }
                }
                if (miesiac < 7) {
                    if (miesiac % 2 == 0) {
                        if (dzien >= 30) {
                            System.out.println("Ten miesiąc nie ma więcej niż 30 dni! Wpisz poprawną wartość: ");
                            x--;
                        }
                    }
                }
                if (miesiac > 7) {
                    if (miesiac % 2 == 1) {
                        if (dzien >= 30) {
                            System.out.println("Ten miesiąc nie ma więcej niż 30 dni! Wpisz poprawną wartość: ");
                            x--;
                        }
                    }
                }
            }
        }
    }       // System.out.println(poraRoku(dzien,miesiac));

    public static String poraRoku(int dzien, int miesiac) {
        switch (miesiac) {
            case 1:
            case 2:
            case 3:
                if (dzien < 21) return "Zima";
            case 4:
            case 5:
            case 6:
                if (dzien < 21) return "Wiosna";
            case 7:
            case 8:
            case 9:
                if (dzien < 22) return "Lato";
            case 10:
            case 11:
            case 12:
                if (dzien < 22) return "Jesień";
        }
        return "Koniec programu!";
    }
}

