package builder_examples.builder_with_director.bus.builders;


import builder_examples.builder_with_director.abstarct_entitys.*;
import lombok.Setter;

/**
 * Абстрактный строитель для автобусных продуктов
 */
@Setter
public abstract class MainBusBuilder implements Builder {
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
