package T12.BuilderPattern.builder;

import T12.BuilderPattern.house.House;

public interface Builder {

    public void reset();

    public void buildWall();

    public void buildDoor();

    public void buildWindow();

    public void buildRoof();

    public void buildGarage();

    public House getResult();
}
