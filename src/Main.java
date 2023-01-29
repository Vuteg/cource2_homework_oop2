import transport.*;

public class Main {
    public static void main(String[] args) {


        DriverB driverB = new DriverB("Ivan", true, 4);
        DriverC driverC = new DriverC("Vasilii", true, 7);
        DriverD driverD = new DriverD("Nikolai", true, 9);

        Car car1 = new Car("brand №1", "model №1", 0, driverB);
        Car car2 = new Car("brand №2", "model №2", 0, driverB);
        Car car3 = new Car("brand №3", "model №3", 0, driverB);
        Car car4 = new Car("brand №4", "model №4", 0, driverB);
        Track track1 = new Track("brand №1", "model №1", 0, driverC);
        Track track2 = new Track("brand №2", "model №2", 0, driverC);
        Track track3 = new Track("brand №3", "model №3", 0, driverC);
        Track track4 = new Track("brand №4", "model №4", 0, driverC);
            Bus bus1 = new Bus("brand №1", "model №1", 0, driverD);
            Bus bus2 = new Bus("brand №2", "model №2", 0, driverD);
            Bus bus3 = new Bus("brand №3", "model №3", 0, driverD);
            Bus bus4 = new Bus("brand №4", "model №4", 0, driverD);

            car1.pitStop();
            car1.theBestTimeLap();
            car1.maxSpeed();
        printInfo(car1);

        System.out.println();

            printInfo(car2);
            printInfo(car3);
            printInfo(car4);

        System.out.println();

        track1.pitStop();
        track1.theBestTimeLap();
        track1.maxSpeed();
            printInfo(track1);

        System.out.println();

            printInfo(track2);
            printInfo(track3);
            printInfo(track4);

        System.out.println();

        bus1.pitStop();
        bus1.theBestTimeLap();
        bus1.maxSpeed();
            printInfo(bus1);

        System.out.println();

            printInfo(bus2);
            printInfo(bus3);
            printInfo(bus4);





    }

    private static void printInfo(Transport <?> transport) {
        System.out.println("Driver " + transport.getDriver().getName() + " manages " + transport.getBrand() + " will participate in the race");

    }
}