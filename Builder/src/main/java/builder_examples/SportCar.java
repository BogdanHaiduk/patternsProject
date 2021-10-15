package builder_examples;

import lombok.Getter;
import lombok.ToString;

/**
 * Класс продукт и его строитель
 */
@Getter
@ToString
public class SportCar {
    private final String model;
    private final String color;
    private final int maxSpeed;
    private final String country;

    private SportCar (Builder builder){
        this.model = builder.model;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
        this.country = builder.country;
    }

    static class Builder{
        private final String model;
        private String color;
        private int maxSpeed;
        private String country;

        public Builder(String model){
            this.model = model;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setCountry(String country){
            this.country = country;
            return this;
        }

        public SportCar build(){
            return new SportCar(this);
        }
    }

}
