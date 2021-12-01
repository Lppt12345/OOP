package T8;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Ghi de.
     *
     * @return string.
     */
    @Override
    public String getInfo() {
        StringBuilder result = new StringBuilder("Car:\n");
        result.append("\tBrand: " + this.getBrand() + "\n");
        result.append("\tModel: " + this.getModel() + "\n");
        result.append("\tRegistration Number: " + this.registrationNumber + "\n");
        result.append("\tNumber of Doors: " + this.getNumberOfDoors() + "\n");
        result.append("\tBelongs to " + this.getOwner().getName()
                + " - " + this.getOwner().getAddress() + "\n");
        return result.toString();
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

}
