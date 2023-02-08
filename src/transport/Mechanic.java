package transport;

import javax.naming.Name;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class Mechanic extends ArrayList<Mechanic> {

    private String name;
    private String nameCompany;

    public static void carryOutMaintenance(Transport transport) {
        System.out.println(transport.getBrand() + " " + transport.getModel() + " " + "carry out maintenance" + ", for mechanic " + transport.getMechanicList());
    }

    public static void repairTheCar(Transport transport) {
        System.out.println(transport.getBrand() + " " + transport.getModel() + " " + "repair the car" + ", for mechanic " + transport.getMechanicList());
    }

    public Mechanic(String name, String nameCompany) {
        setName(name);
        setNameCompany(nameCompany);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null || name.isEmpty() || name.isBlank()? " default" : name;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany == null || nameCompany.isEmpty() || nameCompany.isBlank()? " default" : nameCompany;
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return super.toArray(generator);
    }

    @Override
    public Stream<Mechanic> stream() {
        return super.stream();
    }

    @Override
    public Stream<Mechanic> parallelStream() {
        return super.parallelStream();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mechanic mechanic = (Mechanic) o;
        return name.equals(mechanic.name) && nameCompany.equals(mechanic.nameCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, nameCompany);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", nameCompany='" + nameCompany + '\'' +
                '}';
    }
}
