package inne;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

class WczytwanieDanych {

    public static void main(String[] args) throws IOException {
  /*      Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst:");
        String tekst = scanner.nextLine();
        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();
        System.out.println("Podano:");
        System.out.println(tekst);
        System.out.println(liczba);*/

        //to samo przez BufferedReader
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj tekst:");
        String tekst = reader.readLine();
        System.out.println("Podaj liczbę:");
        int liczba =Integer.parseInt(reader.readLine()) ;
        System.out.println("Podano:");
        System.out.println(tekst);
        System.out.println(liczba);*/

        //to samo przez okienko
        JOptionPane.showMessageDialog(null, "Hello!");
        String tekst = JOptionPane.showInputDialog(null, "Podaj tekst");
        System.out.println("pdano:");
        System.out.println(tekst);
    }

}
