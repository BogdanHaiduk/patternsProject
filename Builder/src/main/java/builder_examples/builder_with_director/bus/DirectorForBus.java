package builder_examples.builder_with_director.bus;

import builder_examples.builder_with_director.abstarct_entitys.Engine;
import builder_examples.builder_with_director.abstarct_entitys.Transmission;
import builder_examples.builder_with_director.abstarct_entitys.TransportManufacturers;
import builder_examples.builder_with_director.abstarct_entitys.TypeEngine;
import builder_examples.builder_with_director.bus.builders.BusBuilder;
import builder_examples.builder_with_director.bus.builders.MainBusBuilder;

/**
 * В данном случае я реализовал 2 директора (DirectorForBus, DirectorForCar)
 * для того что бы детальней в методах описывать конструкцию определенного продукта
 * в данном директоре реализации продукта автобусов. 
 */
public class DirectorForBus {

    public Object constructTrolleybus(MainBusBuilder builder,
                                   TransportManufacturers transportManufacturers) {
        builder.setTransportManufacturers(transportManufacturers);
        builder.setType(BusType.TROLLEYBUS);
        builder.setSeats(3);
        builder.setEngine(new Engine(0,  TypeEngine.ELECTRIC, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setGpsNavigator(true);
        builder.setSeatingPlaces(30);
        builder.setStandingPlaces(15);
        builder.setPages(300);

        return builder.getResult();
    }

    public Object constructMiniBus(MainBusBuilder builder,
                                TransportManufacturers transportManufacturers) {
        builder.setTransportManufacturers(transportManufacturers);
        builder.setType(BusType.MINIBUS);
        builder.setSeats(2);
        builder.setEngine(new Engine(2.0, TypeEngine.PETROL, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGpsNavigator(false);
        builder.setSeatingPlaces(18);
        builder.setPages(150);

        return builder.getResult();
    }

    public Object constructDoubleDeckerBus(MainBusBuilder builder,
                                           TransportManufacturers transportManufacturers) {
        builder.setTransportManufacturers(transportManufacturers);
        builder.setType(BusType.DOUBLE_DECKER_BUS);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, TypeEngine.DIESEL, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setGpsNavigator(true);
        builder.setSeatingPlaces(60);
        builder.setStandingPlaces(20);
        builder.setPages(180);

        return builder.getResult();
    }

    public Object constructOpenTopBus(BusBuilder builder,
                                   TransportManufacturers transportManufacturers) {
        builder.setTransportManufacturers(transportManufacturers);
        builder.setType(BusType.OPEN_TOP_BUS);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, TypeEngine.DIESEL, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGpsNavigator(true);
        builder.setSeatingPlaces(60);
        builder.setStandingPlaces(0);
        builder.setPages(175);

        return builder.getResult();
    }

    public Object constructSchoolBus(BusBuilder builder,
                                  TransportManufacturers transportManufacturers){
        builder.setTransportManufacturers(transportManufacturers);
        builder.setType(BusType.SCHOOL_BUS);
        builder.setSeats(1);
        builder.setEngine(new Engine(3.0, TypeEngine.DIESEL, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGpsNavigator(false);
        builder.setSeatingPlaces(50);
        builder.setStandingPlaces(0);
        builder.setPages(145);

        return builder.getResult();

    }

}
