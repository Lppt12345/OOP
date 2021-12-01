package T12.BuilderPattern;


import T12.BuilderPattern.builder.Builder;
import T12.BuilderPattern.house.House;

public class Director {
    private Builder builder;


    public Director() {
    }

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void buildStoneHouse() {
        builder.reset();
        builder.buildWall();
        builder.buildRoof();
        builder.buildWindow();
        builder.buildDoor();
    }

    public void buildGoldenHouse() {
        builder.reset();
        builder.buildWall();
        builder.buildRoof();
        builder.buildGarage();
        builder.buildWindow();
        builder.buildDoor();
    }

    public House getProduct() {
        return builder.getResult();
    }
}
