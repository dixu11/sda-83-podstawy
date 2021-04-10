package obiektowePowtorka;

public class OsobaDemo {

    public static void main(String[] args) {
        Osoba osoba = new Osoba();
        Osoba osoba2 = new Osoba();
        Osoba osoba3 = new Osoba();

        System.out.println(osoba);
        System.out.println(osoba2);
        System.out.println(osoba3);

        osoba.imie = "Marcin";
        osoba2.imie = "Daniel";
        osoba3.imie = "Ania";

        System.out.println(osoba);
        System.out.println(osoba2);
        System.out.println(osoba3);

       String tekst =  osoba.przywitajSie();
        System.out.println(osoba2.przywitajSie());
        System.out.println(osoba3.przywitajSie().toUpperCase());

      //  int wylosowana = random.nextInt();


    }

}


class Osoba{

  String imie;

    public String przywitajSie(  ) {
        return "Cześć jestem " + imie;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                '}';
    }
}
