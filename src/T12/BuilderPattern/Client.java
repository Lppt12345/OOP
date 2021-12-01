package T12.BuilderPattern;


import T12.BuilderPattern.builder.Builder;
import T12.BuilderPattern.builder.GoldenHouseBuilder;
import T12.BuilderPattern.builder.StoneHouseBuilder;
import T12.BuilderPattern.house.House;

public class Client {

    private Director director;
    private House house;

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setup() {
        director = new Director();
    }

    @Override
    public String toString() {
        return "Client{" +
                "house=" + house +
                '}';
    }

    public void buildStoneHouse() {
        director = new Director();
        Builder builder = new StoneHouseBuilder();
        director.setBuilder(builder);
        director.buildStoneHouse();
        house = director.getBuilder().getResult();
    }

    public void buildGoldenHouse() {
        director = new Director();
        Builder builder = new GoldenHouseBuilder();
        director.setBuilder(builder);
        director.buildGoldenHouse();
        house = director.getBuilder().getResult();
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.setup();

        client.buildStoneHouse();
        System.out.println(client);

        client.buildGoldenHouse();
        System.out.println(client);
    }
}
