package ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AddAnAnimal;


import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.FishAndMarineArthropods;

import java.util.ArrayList;
import java.util.List;

public class AnimalAdd {
    private List<FishAndMarineArthropods> Aqwa = new ArrayList<>();
    public AnimalAdd AddFish(FishAndMarineArthropods someFish) { // Метод добавления животных;
        Aqwa.add(someFish);
        return this;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("В аквариуме: \n"); // Метод добавления животных в аквариум;

        for (FishAndMarineArthropods fish: Aqwa) {
            builder.append(fish).append("\n");
        }
        return builder.toString();
    }
}
