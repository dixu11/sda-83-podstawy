package rzutowanie;

public class KonwersjeWartosci {

    public static void main(String[] args) {

        byte liczbaByte = 127;    // 1 bajt - 8 bit
        short liczbaShort = 32000; // 2 bajty - 16 bit
        int liczbaInt = 2_145_456_546;  // 4 bajty - 32 bit
        long liczbaLong = 8_444_333_220_145_456_546L;  // 8 bajtów - 64 bit
        float zmiennoprzecinkowaFloat = 3.456789923456789F;  // 4 bajty
        double zmiennoprzecinkowaDouble = 3.456789923456789; // 8 bajtów
        System.out.println(zmiennoprzecinkowaFloat);
        System.out.println(zmiennoprzecinkowaDouble);

        boolean zmiennaBoolean = true;    // 1 bajt
        boolean zmiennaBoolean2 = liczbaByte>liczbaShort;

        char zmiennaChar = 'a';
        char zmiennaChar2 = 77;
        System.out.println(zmiennaChar2);

        double iloscPikseli = wyliczPozycje();

        wyswietlProstokatNaPozycji( (int)iloscPikseli);

        //-128   -    127
        int liczbaInt2 = 100;
        byte liczba = (byte)liczbaInt2;
        System.out.println(liczba);

        char litera = 'b';

        int indexLitery = litera;
        System.out.println(indexLitery);
        char konwersja = (char)liczbaInt2;
        System.out.println(konwersja);

    }


    public static double wyliczPozycje(){
        return 44.7;
    }

    public static void wyswietlProstokatNaPozycji (int pozycjaWPikselach){
        System.out.println("wyswietlam na pozycji: " + pozycjaWPikselach);
    }
}
