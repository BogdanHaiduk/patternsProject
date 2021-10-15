package builder_examples.builder_with_director.bus;

import builder_examples.builder_with_director.abstarct_entitys.Engine;
import builder_examples.builder_with_director.abstarct_entitys.Transmission;
import builder_examples.builder_with_director.abstarct_entitys.Transport;
import builder_examples.builder_with_director.abstarct_entitys.TransportManufacturers;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


/**
 * Конечны продукт, который мы получим в BusBuilder
 */
@Getter
@AllArgsConstructor
@ToString
public class Bus extends Transport {
    private final TransportManufacturers transportManufacturers;
    private final BusType type;
    private final int seats;
    private final int seatingPlaces;
    private final int standingPlaces;
    private final int allPlaces;
    private final Engine engine;
    private final Transmission transmission;
    private final boolean gpsNavigator;
}
