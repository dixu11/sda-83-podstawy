package instrukcjeWarunkowe;

class RozbudowaneWarunki {
    public static void main(String[] args) {
        // && -> oraz / and
        // || -> lub  / or

        // jeśli nie pada deszcz, i wróciłem z pracy to ide na spacer

        boolean deszcz = true;
        boolean wrocilemZPracy = false;
        boolean mamParasol = true;
        boolean mamyCheb = false;


        if(deszcz == false &&  wrocilemZPracy == true ){
            System.out.println("Ide na spacer");
        }else {
            System.out.println("Zostaję w domu");
        }

        // jeśli nie pada deszcz lub mam parasol to idę na spacer
        if(deszcz == false || mamParasol == true){
            System.out.println("Idę na spacer");
        }

        // jeśli pada deszcz lub nie mam parasola to oglądam telewizje
        //jeśli nie  i brakuje chleba to idę do sklepu
        //jeśli nie brakuje chleba to idę do kolegi

        if(deszcz  || !mamParasol ){
            System.out.println("Oglądam telewizje");
        }else if(! mamyCheb){
            System.out.println("Idę do sklepu po chleb");
        }else {
            System.out.println("Idę do kolegi");
        }




    }
}
