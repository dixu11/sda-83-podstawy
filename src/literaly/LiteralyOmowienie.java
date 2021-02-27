package literaly;

class LiteralyOmowienie {

    public static void main(String[] args) {
        System.out.println("abcde");    // to jest String - ciąg znaków
        System.out.println('a');        // to jest char - pojedynczy znak
        System.out.println("123");      // ciąg znaków
        System.out.println(123);        // to jest int - liczba całkowita


        System.out.println("10" + 10); // wynikiem będzie String - ciąg znaków
        System.out.println(10 + 10); // wynikiem będzie int - nowa liczba całkowita

        System.out.println(6/3);    // wynikiem jest liczba całkowita - int
        System.out.println(6/4);    // wynikiem też jest liczba całkowita - tracimy reszte!

        System.out.println(34.65);  // to jest literał double - liczba rzeczywista
        System.out.println(6.0/4); // wynik jest w double

        System.out.println(10 > 15);    // wynik jest boolean
        System.out.println(true);  // pojedynczy ręcznie wstawiony literał boolean
        System.out.println(false);


        System.out.println("Cena bułek: " + (0.5 + 1.07) +"zł");
    }
}
