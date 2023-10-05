package ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.Predator.Predators;
/*
Скалярии
 */

import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.Predator.Carnivorous;
import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.SpeedOfMarineAnimals.RunningTheBottom.Bottomrunning;
import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.SpeedOfMarineAnimals.Floating.SwimSpeed;

public class AngelFish extends Carnivorous implements SwimSpeed, Bottomrunning {

    public AngelFish(String name) {
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
        return String.format("Скалярия: %s", super.toString());
    }

    @Override
    public int getSwimSpeed() {
        return 15;
    }

    @Override
    public int getRunSpeed() {
        return 1;
    }
}