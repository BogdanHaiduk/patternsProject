package builder_examples.builder_with_director.bus.builders;

import builder_examples.builder_with_director.abstarct_entitys.*;
import builder_examples.builder_with_director.bus.Bus;
import builder_examples.builder_with_director.bus.BusType;
import lombok.Setter;

/**
 * Конкретный строитель автобусов реализует шаги,
 * для постройки автобусов.
 */
@Setter
public class BusBuilder extends MainBusBuilder {
    private TransportManufacturers transportManufacturers;
    private Type type;
    private int seats;
    private int seatingPlaces;
    private int standingPlaces;
    private Engine engine;
    private Transmission transmission;
    private boolean gpsNavigator;

    @Override
    public Bus getResult() {
        return new Bus(
                transportManufacturers,
                (BusType) type, seats, seatingPlaces,
                standingPlaces, standingPlaces + seatingPlaces,
                engine, transmission, gpsNavigator
        );
    }
}