package builder_examples.builder_with_director.car.builders;

import builder_examples.builder_with_director.abstarct_entitys.*;
import lombok.Setter;

/**
 * Абстрактный строитель для автомобильных продуктов
 */
@Setter
public abstract class MainCarBuilder implements Builder {

    private TransportManufacturers transportManufacturers;
    private Type type;
    private Engine engine;
    private Transmission transmission;
    private int seats;
    private int seatingPlaces;
    private int standingPlaces;
    private boolean gpsNavigator;
    private int pages;

    public Object getResult(){
        return null;
    }

}
