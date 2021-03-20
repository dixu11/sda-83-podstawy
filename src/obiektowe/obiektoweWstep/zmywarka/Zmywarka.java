package obiektowe.obiektoweWstep.zmywarka;

public class Zmywarka {

    //cechy
    boolean dziala = true;
    String firma;


    //zachowania
    public void wyswietlStan() {
        if (dziala) {
            System.out.println("Zmywarka firmy " + firma + " działa");
        } else {
            System.out.println("Zmywarka firmy " + firma + " nie działa");
        }
    }

    public void zepsujZmywarke() {
        dziala = false;
    }

    public void umyjNaczynia() {
        if (dziala) {
            System.out.println("Zmywarka myje");
        } else {
            System.out.println("Zmywarka wyświetla błąd");
        }
    }

}
