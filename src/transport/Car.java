package transport;

import java.util.regex.Pattern;

public class Car extends Transport<DriverB> {


    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
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
    public void pitStop() {
        System.out.println("pit-Stop at car");

    }

    @Override
    public void theBestTimeLap() {
        int min = 15;
        int max = 20;
        int bestTime = (int) (min + (max - min) * Math.random());
        System.out.println("the best time lap for car" + bestTime);
    }

    @Override
    public void maxSpeed() {
        int min = 110;
        int max = 210;
        int maxSpeed = (int) (min + (max - min) * Math.random());
        System.out.println("msx speed for car" + maxSpeed);
    }
}
