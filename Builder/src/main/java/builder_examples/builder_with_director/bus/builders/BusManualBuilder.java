package builder_examples.builder_with_director.bus.builders;

import builder_examples.builder_with_director.abstarct_entitys.*;
import builder_examples.builder_with_director.bus.BusManual;
import builder_examples.builder_with_director.bus.BusType;
import lombok.Setter;

/**
 * Конкретный строитель автобусных инструкций реализует шаги,
 * для постройки инструкций для эксплуатации автобусов.
 */
@Setter
public class BusManualBuilder extends MainBusBuilder {
    private TransportManufacturers transportManufacturers;
    private Type type;
    private Engine engine;
    private Transmission transmission;
    private boolean gpsNavigator;
    private int pages;

    @Override
    public BusManual getResult(){
        return new BusManual(transportManufacturers, (BusType) type, engine, transmission, gpsNavigator, pages);
    }
}
