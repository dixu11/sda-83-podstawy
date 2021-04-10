package obiektowe.bankomat;

import java.util.Scanner;

//klasa która decyduje o tym jak korzystamy z bankomatu
public class BankomatController {

    private Bankomat bankomat;

    public BankomatController(Bankomat bankomat) {
        this.bankomat = bankomat;
    }

    public void withdrawMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pin");
        int typedPin = sc.nextInt();
        if (bankomat.isPinCorrect(typedPin)) {
            System.out.println("correct");
        } else {
            System.out.println("notCorrect");
            return;
        }
        System.out.println("Ile na dziś mordo?");
        int howMoneyYouNeed = sc.nextInt();

        if (!bankomat.hasEnoughMoney(howMoneyYouNeed)) {
            System.out.println("Nie posiadasz tyle ziomuś");
            return;
        }

        bankomat.takeMoney(howMoneyYouNeed);
        System.out.println("Wypłaciłeś: " + howMoneyYouNeed);
        System.out.println("W bankomacie pozostało:");
        System.out.println(bankomat.getMoney() + " zł");

    }

    @Override
    public String toString() {
        return "BankomatController{" +
                "bankomat=" + bankomat +
                '}';
    }
}
