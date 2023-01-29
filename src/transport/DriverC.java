package transport;

public class DriverC extends Driver{

    public DriverC(String name, boolean driverLicense, int experienceInYears) {
        super(name, driverLicense, experienceInYears);
    }

    @Override
    void startMove() {
        System.out.println("driver category C" + getName() + "start move");

    }

    @Override
    void finishMove() {
        System.out.println("driver category C" + getName() + "finish move");
    }

    @Override
    void refill() {
        System.out.println("driver category C" + getName() + "refueling the track");

    }


}

