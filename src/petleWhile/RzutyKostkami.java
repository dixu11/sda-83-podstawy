package petleWhile;

import java.util.Random;
import java.util.Scanner;

class RzutyKostkami {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ile razy rzucasz kostką?");
//        int iloscRzutow = scanner.nextInt();
        int iloscRzutow = 0;
        System.out.println("Program rzuca kostką i sumuje wyniki tak długo aż nie trafi 6");
        int suma = 0;
        int wylosowana =0;
        while (wylosowana != 6){ // tak długo jak nie wynosi 6
            Random random = new Random();
           wylosowana = random.nextInt(6) + 1;
            System.out.println("Wylosowana: " + wylosowana);
            suma += wylosowana;
            iloscRzutow++;
        }

        System.out.println("Suma wylosowanych: " + suma);
        System.out.println("Program trafił 6 po takiej ilości rzutów: " + iloscRzutow);
    }
}
