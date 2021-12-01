package T12.BuilderPattern.house;

import T12.BuilderPattern.builder.Builder;

public abstract class House {

    private String wall;
    private String door;
    private String windows;
    private String roof;
    private String garage;

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "house.House{" +
                "wall='" + wall + '\'' +
                ", door='" + door + '\'' +
                ", windows='" + windows + '\'' +
                ", roof='" + roof + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }

    public abstract Builder getSuitableBuilder();

}
