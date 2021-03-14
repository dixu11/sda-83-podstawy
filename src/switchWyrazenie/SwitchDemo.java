package switchWyrazenie;

import rozwiazania.Projekt2Loteria;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("1. Zagraj w loterie");
        System.out.println("2. Zagraj w za wysoko/za nisko");
        System.out.println("3. Zagraj w kamień papier nożyce");
        System.out.println("4. Zagraj w kamień papier nożyce");
        System.out.println("5. Zamknij program");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz numer opcji która wybierasz");
        int wybranaOpcja = scanner.nextInt();

        System.out.println("NA IFACH");
        if(wybranaOpcja == 1){
            Projekt2Loteria.zagrajWLoterie();
        }else if(wybranaOpcja == 2){
            System.out.println("Za wysoko za nisko...");
        }else if(wybranaOpcja == 3|| wybranaOpcja == 4){
            System.out.println("Kamień papier");
        }else if(wybranaOpcja == 5){
            System.out.println("Zamknij");
        }else {
            System.out.println("Nie ma takiej opcji");
        }

        System.out.println("NA SWITCHU ");
        switch (wybranaOpcja){
            case 1:
                Projekt2Loteria.zagrajWLoterie();
                break; // break przerywa całego switch i wykonuje sie tylko case 1
            case 2:
                System.out.println("Za wysoko za nisko...");
                break;
            case 3: // bez break od razu idzie do 4
            case 4:
                System.out.println("Kamień papier");
                break;
            case 5:
                System.out.println("Zamknij");
                break;
            default: // dla wszystkich innych wartości
                System.out.println("Nie ma takiej opcji");
        }

    }
}
