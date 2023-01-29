package transport;

public class Bus extends Transport<DriverD> {


    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public double validateEngineVolume(double engineVolume) {
        return (engineVolume == 0) ? 6.5 : engineVolume;
    }
    @Override
    public String validateBrand(String brand) {
        return (brand == null || brand.isBlank() || brand.isEmpty()) ? "Bus" : brand;

    }
    @Override
    public void Start() {
        System.out.println("Bus" + getBrand() + "start movement");
    }

    @Override
    public void stop() {
        System.out.println("Bus" + getBrand() + "finish movement");
    }

    @Override
    public void pitStop() {
        System.out.println("pit-Stop at bus");

    }

    @Override
    public void theBestTimeLap() {
        int min = 30;
        int max = 40;
        int bestTime = (int) (min + (max - min) * Math.random());
        System.out.println("the best time lap for bus " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int min =70;
        int max = 140;
        int maxSpeed = (int) (min + (max - min) * Math.random());
        System.out.println("msx speed for bus " + maxSpeed);
    }
}
