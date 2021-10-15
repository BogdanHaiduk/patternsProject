package builder_examples.builder_with_director.car.builders;

import builder_examples.builder_with_director.abstarct_entitys.Engine;
import builder_examples.builder_with_director.abstarct_entitys.Transmission;
import builder_examples.builder_with_director.abstarct_entitys.TransportManufacturers;
import builder_examples.builder_with_director.abstarct_entitys.Type;
import builder_examples.builder_with_director.car.CarManual;
import builder_examples.builder_with_director.car.CarType;
import lombok.Setter;

/**
 * Конкретный строитель автомобильных инструкций реализует шаги,
 * для постройки инструкций для эксплуатации автомобилей.
 */
@Setter
public class CarManualBuilder extends MainCarBuilder {
    private TransportManufacturers transportManufacturers;
    private Type type;
    private Engine engine;
    private Transmission transmission;
    private boolean gpsNavigator;
    private int pages;

    @Override
    public Object getResult() {
        return new CarManual(
                transportManufacturers,
                (CarType) type, engine, transmission,
                gpsNavigator, pages
        );
    }
}
