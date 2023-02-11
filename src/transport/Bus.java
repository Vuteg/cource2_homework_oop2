package transport;

public class Bus extends Transport<DriverD> {

    enum PassengerCapacity {

        VERY_SMALL(0, 10),
        SMALL(0, 25),
        AVERAGE(40, 50),
        LARGE(60, 80),
        VERY_LARGE(100, 120);

        Integer minSeatCount;
        Integer maxSeatCount;

        PassengerCapacity(Integer minSeatCount, Integer maxSeatCount){
            this.minSeatCount = minSeatCount;
            this.maxSeatCount = maxSeatCount;
        }

        public Integer getMinSeatCount() {
            return minSeatCount;
        }

        public Integer getMaxSeatCount() {
            return maxSeatCount;
        }

        @Override
        public String toString() {
            if (minSeatCount == 0 && maxSeatCount > 0) {
                return "пассажировместивость до " + maxSeatCount + " мест";
            }
            if (minSeatCount > 0 && maxSeatCount > minSeatCount) {
                return "пассажировместивость от " + minSeatCount + " до " + maxSeatCount + " мест";
            }
            return "неккоректное значение";
        }
    }

    private Enum passengerCapacity;


    public Bus(String brand, String model, double engineVolume, DriverD driver, Enum passengerCapacity, Mechanic mechanic) {
        super(brand, model, engineVolume, driver, mechanic);
        this.passengerCapacity = passengerCapacity;

    }

    public Enum getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(Enum passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
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
    public void printType() {
        if (getBrand() == null || getModel() == null || getPassengerCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println(getBrand() + " " + getModel() + " " + getPassengerCapacity());
    }

    @Override
    public void passDiagnostics() throws TransportTypeException {
        throw new TransportTypeException("Buses should not undergo diagnostics");
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
        int min = 70;
        int max = 140;
        int maxSpeed = (int) (min + (max - min) * Math.random());
        System.out.println("msx speed for bus " + maxSpeed);
    }

    @Override
    public String repair(){
        return "repair bus";
    }

    @Override
    public String toString() {
        return "Bus " + super.toString() + passengerCapacity;
    }
}
