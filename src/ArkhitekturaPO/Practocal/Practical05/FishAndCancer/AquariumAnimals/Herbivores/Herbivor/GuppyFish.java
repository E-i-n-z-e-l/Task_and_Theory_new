package ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.Herbivores.Herbivor;
/*
Рыбка Гуппи
 */

import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.Herbivores.Herbivorous;
import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.SpeedOfMarineAnimals.RunningTheBottom.Bottomrunning;
import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.SpeedOfMarineAnimals.Floating.SwimSpeed;

public class GuppyFish extends Herbivorous implements SwimSpeed, Bottomrunning {

    public GuppyFish(String name) {
        super(name);
    }

    @Override
    public String light() {
        return "";
    }

    @Override
    public String sizeFish() {
        return "1 - 7 сантиметров в длину";
    }

    @Override
    public String toString() {
        return String.format("Рыбка Гуппи: %s", super.toString());
    }
    @Override
    public int getSwimSpeed() {
        return 12;
    }

    @Override
    public int getRunSpeed() {
        return 1;
    }
}