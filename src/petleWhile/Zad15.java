package petleWhile;

class Zad15 {
    public static void main(String[] args) {
        int i = 0;
        while (i<10){
            System.out.println(i+1);
            i++;
        }


        i = 99;
        while (i>= 66){
            System.out.println(i);
            i--;
        }

        i = 20;
        while (i<=40){
            if(i %2 == 0){
                System.out.println(i);
            }
            i++;
        }

        i = 0;
        while (i<5){
            System.out.println("Daniel");
            i++;
        }
    }
}
