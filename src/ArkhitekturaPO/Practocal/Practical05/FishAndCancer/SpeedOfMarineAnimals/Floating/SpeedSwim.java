package ArkhitekturaPO.Practocal.Practical05.FishAndCancer.SpeedOfMarineAnimals.Floating;

import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.FishAndMarineArthropods;

import java.util.ArrayList;
import java.util.List;

public class SpeedSwim {
    private List<FishAndMarineArthropods> aquarium = new ArrayList<>();
    public List<SwimSpeed> swimmers() {
        List<SwimSpeed> swimmer = new ArrayList<>();
        for (FishAndMarineArthropods fish: aquarium) {
            if (fish instanceof SwimSpeed) {
                swimmer.add((SwimSpeed) fish);
            }
        }
        return swimmer;
    }

    public SwimSpeed getSwimmerChampion(){
        List<SwimSpeed> swimmers = swimmers();
        SwimSpeed champ = swimmers.get(0);
        for (SwimSpeed runner: swimmers) {
            if (champ.getSwimSpeed() < runner.getSwimSpeed()) {
                champ = runner;
            }
        }
        return champ;
    }
}
