package rozwiazania;

import java.util.Random;

public class Zad24 {

    public static void main(String[] args) {
        System.out.println( zwrocUlubiona());
        System.out.println(zwrocSume(2, 4, 6));
        System.out.println(zwrocSume(345, 567.5, 23));
        System.out.println(losujLiczby());
    }

//    metoda zwraca Twoją ulubioną liczbę. Przyjmij do zmiennej w main i wyświetl wartość zwróconą
//    metoda przyjmuje trzy liczby i zwraca ich sumę
//    metoda losuje liczbę od 1 do 10 i zwraca

    public static int zwrocUlubiona(){
        return 25;
    }

    public static double zwrocSume(double a, double b, double c){
        return a + b + c;
    }

    public static int losujLiczby(){
        Random random = new Random();
        int wylosowana = random.nextInt(10) + 1;
        return wylosowana;
    }

}
