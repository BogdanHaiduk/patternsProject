package builder_examples.builder_with_director.abstarct_entitys;

import lombok.Getter;


/**
 * Двигатель - одна из неотъемлемых частей практически любого вида транспорта
 */
@Getter
public class Engine {
    private final double volume;
    private final TypeEngine type;
    private double mileage;
    private boolean started;

    public Engine(double volume, TypeEngine type, double mileage) {
        this.volume = volume;
        this.type = type;
        this.mileage = mileage;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", mileage=" + mileage +
                '}';
    }

}
