package biblioteki;

import java.util.Scanner;

public class BibliotekiDemo {

    public static void main(String[] args) {
        isTextDigit("123abc");


        String tekst = "Abcdefg";
        char litera = '9';


        System.out.println( Character.isDigit(litera));

//        Short, Integer, Long, Float, Double, Boolean, Character
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kod pocztowy");
        String kodPocztowy = scanner.nextLine();
        //String kodPocztowy = "70-391"; // sumować wartości w kodzie (70+391)

        if(!kodPocztowy.contains("-")){
            System.out.println("Kod powinien zawerać \"-\"");
            return;
        }

        String[] podzielony = kodPocztowy.split("-");

        if(!isTextDigit(podzielony[0]) || !isTextDigit(podzielony[1])  ){
            System.out.println("Nie można stosować znaków");
            return;
        }

        int lewa =  Integer.parseInt(podzielony[0]);
        int prawa = Integer.parseInt(podzielony[1]);
        int suma = lewa + prawa;
        System.out.println("Suma liczb w kodzie: " + suma);

//        System.out.println(Integer.MAX_VALUE);

        System.out.println(Math.random());// tak samo jak Random   i nextDouble
        System.out.println(Math.pow(10, 2));
        int zaokraglonaDoCalosci = (int) Math.round(123.987);
        System.out.println(zaokraglonaDoCalosci);

    }

    public static boolean isTextDigit(String numbers){
        for(int i =0; i<numbers.length(); i++){
            char litera = numbers.charAt(i);
           if(!Character.isDigit(litera)){
               return false;
           }
        }
        return true;
    }


}
