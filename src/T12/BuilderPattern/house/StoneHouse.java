package T12.BuilderPattern.house;

import T12.BuilderPattern.builder.Builder;
import T12.BuilderPattern.builder.StoneHouseBuilder;

public class StoneHouse extends House {
    @Override
    public Builder getSuitableBuilder() {
        return new StoneHouseBuilder();
    }
}
