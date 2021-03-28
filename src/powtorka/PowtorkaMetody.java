package powtorka;

import java.util.Arrays;

public class PowtorkaMetody {
    public static void main(String[] args) {
        //korzyści z metod:
        //czytelniejszy kod
        //możliwość wykorzystania kodu z innej klasy/innego pakietu
        //krótszy kod / eliminacja powtórzeń
        //łatwiejszy podział obowiązków
        //wydajniejsze programy -> zakończenie metody zwalnia zasoby w niej zadeklarowane (zmiene)
        //korzystanie z kotowego kodu -> metody obiektów javowych (Scanner, String) biblioteki (Math, Arrays)

        catchArguments(83,"Kurs Java");
        String returnedData = sendReturnValue();
        System.out.println(returnedData);
        catchArguments(23.45);
        recursiveMethod(0);

        printArguments("a", "b","c","d","e","f","g");
        printArguments("a", "b","c","d");

    }

    static void catchArguments(int parameter1, String parameter2){
        System.out.println(parameter1);
        System.out.println(parameter2);
    }
    // wysyłanie danych do metody -> deklarujemy zmienne w nawiasie (parametry)

    static String sendReturnValue(){
        return "Java jest spoko";
    }
    // odbieranie danych z metody ( ustawiamy typ zwracny przed nazwą +
    // instrukcja return na koniec wysyła wskazane dane w miejsce wywołania)

    static void catchArguments(double parameter1){
        System.out.println(parameter1);
    }

    //dwie metody mogą nazywać się identycznie jeśli tylko różnią się typami/ilością lub kolejnością parametrów
    //overloading -> przeładowywanie metod

    static void recursiveMethod(int counter){
        counter++;
        if (counter == 10) {
            System.out.println("Stop");
            return;
        }
        System.out.println("Next method call with " + counter);
        recursiveMethod(counter); // wywołanie rekurencyjne
        System.out.println("Invocation with nr " + counter + " done" );
    }

    //rekurencja -> wywołanie metody przez nią samą -> 5 rodzaj pętli w javie

    static void printArguments(String... letters){ //  letters: tablica!
        System.out.println(letters.length);
        System.out.println(Arrays.toString(letters));
    }

    //metoda z dowolną ilością argumentów -> varargs


}
