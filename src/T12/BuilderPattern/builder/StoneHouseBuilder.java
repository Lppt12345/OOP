package T12.BuilderPattern.builder;

import T12.BuilderPattern.house.House;
import T12.BuilderPattern.house.StoneHouse;

public class StoneHouseBuilder implements Builder {

    private House house;

    @Override
    public void reset() {
        house = new StoneHouse();
    }

    @Override
    public void buildWall() {
        house.setWall("Stone Wall");
    }

    @Override
    public void buildDoor() {
        house.setDoor("Stone door");
    }

    @Override
    public void buildWindow() {
        house.setWindows("Stone windows");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Stone roof");
    }

    @Override
    public void buildGarage() {
        house.setGarage("Stone garage");
    }

    @Override
    public House getResult() {
        return house;
    }
}
