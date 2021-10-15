package builder_examples.builder_with_director.car;

import builder_examples.builder_with_director.abstarct_entitys.Engine;
import builder_examples.builder_with_director.abstarct_entitys.Transmission;
import builder_examples.builder_with_director.abstarct_entitys.TransportManufacturers;
import builder_examples.builder_with_director.abstarct_entitys.TypeEngine;
import builder_examples.builder_with_director.car.builders.MainCarBuilder;

/**
 * В данном случае я реализовал 2 директора (DirectorForBus, DirectorForCar)
 * для того что бы детальней в методах описывать конструкцию определенного продукта
 * в данном директоре реализации продукта автомобилей. 
 */
public class DirectorForCar {

    public Object constructSportsCar(MainCarBuilder builder,
                                  TransportManufacturers transportManufacturers) {
        builder.setTransportManufacturers(transportManufacturers);
        builder.setType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, TypeEngine.PETROL, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setGpsNavigator(true);
        builder.setSeatingPlaces(4);
        builder.setPages(100);

        return builder.getResult();
    }

    public Object constructCityCar(MainCarBuilder builder,
                                TransportManufacturers transportManufacturers) {
        builder.setTransportManufacturers(transportManufacturers);
        builder.setType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, TypeEngine.PETROL, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setGpsNavigator(true);
        builder.setSeatingPlaces(2);
        builder.setPages(90);

        return builder.getResult();
    }

    public Object constructSUV(MainCarBuilder builder,
                            TransportManufacturers transportManufacturers) {
        builder.setTransportManufacturers(transportManufacturers);
        builder.setType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, TypeEngine.DIESEL, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGpsNavigator(true);
        builder.setSeatingPlaces(5);
        builder.setPages(111);

        return builder.getResult();
    }

}
