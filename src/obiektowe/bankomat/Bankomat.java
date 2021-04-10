package obiektowe.bankomat;

import java.util.Scanner;

//reprezentuje uniwersalne zasady dzialania bankomatu
public class Bankomat {

    private double money;
    private int pin;

    public Bankomat(double money, int pin) {
        this.money = money;
        this.pin = pin;
    }

    void takeMoney(double howMoneyYouNeed) {
        money = money - howMoneyYouNeed;
    }

    public boolean hasEnoughMoney(double howMoneyYouNeed){
        return money <= howMoneyYouNeed;
    }

    public boolean isPinCorrect(int pin){
        if (this.pin == pin) {
            return true;
        } else {
            return false;
        }
    }

    public double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Bankomat{" +
                "money=" + money +
                ", pin=" + pin +
                '}';
    }

}
