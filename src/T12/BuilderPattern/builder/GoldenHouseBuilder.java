package T12.BuilderPattern.builder;


import T12.BuilderPattern.house.GoldenHouse;
import T12.BuilderPattern.house.House;

public class GoldenHouseBuilder implements Builder {

    private House house;

    @Override
    public void reset() {
        house = new GoldenHouse();
    }

    @Override
    public void buildWall() {
        house.setWall("Golden wall");
    }

    @Override
    public void buildDoor() {
        house.setDoor("Golden door");
    }

    @Override
    public void buildWindow() {
        house.setWindows("Golden windows");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Golden roof");
    }

    @Override
    public void buildGarage() {
        house.setGarage("Golden garage");
    }

    @Override
    public House getResult() {
        return house;
    }
}
