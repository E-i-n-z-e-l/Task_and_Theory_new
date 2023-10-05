package ArkhitekturaPO.Practocal.Practical05.FishAndCancer.Lighting.LightInAquarium;

import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.FishAndMarineArthropods;
import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.Lighting.OutputLight.AquariumLighting;
import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.Lighting.OutputLight.Lightable;

import java.util.ArrayList;
import java.util.List;

public class LightMethods implements AquariumLightingInterface {
    private AquariumLighting aqualight = new AquariumLighting();
    private List<FishAndMarineArthropods> aquarium = new ArrayList<>();
    private List<Lightable> getLightable() { // Метод Света в аквариуме;
        List<Lightable> result = new ArrayList<>(aquarium);
        result.add(aqualight);
        return result;
    }
    public String getLight() { // Вывод метода света в аквариуме;
        StringBuilder builder = new StringBuilder();
        for (Lightable lightable: getLightable()) {
            builder.append(lightable.light()).append("\n");
        }
        return builder.toString();
    }
}
