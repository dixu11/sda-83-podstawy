package rozwiazania;

public class Zad25 {

   /* Przygotuj następujące metody i przetesuj w main:
    metoda przyjmuje dwa argumenty typu double. Zwraca pierwszą liczbę podniesioną do potęgi wartości drugiej liczby.
    przetestuj powyższą metodę dla liczb 3 oraz 5, wynik zapisz do zmiennej int i wyświetl.
    Wykorzystaj rzutowanie.
    Po przekazaniu jakich wartości program będzie wyświetlać nieprawidłowe wyniki? Przetestuj to.

    przygotuj metodę przyjmującą ilość minut i zwracającą ilość milisekund będącą różnicą w czasie
    między tymi wartościami. Jako typ zwracany metody zadeklaruj wartość long. Wykorzystaj tę metodę dla
    obliczenia odstępu czasu między 5 minutami a 10 minutami. Wartość zwróconą przypisz do zmiennej int i wyświetl.
    Wykorzystaj rzutowanie. Potestuj metodę i sprawdź, jakie argumenty musiałbyś przekazać aby metoda zaczęła
    dawać niepoprawne wyniki?

    wariant trudniejszy: stwórz metodę która przyjmuje liczbę int oraz zwraca informację ile razy rzutowanie
    tej liczby na typ byte przekroczy jego maksymalną wartość.*/

    public static void main(String[] args) {
       int wynik =(int) poteguj(3, 5);
        System.out.println(wynik);
        int milisekundy =(int) konwertujNaMilisekundy(5,10);
        System.out.println(milisekundy);
    }

    public static double poteguj(double liczbaPotegowana, int potega){
        double wynik = liczbaPotegowana;
        for(int i = 1; i<potega;i++){
            wynik *= liczbaPotegowana;
        }
        System.out.println(wynik);
        return wynik;
    }

    public static long konwertujNaMilisekundy(int minuty1, int minuty2){
        int roznica = minuty2 - minuty1;
        //1 minuta -> 60 sec
        //1 sec -> 1000 ms
        long wynik = roznica * 60L * 1000;
        System.out.println(wynik);
        return wynik;
    }




}
