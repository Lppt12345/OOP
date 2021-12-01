package T12.BuilderPattern.house;

import T12.BuilderPattern.builder.Builder;
import T12.BuilderPattern.builder.GoldenHouseBuilder;

public class GoldenHouse extends House {
    @Override
    public Builder getSuitableBuilder() {
        return new GoldenHouseBuilder();
    }

}
