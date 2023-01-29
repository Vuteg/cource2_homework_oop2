package transport;

public class DriverD extends Driver{

    public DriverD(String name, boolean driverLicense, int experienceInYears) {
        super(name, driverLicense, experienceInYears);
    }

    @Override
    void startMove() {
        System.out.println("driver category D" + getName() + "start move");

    }

    @Override
    void finishMove() {
        System.out.println("driver category D" + getName() + "finish move");
    }

    @Override
    void refill() {
        System.out.println("driver category D" + getName() + "refueling the bus");

    }
}
