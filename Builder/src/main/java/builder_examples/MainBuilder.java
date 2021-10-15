package builder_examples;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс клиент создающий спортивные автомобили
 */
public class MainBuilder {
    public static void main(String[] args) {
        List<SportCar> sportCarList = new ArrayList<>();
        SportCar bmw = new SportCar.Builder("BMW").setColor("black").setMaxSpeed(300).build();
        SportCar audi = new SportCar.Builder("Audi").setColor("blue").setMaxSpeed(280).build();
        SportCar ferrari = new SportCar.Builder("Ferrari").setColor("red").setMaxSpeed(350).setCountry("Italy").build();
        sportCarList.add(bmw);
        sportCarList.add(audi);
        sportCarList.add(ferrari);
        sportCarList.forEach(System.out::println);
    }
}
