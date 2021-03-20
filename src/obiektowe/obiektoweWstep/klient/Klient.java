package obiektowe.obiektoweWstep.klient;

//szablon do tworzenia obiektów klientów
public class Klient {
    //cechy
  public  String mail;
  public  String haslo;
  public  int punkty;

    //konstruktory
    public Klient(String startowyMail, String startoweHaslo, int startowePunkty) {
        mail = startowyMail;
        haslo = startoweHaslo;
        punkty = startowePunkty;
    }

    //zachowania
    public void wyswietlDane() {
        System.out.println("Dane klienta:");
        System.out.println("Mail: " + mail);
        System.out.println("Hasło: *****");
        System.out.println("Punkty: " + punkty);
        System.out.println();
    }

    public void doliczPunktow(int nowePunkty) {
        punkty += nowePunkty; // zwiekszam ilosc punktow tego klienta
    }

}
