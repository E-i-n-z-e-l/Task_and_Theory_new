package ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.Predator;
/*
Плотоядные жители аквариума
 */

import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.FishAndMarineArthropods;

public abstract class Carnivorous extends FishAndMarineArthropods {

    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Плотоядный";
    }
}