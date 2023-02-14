package transport;

import java.util.Objects;

public abstract class Driver {
    private String name;
    private boolean driverLicense;
    private int experienceInYears;

    public Driver(String name, boolean driverLicense, int experienceInYears) {
        this.name = validateName(name);
        this.driverLicense = driverLicense;
        this.experienceInYears = experienceInYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
    abstract void startMove();

    abstract void finishMove();

    abstract void refill();

    public static String validateName(String name) {
        return (name == null || name.isEmpty() || name.isBlank()) ? "name" : name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && experienceInYears == driver.experienceInYears && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driverLicense, experienceInYears);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name +
                ((driverLicense == true) ? ", the driver has a license" : ", the driver does not have the right" ) +
                ", driving experience " + experienceInYears + " year" +
                '}';
    }
}
