package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, int productionYear, String productionCountry, String bodyColor, int maxSpeed) {
        super(brand, model,productionYear, productionCountry, bodyColor, maxSpeed);
    }

    @Override
    public String toString() {
        return "Bus, " + super.toString();
    }

}
