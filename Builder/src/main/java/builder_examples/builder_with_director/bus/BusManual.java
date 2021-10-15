package builder_examples.builder_with_director.bus;

import builder_examples.builder_with_director.abstarct_entitys.Engine;
import builder_examples.builder_with_director.abstarct_entitys.Transmission;
import builder_examples.builder_with_director.abstarct_entitys.TransportManufacturers;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Конечны продукт, который мы получим в BusManualBuilder
 */
@Getter
@AllArgsConstructor
public class BusManual {
    private final TransportManufacturers transportManufacturers;
    private final BusType type;
    private final Engine engine;
    private final Transmission transmission;
    private final boolean gpsNavigator;
    private final int pages;

    @Override
    public String toString() {
        return "Bus manual for bus " + transportManufacturers +
                "\n total pages " + pages +
                "\n About 'type bus' ->" + type +
                "\n About 'Engine' -> " + engine +
                "\n About 'Transmission' ->" + transmission +
                "\n About 'GpsNavigator' ->" + gpsNavigator;
    }
}
