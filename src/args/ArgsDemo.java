package args;

import java.util.Arrays;

public class ArgsDemo {
    public static void main(String[] args) {
        // javac ArgsDemo.java  // kompilacja
        // java ArgsDemo       // uruchomienie aplikacji
        // java ArgsDemo Warszawa 12      // uruchomienie z przekazaniem argumentów

        System.out.println(Arrays.toString(args));
        System.out.println(args.length);

        if (args[0].equalsIgnoreCase("warszawa")) {
            System.out.println("Witamy w Warszawie!");
        } else {
            System.out.println("Inne miesto");
        }
    }
}
