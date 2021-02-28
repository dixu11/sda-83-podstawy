package petleWhile;

import java.util.Scanner;

class Hasla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String podaneHaslo;
        do {
            System.out.println("Podaj hasło");
            podaneHaslo = scanner.nextLine();
        } while ( !podaneHaslo.equals("abcd") );
        System.out.println("Java jest spoko");

    }
}
