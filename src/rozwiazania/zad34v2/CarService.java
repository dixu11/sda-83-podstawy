package rozwiazania.zad34v2;

import java.util.Scanner;

public class CarService {


    public Car buildCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj markę");
        String brand = scanner.nextLine();
        System.out.println("Podaj przebieg");
        double mileage = scanner.nextDouble();

        System.out.println("Przygotowuję obiekt samochód...");
        return new Car(brand, mileage); // tworzę obiekt z przekazanych danych
    }


    public void checkOverview(Car car ) {
        double mileageToOverview = car.howManyToOverview();
        if (mileageToOverview > 0) {
            System.out.println("Wykonaj przegląd dla samochodu marki "
                    + car.getBrand() + " za " + mileageToOverview + " km");
        } else {
            System.out.println("Przegląd trzeba było zrobić " +
                    -mileageToOverview + "km temu!");
            // zmiana znaku na przeciwny -> '-' przed zmienną
        }
    }

    public void doOverview(Car car){
        System.out.println("Wykonuję przegląd");
        car.setOverviewAt(40_000);
        //car.overviewAt = 40_000;
    }



}
