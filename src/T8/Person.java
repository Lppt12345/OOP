package T8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();


    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void removeVehicle(String registrationNumber) {
        vehicleList.removeIf(i -> Objects.equals(i.registrationNumber, registrationNumber));
    }

    /**
     * s.
     *
     * @return string.
     */
    public String getVehiclesInfo() {
        StringBuilder result = new StringBuilder("");
        if (vehicleList.size() == 0) {
            result.append(name).append(" has no vehicle!");
        } else {
            result.append(name).append(" has:\n\n");
            for (Vehicle a : vehicleList) {
                result.append(a.getInfo());
            }
        }
        return result.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
