package transport;

public class Track extends Transport<DriverC> {

    enum LoadCapacity {
        N1(0, 3.5f),
        N2(3.5f, 12.0f),
        N3(12.0f, 0);

        private float minWeight;
        private float maxWeight;

        LoadCapacity(float minWeight, float maxWeight) {
            this.minWeight = minWeight;
            this.maxWeight = maxWeight;
        }

        public float getMinWeight() {
            return minWeight;
        }

        public float getMaxWeight() {
            return maxWeight;
        }

        @Override
        public String toString() {
            if (minWeight == 0 && maxWeight > 0) {
                return " Грузоподъемность до " + maxWeight + " тонн";
            }
            if (minWeight > 0 && maxWeight > minWeight) {
                return " Грузоподъемность от " + minWeight + " тонн, до " + maxWeight + " тонн";
            }
            if (maxWeight == 0 && minWeight > 0) {
                return " Грузоподъемность свыше " + minWeight + " тонн";
            }
            return "некорректные данные";
        }
    }
        Enum loadCapacity;

        public Track(String brand, String model, double engineVolume, DriverC driver, Enum loadCapacity, Mechanic mechanic) {
            super(brand, model, engineVolume, driver, mechanic);
            this.loadCapacity = loadCapacity;
        }

    public Enum getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Enum loadCapacity) {
        this.loadCapacity = loadCapacity;
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
    public void printType() {
        if (getBrand() == null || getModel() == null || getLoadCapacity() == null){
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println(getBrand() + " " + getModel() +" " + getLoadCapacity());
    }

    @Override
    public void pitStop() {
        System.out.println("pit-Stop at track");

    }
    @Override
    public void passDiagnostics() {
        System.out.println("pass diagnostics for the track");
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
    @Override
    public String repair(){
        return "repair truck";
    }

    @Override
    public String toString() {
        return "Track " + super.toString() + loadCapacity ;
    }
}
