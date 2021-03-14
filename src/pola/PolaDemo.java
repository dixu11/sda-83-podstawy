package pola;

public class PolaDemo {

 static String haslo;  //pole - zmienna zadeklarowana w klasie nie w metodzie
    //pole musi być statyczne żeby było dostępne w metodzie statycznej
    //jeśli nic nie ustawimy w polu - ustawia się ono na domyślną wartość


    public static void main(String[] args) {
        System.out.println(haslo); // pole jeszcze nie ustawione - null
//        int liczba;
//        System.out.println(liczba); // zmienna lokalna(w metodzie) nie ustawiona -> błąd, nie da się wyświetlić
        generujHaslo();
        System.out.println("Ustawiam hasło, hasło ustawione " + haslo);
        wyswietlZakodowaneHaslo();
        sprawdzCzyZgadlem();
    }

    public static void generujHaslo() {

        haslo = "gdzie kucharek 6 tam nie ma co jesc";
        System.out.println(haslo);

    }

    public static void wyswietlZakodowaneHaslo() {
        System.out.println("Hasło podstawowe: " + haslo);
        System.out.println("Po zakodowaniu: " + "____ _____ _ ___ ___ __ __ ____");
    }

    public static void sprawdzCzyZgadlem(){
        System.out.println(haslo);
        // szukanie w ustawionym hasle czy jest litera poszukiwana
    }

}
