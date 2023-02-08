package transport;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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



        System.out.println(racer.get(2));
        System.out.println(racer.get(4));
        System.out.println(racer.get(6));
        System.out.println(racer.get(9));


        getInfo(racer.get(0));
        getInfo(racer.get(1));
        getInfo(racer.get(2));
        getInfo(racer.get(6));
        getInfo(racer.get(4));
        getInfo(racer.get(9));
        getInfo(racer.get(9));
        getInfo(racer.get(10));


        Mechanic.carryOutMaintenance(racer.get(1));
        Mechanic.carryOutMaintenance(racer.get(2));
        Mechanic.carryOutMaintenance(racer.get(3));
        Mechanic.carryOutMaintenance(racer.get(4));
        Mechanic.carryOutMaintenance(racer.get(6));
        Mechanic.carryOutMaintenance(racer.get(8));
        Mechanic.repairTheCar(racer.get(1));
        Mechanic.repairTheCar(racer.get(2));
        Mechanic.repairTheCar(racer.get(6));
        Mechanic.repairTheCar(racer.get(7));
        Mechanic.repairTheCar(racer.get(8));
        Mechanic.repairTheCar(racer.get(9));

        System.out.println("=======================================================================================================================================");
        System.out.println();


        Queue<Transport> queueForService = new LinkedList<>();




        mechanics.get(0).carryOutMaintenance(racer.get(1));
        mechanics.get(1).repairTheCar(racer.get(6));


        getInfo(racer.get(9));
        getInfo(racer.get(4));


    }




    private static void printInfo(Transport<?> transport) {
        System.out.println("Driver " + transport.getDriver().getName() + " manages " + transport.getBrand() + " will participate in the race");
    }

    public static void getInfo(Transport<?> transport) {
        System.out.println(("Driver " + transport.getDriver().getName() + ", mechanic " + transport.getMechanicList()));
    }
}