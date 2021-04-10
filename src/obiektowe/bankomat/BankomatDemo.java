package obiektowe.bankomat;

public class BankomatDemo {
    public static void main(String[] args) {

        Bankomat pko = new Bankomat(123.12, 1234);
        Bankomat euro = new Bankomat(100.0, 9581);
       /* System.out.println(pko.withdrawMoney(2222));
        System.out.println(euro.withdrawMoney(9581));
        System.out.println(pko);
        System.out.println(euro);*/

        BankomatController controller = new BankomatController(pko);
        System.out.println(controller);
        controller.withdrawMoney();
    }
}

/* tak też mozna tworzyć nowe klasy
class Bankomat{


}

class BankomatController{

}*/
