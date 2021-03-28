package powtorka;

import java.util.Arrays;

public class PowtorkaTablicePetle {
    public static void main(String[] args) {
        double[] numbers = new double[5]; // podstawowy sposób przygotowania tablicy
        numbers[0] = 123.456; // wstawienie czegoś do tablicy
        numbers[2] = 34.5;
        numbers[4] = 45.77;

        char[] letters = new char[]{'J','A','V','A'}; // skrócony sposób tworzenia tablicy - od razu uzupełniamy
       // char[] letters2 = {'J','A','V','A'};  // jeszcze krótszy sposób


        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        System.out.println(" ---- ");

        //przeglądanie pętlą for:
        for(int i = 0; i< numbers.length  ;  i++ ){
            double number = numbers[i];
            System.out.println(number);
        }
        //fori -> skrót

        System.out.println(" --- ");

        for( double number : numbers ){ // pętla for-each jest krótksza ale nie można nią modyfikować i trzeba przeglądać w standardowej kolejności
            System.out.println(number);
        }
        //iter -> skrót

        System.out.println(Arrays.toString(numbers)); // szybki sposób zaprezentowania zawartości tablicy


    }
}
