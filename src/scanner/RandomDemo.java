package scanner;

import java.util.Random;

class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Wylosujmy liczbę od 1 od 5:");
        System.out.println("Wylosowaliśmy:");
        int wylosowana = random.nextInt(5); // 0 do 4
        wylosowana = wylosowana +1; // 1 do 5

        System.out.println(wylosowana);
    }
}
