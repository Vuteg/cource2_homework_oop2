package transport;

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

}
