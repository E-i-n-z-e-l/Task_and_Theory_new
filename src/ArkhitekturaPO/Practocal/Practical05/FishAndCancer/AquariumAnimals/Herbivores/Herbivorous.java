package ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.Herbivores;
/*
Травоядные
 */

import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.FishAndMarineArthropods;

public abstract class Herbivorous extends FishAndMarineArthropods {

    public Herbivorous(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Травоядный";
    }

}