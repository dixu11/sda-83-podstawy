package rozwiazania.zad34v2;


public class Car {

    //cechy - pola
   private String brand;
   private double mileage;
   private double overviewAt;

    //konstruktory
    public Car(String aBrand){
        brand = aBrand;
        mileage = 0;
        overviewAt = 20_000;
    }

    public Car(String aBrand,double aMileage){
        brand = aBrand;
        mileage = aMileage;
        overviewAt = 20_000;
    }

    //zachowania - metody
/*    public void show() {
        System.out.println("Marka: " + brand + " przebieg: " + mileage + " Km");
    }*/

    public String toString(){
        return "Marka: " + brand + " przebieg: " + mileage + " Km";
    }

    public void ride(double distance){
        mileage += distance;
    }

    public double howManyToOverview(){
        return overviewAt - mileage;
    }

    //getter - metoda pozwalająca na odczyt pola
    public String getBrand(){
        return brand;
    }

    //setter - metoda pozwalająca na modyfikację pola
    public void setOverviewAt(double aOverviewAt){
        overviewAt = aOverviewAt;
    }


}
