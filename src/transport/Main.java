package transport;

public class Main {

    public static void main(String[] args) throws TransportTypeException {


        DriverB driverB = new DriverB("Ivan", true, 4);
        DriverC driverC = new DriverC("Vasilii", true, 7);
        DriverD driverD = new DriverD("Nikolai", true, 9);

        Car car1 = new Car("brand №1", "model №1", 0, driverB, Car.BodyType.SEDAN);
        Car car2 = new Car("brand №2", "model №2", 0, driverB, Car.BodyType.COUPE);
        Car car3 = new Car("brand №3", "model №3", 0, driverB, Car.BodyType.HATCHBACK);
        Car car4 = new Car("brand №4", "model №4", 0, driverB, Car.BodyType.UNIVERSAL);
        Track track1 = new Track("brand №1", "model №1", 0, driverC, Track.LoadCapacity.N1);
        Track track2 = new Track("brand №2", "model №2", 0, driverC, Track.LoadCapacity.N2);
        Track track3 = new Track("brand №3", "model №3", 0, driverC, Track.LoadCapacity.N3);
        Track track4 = new Track("brand №4", "model №4", 0, driverC, Track.LoadCapacity.N2);
        Bus bus1 = new Bus("brand №1", "model №1", 0, driverD, Bus.PassengerCapacity.VERY_SMALL);
        Bus bus2 = new Bus("brand №2", "model №2", 0, driverD, Bus.PassengerCapacity.SMALL);
        Bus bus3 = new Bus("brand №3", "model №3", 0, driverD, Bus.PassengerCapacity.AVERAGE);
        Bus bus4 = new Bus("brand №4", "model №4", 0, driverD, Bus.PassengerCapacity.LARGE);
        Bus bus5 = new Bus("brand №5", "model №5", 0, driverD, Bus.PassengerCapacity.VERY_LARGE);

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

        System.out.println("====================================================================================================================================================");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println();

        System.out.println(track1);
        System.out.println(track2);
        System.out.println(track3);
        System.out.println(track4);
        System.out.println();

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);
        System.out.println(bus5);


        car1.printType();
        car4.printType();
        track2.printType();
        track3.printType();
        bus5.printType();
        bus2.printType();

        car3.passDiagnostics();
        car4.passDiagnostics();
        track3.passDiagnostics();
        track4.passDiagnostics();


        try {
            bus1.passDiagnostics();
            bus2.passDiagnostics();
            bus3.passDiagnostics();
            bus4.passDiagnostics();
            bus5.passDiagnostics();
        } catch (TransportTypeException t) {
            System.out.println(t.getMessage());
            System.err.println("Buses should not undergo diagnostics");
        }

        car3.passDiagnostics();
        car4.passDiagnostics();
        track3.passDiagnostics();
        track4.passDiagnostics();

    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Driver " + transport.getDriver().getName() + " manages " + transport.getBrand() + " will participate in the race");

    }
}