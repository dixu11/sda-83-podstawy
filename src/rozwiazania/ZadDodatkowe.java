package rozwiazania;

public class ZadDodatkowe {

//    void ktoraMniejsza(int, int) - metoda wyświetla mniejszą z liczb

//    przygotuj metodę która przyjmie wartość true lub false do parametru "padaDeszcz" ,
//    jeśli otrzymała true ma wyświetlić  'przygotuj parasol!' jeśli nie ' szerokiej drogi!'

    public static void main(String[] args) {
        ktoraMniejsza(4, 3);
        ktoraMniejsza(3, 3);
        ktoraMniejsza(3, 4);

        idzNaWyprawe(true);
        idzNaWyprawe(false);
    }

    public static void ktoraMniejsza(int liczba1,int liczba2){
        int mniejsza;
        if(liczba1< liczba2){
            mniejsza = liczba1;
        }else if(liczba1 >liczba2){
            mniejsza = liczba2;
        }else{
            System.out.println("Takie same");
            return; // przerywam natychmiast metodę
        }

        System.out.println("Liczba " + mniejsza + " jest mniejsza");
    }

    public static void idzNaWyprawe(boolean padaDeszcz){
        if (padaDeszcz) {
            System.out.println("Przygotuj parasol!");
        }else {
            System.out.println("Szerokiej drogi!");
        }
    }



}
