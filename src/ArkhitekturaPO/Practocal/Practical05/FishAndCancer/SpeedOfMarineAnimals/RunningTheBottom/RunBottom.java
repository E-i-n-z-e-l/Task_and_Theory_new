package ArkhitekturaPO.Practocal.Practical05.FishAndCancer.SpeedOfMarineAnimals.RunningTheBottom;

import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AddAnAnimal.AnimalAdd;
import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.FishAndMarineArthropods;

import java.util.ArrayList;
import java.util.List;

public class RunBottom extends AnimalAdd {
    private List<FishAndMarineArthropods> aquariumBottom = new ArrayList<>();
    public List<Bottomrunning> runners(){
        List<Bottomrunning> runners = new ArrayList<>();
        for (FishAndMarineArthropods fish: aquariumBottom) {
            if (fish instanceof Bottomrunning) {
                runners.add((Bottomrunning) fish);
            }
        }
        return runners;
    }
    public Bottomrunning getRunnerChampion(){
        List<Bottomrunning> runners = runners();
        Bottomrunning champ = runners.get(0);
        for (Bottomrunning runner: runners) {
            if (champ.getRunSpeed() < runner.getRunSpeed()) {
                champ = runner;
            }
        }
        return champ;
    }
}
