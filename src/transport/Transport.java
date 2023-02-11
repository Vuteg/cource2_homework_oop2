package transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing{
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;


    private List<Mechanic> mechanicList;



    public Transport(String brand, String model, double engineVolume, T driver, ArrayList <Mechanic> mechanicList) {
        this.brand = validateBrand(brand);
        this.model = validateModel(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.driver = driver;
        this.mechanicList = mechanicList;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String validateBrand(String brand) {
        return (brand == null || brand.isBlank() || brand.isEmpty()) ? "default" : brand;

    }

    public String validateModel(String model) {
        return (model == null || model.isBlank() || model.isEmpty()) ? "default" : model;
    }

    public double validateEngineVolume(double engineVolume) {
        return (engineVolume == 0) ? 2.5 : engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public boolean checkNeedService(){
        try {
            passDiagnostics();
        } catch (TransportTypeException e) {
            return false;
        }
        return true;
    }

    public abstract void Start();

    public abstract void stop();

    public abstract void printType();

    public abstract void passDiagnostics() throws TransportTypeException;

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public void setMechanicList(List<Mechanic> mechanicList) {
        this.mechanicList = mechanicList;
    }
    public abstract String repair();


    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume + ". mechanic " + mechanicList +
                '}';
    }





}

