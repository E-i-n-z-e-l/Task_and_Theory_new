package ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.Predator.Predators;
/*
Мраморный рак
 */

import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.Predator.Carnivorous;
import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.SpeedOfMarineAnimals.RunningTheBottom.Bottomrunning;
import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.SpeedOfMarineAnimals.Floating.SwimSpeed;

public class MarbleCancer extends Carnivorous implements SwimSpeed, Bottomrunning {
    public MarbleCancer(String name) {
        super(name);
    }

    @Override
    public String light() {
        return "";
    }
    @Override
    public String sizeFish() {
        return "До 15 сантиметров в длину";
    }

    @Override
    public String toString() {
        return String.format("Мраморный рак: %s", super.toString());
    }
    @Override
    public int getSwimSpeed() {
        return 2;
    }

    @Override
    public int getRunSpeed() {
        return 6;
    }
}