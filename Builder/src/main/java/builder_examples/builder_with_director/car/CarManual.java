package builder_examples.builder_with_director.car;

import builder_examples.builder_with_director.abstarct_entitys.Engine;
import builder_examples.builder_with_director.abstarct_entitys.Transmission;
import builder_examples.builder_with_director.abstarct_entitys.TransportManufacturers;
import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * Конечны продукт, который мы получим в CarManualBuilder
 */
@AllArgsConstructor
@Setter
public class CarManual {
    private final TransportManufacturers transportManufacturers;
    private final CarType type;
    private final Engine engine;
    private final Transmission transmission;
    private final boolean gpsNavigator;
    private final int pages;

    @Override
    public String toString() {
        return "Bus manual for car " + transportManufacturers +
                "\n total pages " + pages +
                "\n About 'type car' -> " + type +
                "\n About 'Engine' -> " + engine +
                "\n About 'Transmission' ->" + transmission +
                "\n About 'GpsNavigator' ->" + gpsNavigator;
    }
}
