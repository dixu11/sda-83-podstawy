package petleWhile;

import java.util.Scanner;

class WhileDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile razy wykonać pętle?");

        int ileRazy = scanner.nextInt();

        int numerWykonania = 0;

        while(numerWykonania < ileRazy) {   // tak dlugo jak numer wykonania jest mniejszy niż "ileRazy" (10)
            System.out.println(numerWykonania + 1  + ". Hello");
            numerWykonania = numerWykonania + 1;
//            numerWykonania +=1; -> to samo
//            numerWykonania++; -> to samo (inkrementacja)
        }
        System.out.println("Koniec pętli!");

    }
}
