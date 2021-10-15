package builder_examples.builder_with_director;


import builder_examples.builder_with_director.abstarct_entitys.Engine;
import builder_examples.builder_with_director.abstarct_entitys.Transport;
import builder_examples.builder_with_director.abstarct_entitys.TransportManufacturers;
import builder_examples.builder_with_director.abstarct_entitys.TypeEngine;
import builder_examples.builder_with_director.bus.builders.BusBuilder;
import builder_examples.builder_with_director.bus.DirectorForBus;
import builder_examples.builder_with_director.bus.builders.BusManualBuilder;
import builder_examples.builder_with_director.bus.builders.MainBusBuilder;
import builder_examples.builder_with_director.car.*;
import builder_examples.builder_with_director.car.builders.CarBuilder;
import builder_examples.builder_with_director.car.builders.CarManualBuilder;
import builder_examples.builder_with_director.car.builders.MainCarBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс клиент создающий любые виды транспорта и их инструкции по эксплуатации
 */
public class Demo {

    public static void main(String[] args) {
        DirectorForCar directorForCar = new DirectorForCar();
        DirectorForBus directorForBus = new DirectorForBus();
        List<Transport> transports = new ArrayList<>();

        MainCarBuilder carBuilder = new CarBuilder();
        MainCarBuilder carManualBuilder = new CarManualBuilder();
        MainBusBuilder busManualBuilder = new BusManualBuilder();
        MainBusBuilder busBuilder = new BusBuilder();

        directorForCar.constructSportsCar(carBuilder, TransportManufacturers.BMW);
        carBuilder.setEngine(new Engine(5.5, TypeEngine.PETROL, 0));
        Car bmw = (Car) carBuilder.getResult();

        transports.add(bmw);
        transports.add((Transport) directorForCar.constructCityCar(carBuilder, TransportManufacturers.VOLKSWAGEN));
        transports.add((Transport) directorForCar.constructSUV(carBuilder, TransportManufacturers.VOLVO));
        transports.add((Transport) directorForBus.constructMiniBus(busBuilder, TransportManufacturers.MERCEDES));
        transports.add((Transport) directorForBus.constructTrolleybus(busBuilder, TransportManufacturers.SCANIA));

        transports.forEach(System.out::println);

        System.out.println(
                directorForBus.constructDoubleDeckerBus(busManualBuilder, TransportManufacturers.MAN)
        );
        System.out.println(
                directorForCar.constructSUV(carManualBuilder, TransportManufacturers.FORD)
        );
    }

}