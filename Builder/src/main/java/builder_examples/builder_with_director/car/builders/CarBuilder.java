package builder_examples.builder_with_director.car.builders;

import builder_examples.builder_with_director.abstarct_entitys.Engine;
import builder_examples.builder_with_director.abstarct_entitys.Transmission;
import builder_examples.builder_with_director.abstarct_entitys.TransportManufacturers;
import builder_examples.builder_with_director.abstarct_entitys.Type;
import builder_examples.builder_with_director.car.Car;
import builder_examples.builder_with_director.car.CarType;
import lombok.Setter;

/**
 * Конкретный строитель автомобилей реализует шаги,
 * для постройки автомобилей.
 */
@Setter
public class CarBuilder extends MainCarBuilder {
    private TransportManufacturers transportManufacturers;
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private boolean gpsNavigator;
    private int seatingPlaces;

    @Override
    public Object getResult() {
        return new Car(
                transportManufacturers,
                (CarType) type, seats, seatingPlaces,
                engine, transmission,gpsNavigator
        );
    }
}
