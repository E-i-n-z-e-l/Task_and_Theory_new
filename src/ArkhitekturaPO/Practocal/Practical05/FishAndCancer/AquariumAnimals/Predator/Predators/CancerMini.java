package ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.Predator.Predators;
/*
Мексиканский карликовый рак
 */

import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.Predator.Carnivorous;
import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.SpeedOfMarineAnimals.RunningTheBottom.Bottomrunning;
import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.SpeedOfMarineAnimals.Floating.SwimSpeed;

public class CancerMini extends Carnivorous implements SwimSpeed, Bottomrunning {
    public CancerMini(String name) {
        super(name);
    }

    @Override
    public String light() {
        return "";
    }
    @Override
    public String sizeFish() {
        return "До 5 сантиметров в длину";
    }

    @Override
    public String toString() {
        return String.format("Мексиканский карликовый рак: %s", super.toString());
    }
    @Override
    public int getSwimSpeed() {
        return 3;
    }

    @Override
    public int getRunSpeed() {
        return 4;
    }
}