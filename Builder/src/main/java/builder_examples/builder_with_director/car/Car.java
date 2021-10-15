package builder_examples.builder_with_director.car;

import builder_examples.builder_with_director.abstarct_entitys.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Конечны продукт, который мы получим в CarBuilder
 */
@Getter
@AllArgsConstructor
@ToString
public class Car extends Transport {
    private final TransportManufacturers transportManufacturers;
    private final CarType type;
    private final int seats;
    private final int seatingPlaces;
    private final Engine engine;
    private final Transmission transmission;
    private final boolean gpsNavigator;
}
