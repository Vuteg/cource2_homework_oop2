import transport.Bus;
import transport.Car;
import transport.Transport;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car ("Lada", "Granta", 2015, "Russia", "", 5, 1.6, 160," yellow", " " ,"а123уе198", true, new Car.Key(false, false));
        Car car2 = new Car ("Audi", "A8 50L TDI quattro", 2020, "Germany", "hatch bag", 3,  2.0, 210,"black", "automatic", "", false,new Car.Key(true, true));
        Car car3 = new Car ("BMW", "Z8", 2021, "Germany", "uneversal", 7, 3.0, 220,"red", "automatic", "о000оо777", true, new Car.Key(true, true));
        Car car4 = new Car ("Kia", "Sportage 4 generate", 2018, "South Korea", "", 5, 2.5, 180,"blue", "", "л013ох777", false, new Car.Key(true, false));
        Car car5 = new Car ("Hyundai", "Avente", 2016, "South Korea", "   ", 4, 1.3, 170, " ", "cvt", "   ", true, new Car.Key(false, false) );
        Car car6 = new Car("Lada", "Vesta", 2019, "Russia", "", 0, 1.8, 180, "", "cvt", "", true, new Car.Key(false, true));
        Car car7 = new Car("   ", "    ",  0, "", "  ", 0, 0, 0, "", " ", "", false, new Car.Key(false, false));

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);
        System.out.println(car7);

        car2.checkChangeTires(1);
        System.out.println(car2);

        Bus bus1 = new Bus("Maz", " 69", 2017, "Belarus", "pink", 50);
        Bus bus2 = new Bus("  ", "covid", 2020, "China", "black", 350);
        Bus bus3 = new Bus("zaz", "333", 2022, "USA", "red", 200);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

    }
}