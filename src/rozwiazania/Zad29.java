package rozwiazania;

import java.util.Scanner;

public class Zad29 {

    /*Stwórz metodę, i przekaż jej jako parametr stronę świata. Metoda ma symulować poruszanie się po
    wirtualnym świecie
        w 4 możliwych kierunkach.W mainie zapytaj użytkownika, w którą stronę chce się udać.  Może napisać:
    północ
            południe
    wschód
            zachód

    Zastosuj instrukcję warunkową switch aby, w zależności którą stronę wybrał, zwrócić mu inny komunikat Np.
    “Wyruszyłeś do stolicy przez las na wschodzie, po drodze zostałeś napadnięty przez bandytów, rozpoczyna
    się walka!”

    Podpowiedź: aby przypisać kod do sytuacji w której nie znaleziono pasującej wartości w switchu
    zastosuj słowo kluczowe “default” zamiast “case”.*/

    public static void main(String[] args) {
        String strona = wybierzKierunek();
        System.out.println("Co się stało się? " + idzWWybranaStrone(strona));

    }

    public static String wybierzKierunek() {
        Scanner sc = new Scanner(System.in);
        System.out.println("W którą stronę świata idziesz? północ/południe/wschód/zachód");
        String strona = sc.nextLine();
        return strona;
    }


    public static String idzWWybranaStrone(String strona) {
        switch (strona) {
            case "północ":
                return "na północy grasują lodowe trole! uważaj";
            case "południe":
                return "wracasz do miasta";
            case "wschód":
                return "magiczny las";
            case "zachód":
                return "mordor";
            default:
                return "Nieznany kierunek, zdecyduj się!";
        }
    }


}
