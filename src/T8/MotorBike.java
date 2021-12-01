package T8;

public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * khai bao.
     *
     * @param brand              th.
     * @param model              m.
     * @param registrationNumber sdk.
     * @param owner              chh.
     * @param hasSideCar         c.
     */
    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSideCar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSideCar;
    }

    /**
     * Ghi de.
     *
     * @return ghi de.
     */
    @Override
    public String getInfo() {
        StringBuilder result = new StringBuilder("Motor Bike:\n");
        result.append("\tBrand: " + this.getBrand() + "\n");
        result.append("\tModel: " + this.getModel() + "\n");
        result.append("\tRegistration Number: " + this.registrationNumber + "\n");
        result.append("\tHas Side Car: " + this.isHasSidecar() + "\n");
        result.append("\tBelongs to " + this.getOwner().getName()
                + " - " + this.getOwner().getAddress() + "\n");
        return result.toString();
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
