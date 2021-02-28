package tablice;

class TabliceDemo {
    public static void main(String[] args) {
        int liczba1 = 23;
        int liczba2 = 55;
        int liczba3 =70;
        int liczba4 = 33;

        int[] ceny = new int[10];

        System.out.println(liczba1);
        System.out.println(liczba2);
        System.out.println(liczba3);
        System.out.println(liczba4);
        System.out.println(liczba1+liczba2+liczba3+liczba4);

        ceny[0] = 23;
        ceny[1] = 55;
        ceny[2] = 70;

        System.out.println("Ceny pierwszych 3 produktów to: " + ceny[0] + "zł " + ceny[1] + "zł " + ceny[2] + "zł");

//        System.out.println(ceny[0]);
//        System.out.println(ceny[1]);
//        System.out.println(ceny[2]);
//        System.out.println(ceny[3]);

        int i = 0;

        while (i<ceny.length){
            System.out.println(ceny[i]);
            i++;
        }

    }
}
