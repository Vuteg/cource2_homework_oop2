package transport;

import java.util.regex.Pattern;

public class Car extends Transport {
        final private String typeBody;
    final private int seatsCount;
    private double engineVolume;
    private String transmission;
    private String registrationNumber;
    private boolean winterTires;
    private Key key;
    public Car(String brand, String model, int productionYear, String productionCountry, String typeBody, int seatsCount, double engineVolume, int maxSpeed, String colorBody, String transmission, String registrationNumber, boolean winterTires, Key key) {
        super(brand, model, productionYear, productionCountry, colorBody, maxSpeed);
        this.typeBody = validateTypeBody(typeBody);
        this.seatsCount = validateSeatsCount(seatsCount);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.transmission = validateTransmission(transmission);
        this.registrationNumber = validateRegisterNumber(registrationNumber);
        this.winterTires = winterTires;
        this.key = key;
    }

    public static class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    (remoteEngineStart? " remote engine start": " not remote engine start") +
                    (keylessAccess? " key less access": ", not key less access") +
                    '}';
        }
    }


    public void checkChangeTires(int month) {
        if (month > 10 || month < 4) {
            winterTires = true;
            System.out.println("winter tires");
        } else if (month > 3 || month < 11) {
            winterTires = false;
            System.out.println("summer tires");
        }

    }

    public String validateRegisterNumber(String registrationNumber) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}", registrationNumber)) {
            return registrationNumber;
        } else {
            return "not correct number";
        }
    }

    public String validateTypeBody(String typeBody) {
        return (typeBody == null || typeBody.isEmpty() || typeBody.isBlank()) ?"sedan": typeBody;
    }

    public String validateTransmission(String transmission) {
        return (transmission == null || transmission.isEmpty() || transmission.isBlank()) ?"manual transmission": transmission;
    }

    public Integer validateSeatsCount(int seatsCount) {
        return seatsCount <= 0 ? 5 : seatsCount;
    }
    public double validateEngineVolume(double engineVolume) {
        return engineVolume <= 0 ? 1.6 : engineVolume;
    }

    public double getEngineVolume() {return engineVolume;}
    public String getTransmission() {return transmission;}
    public String getTypeBody() {return typeBody;}
    public String getRegistrationNumber() {return registrationNumber;}
    public int getSeatsCount() {return seatsCount;}
    public boolean getWinterTires() {return winterTires;}
    public void setEngineVolume(double engineVolume) {this.engineVolume = engineVolume;}

    public void setTransmission(String transmission) {this.transmission = transmission;}
    public void setRegistrationNumber(String registrationNumber) {this.registrationNumber = registrationNumber;}
    public void setWinterTires(boolean winterTires) {this.winterTires = winterTires;}

    @Override
    public String toString() {
        return "Car   { " +
                "brand= '" + getBrand() + '\'' +
                ", model= '" + getModel() + '\'' +
                ", productionYear= " + getProductionYear() +
                ", productionCountry= '" + getProductionCountry() + '\'' +
                ", typeBody= '" + typeBody + '\'' +
                ", seatsCount= " + seatsCount +
                ", engineVolume= " + engineVolume +
                ", max speed= " + getMaxSpeed() +
                ", colorBody= '" + getBodyColor() + '\'' +
                ", transmission= '" + transmission + '\'' +
                ", registrationNumber= '" + registrationNumber + '\'' +
                (winterTires? " winter tires": "summer tires") +
                ", key= " + key +
                " }";
    }

}
