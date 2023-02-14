package transport;

public class DriverB extends Driver{


    public DriverB(String name, boolean driverLicense, int experienceInYears) {
        super(name, driverLicense, experienceInYears);
    }

    @Override
    void startMove() {
        System.out.println("driver category B" + getName() + "start move");

    }

    @Override
    void finishMove() {
        System.out.println("driver category B" + getName() + "finish move");
    }

    @Override
    void refill() {
        System.out.println("driver category B" + getName() + "refueling the car");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
