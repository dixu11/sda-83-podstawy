package wyswietlanie;

import javax.swing.*;

public class FormatedString {
    public static void main(String[] args) {
        //
        int quantity = 10;
        double price = 3.99945345657678789;
        String productName = "Mleko";

        //zwykłe drukowanie
        System.out.println("Ilość produktu: " + quantity + " cena produktu: " + price + " nazwa produktu: " + productName);

        //wykorzystanie metody printf
        //printf( <szablon tekstu> , zmienna1, zmienna2, zmienna3 itd.);
        // %d -> liczba całkowita
        // %f -> liczba zmiennoprzecinkowa
        // %s -> dla tekstu (łańcucha znaków)
        System.out.printf("Ilość produktu: %d cena produktu: %.2f nazwa produktu: %s\n",quantity,price,productName );
        System.out.println("Zrobione!");

        for (int i = 0; i < 1011; i++) {
            System.out.printf("%4d. %f\n",   i , Math.random()); // równe formatowanie przez przygotowanie odpowiedniej ilości miejsca
        }
        String preparedText = String.format("Ilość produktu: %d cena produktu: %.2f nazwa produktu: %s\n",quantity,price,productName );
        System.out.println(preparedText);
        JOptionPane.showMessageDialog(null,preparedText);
        //String.format -> pozwala przygotować Stringa bez jego drukowania -> jeśli chcemy zrobić z nim coś innego
    }
}
