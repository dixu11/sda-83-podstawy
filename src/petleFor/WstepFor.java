package petleFor;

class WstepFor {

    public static void main(String[] args) {
        int[] liczby = {45, 56, 67, 34, 23, 45, 67, 45, 342, 323, 23, 23, 354, 456, 565, 7, 3,111,144};
        //100 a 200
        int index = 0;
        while (index < liczby.length){
            int aktualna = liczby[index];
            if(aktualna >=100 && aktualna <=200){
                System.out.println(aktualna);
            }
            index++;
        }
        System.out.println();
        for( int i = 0; i<liczby.length;i++ ){
            int aktualna = liczby[i];
            if (aktualna < 100 || aktualna > 200) {
                System.out.println(aktualna);
            }
        }


    }
}
