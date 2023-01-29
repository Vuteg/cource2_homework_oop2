package transport;

public class Track extends Transport<DriverC> {


    public Track(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public double validateEngineVolume(double engineVolume) {
        return (engineVolume == 0) ? 8.0 : engineVolume;
    }
    @Override
    public String validateBrand(String brand) {
        return (brand == null || brand.isBlank() || brand.isEmpty()) ? "Track" : brand;}

    @Override
    public void Start() {
        System.out.println("Track" + getBrand() + "start movement");
    }

    @Override
    public void stop() {
        System.out.println("Track" + getBrand() + "finish movement");
    }
    @Override
    public void pitStop() {
        System.out.println("pit-Stop at track");

    }

    @Override
    public void theBestTimeLap() {
        int min = 20;
        int max = 30;
        int bestTime = (int) (min + (max - min) * Math.random());
        System.out.println("the best time lap for track " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int min =90;
        int max = 170;
        int maxSpeed = (int) (min + (max - min) * Math.random());
        System.out.println("msx speed for track " + maxSpeed);}


}
