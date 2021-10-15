package builder_examples.builder_with_director.abstarct_entitys;

/**
 * Общий интерфейс строителей
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setTransportManufacturers(TransportManufacturers transportManufacturers);
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setGpsNavigator(boolean gpsNavigator);
    void setSeatingPlaces(int seatingPlaces);
}
