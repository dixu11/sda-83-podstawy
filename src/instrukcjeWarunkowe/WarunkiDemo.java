package instrukcjeWarunkowe;

import java.util.Scanner;

class WarunkiDemo {
    public static void main(String[] args) {
        System.out.println("Podaj temperaturę wody:");
        Scanner scanner = new Scanner(System.in);
        int temperatura = scanner.nextInt();

        if(temperatura > 100){
            System.out.println("Woda paruje!");
        }else if(temperatura == 0){
            System.out.println("Temperatura wynosi 0");
        } else if (temperatura<0){
            System.out.println("Woda zamarza!");
        }else if (temperatura<80){
            System.out.println("Woda w stanie płynnym");
        }else {
            System.out.println("Woda gotuje się");
        }

        // +, -, *, /, %
        //% modulo - reszta z dzielenia

        System.out.println(10 % 7);
        System.out.println( (12 % 2) == 0 ); // true // sprawdza czy liczba jest parzysta



    }
}
