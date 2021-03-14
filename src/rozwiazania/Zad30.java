package rozwiazania;

public class Zad30 {


//    Napisz metodę liczącą, która przyjmie dwie liczby oraz znak równania (+,-,* lub /).
//    Za pomocą instrukcji switch dobierz do znaku odpowiednią operację na podanych liczbach
//    i zwróć jej wynik.

    public static void main(String[] args) {
        System.out.println(policz(10, 10, '+'));
        System.out.println(policz(10, 10, '-'));
        System.out.println(policz(10, 10, '*'));
        System.out.println(policz(10, 10, '/'));
        System.out.println(policz(10, 0, '/'));
        System.out.println(policz(10, 0, 'R'));
    }

    public static double policz(double a, double b, char operator){ // operator: '+', '-','*','/'
        switch (operator){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                if(b == 0){
                    return -1;
                }
                return a/b;
            default:
                return -1;
        }
    }


}
