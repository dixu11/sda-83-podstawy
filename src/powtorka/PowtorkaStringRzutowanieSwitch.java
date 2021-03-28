package powtorka;

import java.util.Arrays;

public class PowtorkaStringRzutowanieSwitch {

    public static void main(String[] args) {
        int number = (int) 99.99; // wymaga rzutowania - strace reszte po przecinku
        byte numberByte = (byte) 128; // wymaga rzutowania - ryzyko przekroczenia zakresu byte
        long numberLong = numberByte; // automatyczna konwersja ( bo brak ryzyka straty danych)

        System.out.println(number);
        System.out.println(numberByte);
        System.out.println(numberLong);

        //metody String
        String text = "Hello World!";
        System.out.println(text.substring(0,5));
        System.out.println(text.toUpperCase());
        System.out.println(text.startsWith("Hello"));
        System.out.println(Arrays.toString(text.split(" ")) ); // split tworzy tablice
        System.out.println(text.charAt(6));
        System.out.println(text.replace("World", "Java"));
        System.out.println(text.length());
        System.out.println(text.isEmpty());

        text += "!!";
        System.out.println(text);

        char operation = '^';
        //switch
        switch (operation){
            case '+':
                System.out.println("Dodawanie");
                break;
            case '-':
                System.out.println("Odejmowanie");
                break;
            case '*':
                System.out.println("Mnożenie");
                break;
            case '/':
                System.out.println("Dzielenie");
                break;
            case '^':
            case '%':
                System.out.println("jeszcze nie wspieramy tych operacji");
                break;
            default:
                System.out.println("Nie przewidzieliśmy takiej operacji");
        }



    }


}
