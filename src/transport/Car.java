package transport;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Car {
    final private String brand;
    final private String model;
    final private int productionYear;
    final private String productionCountry;
    final private String typeBody;
    final private int seatsCount;
    private double engineVolume;
    private String colorBody;
    private String transmission;
    private String registrationNumber;
    private boolean winterTires;
    private Key key;

    public Car(String brand, String model, int productionYear, String productionCountry, String typeBody, int seatsCount, double engineVolume, String colorBody, String transmission, String registrationNumber, boolean winterTires, Key key) {
        this.brand = validateBrand(brand);
        this.model = validateModel(model);
        this.productionYear = validateProductionYear(productionYear);
        this.productionCountry = validateProductionCountry(productionCountry);
        this.typeBody = validateTypeBody(typeBody);
        this.seatsCount = validateSeatsCount(seatsCount);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.colorBody = validateColorBody(colorBody);
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
                    "remoteEngineStart= " + remoteEngineStart +
                    ", keylessAccess= " + keylessAccess +
                    '}';
        }
    }


    public void checkChangeTires(int month) {
        month = LocalDate.now().getMonthValue();
        if (month > 10 || month < 4) {
            winterTires = true;
        } else if (month > 3 || month < 11) {
            winterTires = false;
        }

    }

    public String validateRegisterNumber(String registrationNumber) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{2}", registrationNumber)) {
            return registrationNumber;
        } else {
            return "not correct number";
        }
    }
    public String validateBrand (String brand) {
        return (brand == null || brand.isEmpty() || brand.isBlank()) ? "car": brand;
    }
    public String validateModel (String model) {
        return (model == null || model.isEmpty() || model.isBlank()) ?"unknown car": model;
    }

    public String validateProductionCountry(String productionCountry) {
        return (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) ?"unknown country": productionCountry;
    }

    public String validateTypeBody(String typeBody) {
        return (typeBody == null || typeBody.isEmpty() || typeBody.isBlank()) ?"sedan": typeBody;
    }

    public String validateColorBody(String colorBody) {
        return (colorBody == null || colorBody.isEmpty() || colorBody.isBlank()) ?"White": colorBody;
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
    public int validateProductionYear(int productionYear) { return productionYear <= 0 ? 2000 : productionYear;}
    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public double getEngineVolume() {return engineVolume;}
    public String getColorBody() {return colorBody;}
    public int getProductionYear() {return productionYear;}
    public String getProductionCountry() {return productionCountry;}
    public String getTransmission() {return transmission;}
    public String getTypeBody() {return typeBody;}
    public String getRegistrationNumber() {return registrationNumber;}
    public int getSeatsCount() {return seatsCount;}
    public boolean getWinterTires() {return winterTires;}
    public void setEngineVolume(double engineVolume) {this.engineVolume = engineVolume;}
    public void setColorBody(String colorBody) {this.colorBody = colorBody;}
    public void setTransmission(String transmission) {this.transmission = transmission;}
    public void setRegistrationNumber(String registrationNumber) {this.registrationNumber = registrationNumber;}
    public void setWinterTires(boolean winterTires) {this.winterTires = winterTires;}

    @Override
    public String toString() {
        return "Car { " +
                "brand= '" + brand + '\'' +
                ", model= '" + model + '\'' +
                ", productionYear= " + productionYear +
                ", productionCountry= '" + productionCountry + '\'' +
                ", typeBody= '" + typeBody + '\'' +
                ", seatsCount= " + seatsCount +
                ", engineVolume= " + engineVolume +
                ", colorBody= '" + colorBody + '\'' +
                ", transmission= '" + transmission + '\'' +
                ", registrationNumber= '" + registrationNumber + '\'' +
                ", winterTires= " + winterTires +
                ", key= " + key +
                " }";
    }
}
