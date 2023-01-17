import transport.Car;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car ("Lada", "Granta", 2015, "Russia", "", 5, 1.6, " yellow", " " ,"а123рп", true, new Car.Key(false, false));
        Car car2 = new Car ("Audi", "A8 50L TDI quattro", 2020, "Germany", "hatch bag", 3,  2.0,"black", "automatic", "", false,new Car.Key(true, true));
        Car car3 = new Car ("BMW", "Z8", 2021, "Germany", "uneversal", 7, 3.0,"red", "automatic", "o000o1", true, new Car.Key(true, true));
        Car car4 = new Car ("Kia", "Sportage 4 generate", 2018, "South Korea", "", 5, 2.5,"blue", "", "", false, new Car.Key(true, false));
        Car car5 = new Car ("Hyundai", "Avente", 2016, "South Korea", "   ", 4, 1.3, " ", "cvt", "   ", true, new Car.Key(false, false) );
        Car car6 = new Car("Lada", "Vesta", 2019, "Russia", "", 0, 0, "", "", "", true, new Car.Key(false, true));

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
        System.out.println(car6.toString());
    }
}