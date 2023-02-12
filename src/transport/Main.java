package transport;

import java.util.*;

public class Main {


    public static void main(String[] args) throws TransportTypeException {

        DriverB driverB = new DriverB("Ivan Ivanov", true, 4);
        DriverC driverC = new DriverC("Vasilii Kurochkin", true, 7);
        DriverD driverD = new DriverD("Nikolai Shnicel", true, 9);

        ArrayList <Mechanic> mechanics = new ArrayList<Mechanic>();
        mechanics.add(new Mechanic("Anton Stepanov", "Max motors"));
        mechanics.add(new Mechanic("Akakei Ponosov", "STO № 1"));
        mechanics.add(new Mechanic("Zeliboba Boba", "Spot"));

        List<Transport> racer = new ArrayList<>();

        racer.add(new Car("brand car №1", "model №1", 0, driverB, Car.BodyType.SEDAN, mechanics.get(0)));
        racer.add(new Car("brand car №2", "model №2", 0, driverB, Car.BodyType.COUPE,  mechanics.get(0)));
        racer.add(new Car("brand car №3", "model №3", 0, driverB, Car.BodyType.HATCHBACK, mechanics.get(0)));
        racer.add(new Car("brand car №4", "model №4", 0, driverB, Car.BodyType.UNIVERSAL, mechanics.get(0)));
        racer.add(new Track("brand track №1", "model №1", 0, driverC, Track.LoadCapacity.N1, mechanics.get(1)));
        racer.add(new Track("brand track №2", "model №2", 0, driverC, Track.LoadCapacity.N2, mechanics.get(1)));
        racer.add(new Track("brand track №3", "model №3", 0, driverC, Track.LoadCapacity.N3, mechanics.get(1)));
        racer.add(new Track("brand track №4", "model №4", 0, driverC, Track.LoadCapacity.N2, mechanics.get(1)));
        racer.add(new Bus("brand bus №1", "model №1", 0, driverD, Bus.PassengerCapacity.VERY_SMALL, mechanics.get(2)));
        racer.add(new Bus("brand bus №2", "model №2", 0, driverD, Bus.PassengerCapacity.SMALL, mechanics.get(2)));
        racer.add(new Bus("brand bus №3", "model №3", 0, driverD, Bus.PassengerCapacity.AVERAGE, mechanics.get(2)));
        racer.add(new Bus("brand bus №4", "model №4", 0, driverD, Bus.PassengerCapacity.LARGE, mechanics.get(2)));
        racer.add(new Bus("brand bus №5", "model №5", 0, driverD, Bus.PassengerCapacity.VERY_LARGE, mechanics.get(2)));

        Car car1 = (Car) racer.get(0);
        Car car2 = (Car) racer.get(1);
        Track track1 = (Track) racer.get(4);
        Track track2 = (Track) racer.get(7);
        Bus bus1 = (Bus) racer.get(8);
        Bus bus2 = (Bus) racer.get(10);


        Map<Transport, List<Mechanic>> hashTransport = new HashMap<>();

        hashTransport.put(car1, car1.getMechanicList());
        hashTransport.put(car2, car2.getMechanicList());
        hashTransport.put(track1, track1.getMechanicList());
        hashTransport.put(track2, track2.getMechanicList());
        hashTransport.put(bus1, bus1.getMechanicList());
        hashTransport.put(bus2, bus2.getMechanicList());


//        for (Map.Entry<Transport, List<Mechanic>> list : hashTransport.entrySet()) {
//            System.out.println(list.getKey());
//        }
//            System.out.println("transport " + list.getKey() + " mechanic " + list.getValue());}

        Set<Driver> drivers = new HashSet<>();


        DriverB driverB1 = driverB;
        DriverB driverB2 = new DriverB("Boris Britva", false, 1);;

        drivers.add(driverB);
        drivers.add(driverB1);
        drivers.add(driverC);
        drivers.add(driverD);
        drivers.add(driverD);

        System.out.println(drivers.size());
        System.out.println(drivers);


        List<Driver> driverList = new ArrayList<>();


        driverList.add(driverB);
        driverList.add(driverC);
        driverList.add(driverD);
        driverList.add(driverB2);

        Iterator<Driver> driverIterator = driverList.iterator();

        while (driverIterator.hasNext()) {
            System.out.println(driverIterator.next());

        }


        System.out.println("===========================");


        Iterator<Driver> driverIterator1 = driverList.iterator();



        while (driverIterator1.hasNext()) {
            if (driverB2.equals(driverIterator1.next())) {
                driverIterator1.remove();
                System.out.println(driverList);
            }
        }






    }


    private static void printInfo(Transport<?> transport) {
        System.out.println("Driver " + transport.getDriver().getName() + " manages " + transport.getBrand() + " will participate in the race");
    }

    public static void getInfo(Transport<?> transport) {
        System.out.println(("Driver " + transport.getDriver().getName() + ", mechanic " + transport.getMechanicList()));
    }
}