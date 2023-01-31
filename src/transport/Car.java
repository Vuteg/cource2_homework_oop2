package transport;

import java.util.regex.Pattern;

public class Car extends Transport<DriverB> {

    enum BodyType {
        SEDAN("седан"),
        HATCHBACK("хетчбэк"),
        COUPE("купе"),
        UNIVERSAL("универсал"),
        SUV("внедорожник"),
        CROSSOVER("кроссовер"),
        PICKUP("пикап"),
        VAN("фургон"),
        MINIVAN("минивэн");

        private String type;

        BodyType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return super.toString() +
                    " Тип кузова = '" + type + '}';
        }
    }
    private Enum bodyType;

    public Car(String brand, String model, double engineVolume, DriverB driver, Enum bodyType) {
        super(brand, model, engineVolume, driver);
        this.bodyType = bodyType;
    }

    public Enum getBodyType() {
        return bodyType;
    }

    public void setBodyType(Enum bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String validateBrand(String brand) {
        return (brand == null || brand.isBlank() || brand.isEmpty()) ? "Car" : brand;

    }

    @Override
    public void Start() {
        System.out.println("Car" + getBrand() + "start movement");
    }

    @Override
    public void stop() {
        System.out.println("Car" + getBrand() + "finish movement");
    }

    @Override
    public void printType() {
        if (getBrand() == null || getModel() == null || getBodyType() == null){
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println(getBrand() + " " + getModel() +" " + getBodyType());
    }

    @Override
    public void pitStop() {
        System.out.println("pit-Stop at car");

    }

    @Override
    public void theBestTimeLap() {
        int min = 15;
        int max = 20;
        int bestTime = (int) (min + (max - min) * Math.random());
        System.out.println("the best time lap for car " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int min = 110;
        int max = 210;
        int maxSpeed = (int) (min + (max - min) * Math.random());
        System.out.println("msx speed for car " + maxSpeed);
    }
    @Override
    public String toString() {
        return super.toString() + bodyType;
    }
}
