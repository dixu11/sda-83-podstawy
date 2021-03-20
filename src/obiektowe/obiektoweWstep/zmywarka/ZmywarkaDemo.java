package obiektowe.obiektoweWstep.zmywarka;

public class ZmywarkaDemo {
    public static void main(String[] args) {
        Zmywarka zmywarka1 = new Zmywarka();
        zmywarka1.firma = "bosh";
        zmywarka1.wyswietlStan();
        zmywarka1.zepsujZmywarke();
        zmywarka1.wyswietlStan();
        zmywarka1.umyjNaczynia();
        System.out.println("..... zmywarka 2 ....");
        Zmywarka zmywarka2 = new Zmywarka();
        zmywarka2.umyjNaczynia();
    }
}
