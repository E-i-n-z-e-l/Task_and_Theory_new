package ArkhitekturaPO.Practocal.Practical05.FishAndCancer;

import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AddAnAnimal.AnimalAdd;
import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.FishAndMarineArthropods;
import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.Herbivores.Herbivor.GuppyFish;
import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.Predator.Predators.AngelFish;
import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.Predator.Predators.CancerMini;
import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.AquariumAnimals.Predator.Predators.MarbleCancer;
import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.Lighting.LightInAquarium.LightMethods;
import ArkhitekturaPO.Practocal.Practical05.FishAndCancer.SpeedOfMarineAnimals.RunningTheBottom.RunBottom;

public class MainAquarium {
    public static void main(String[] args) {

        FishAndMarineArthropods guppy1 = new GuppyFish("GuppyOne");
        FishAndMarineArthropods guppy2 = new GuppyFish("GuppyTwo");
        FishAndMarineArthropods guppy3 = new GuppyFish("GuppyThree");
        FishAndMarineArthropods guppy4 = new GuppyFish("GuppyFour");
        FishAndMarineArthropods angel1 = new AngelFish("AngelOne");
        FishAndMarineArthropods angel2 = new AngelFish("AngelTwo");
        FishAndMarineArthropods cancer1 = new CancerMini("Trilobite");
        FishAndMarineArthropods cancer2 = new MarbleCancer("BigTrilobite");

        RunBottom runBottom = new RunBottom();
        LightMethods light = new LightMethods();
        AnimalAdd addAnimal = new AnimalAdd();

        addAnimal.AddFish(guppy1)
                .AddFish(angel1)
                .AddFish(guppy2)
                .AddFish(guppy3)
                .AddFish(guppy4)
                .AddFish(angel2)
                .AddFish(cancer1)
                .AddFish(cancer2);

        runBottom.AddFish(guppy1)
                .AddFish(angel1)
                .AddFish(guppy2)
                .AddFish(guppy3)
                .AddFish(guppy4)
                .AddFish(angel2)
                .AddFish(cancer1)
                .AddFish(cancer2);


        System.out.println(addAnimal);
        System.out.println(light.getLight());

//        System.out.println("--Чемпионат аквариума по плаванию--");
//        for (SwimSpeed swimmer: aquarium.swimmers()) {
//            System.out.println(swimmer);
//        }
//
//        System.out.println("\n--Чемпион Аквариума!!!--\n");
//        System.out.println(aquarium.getSwimmerChampion());

//        Bottomrunning champ = runBottom.getRunnerChampion();
//
//        System.out.println("\n---Чемпионат аквариума по бегу по дну---");
//        for (Bottomrunning runner: runBottom.runners()) {
//            System.out.println(runner);
//        }
//
//        System.out.println("\n--Чемпион Аквариума!!!--");
//        System.out.println(champ);

    }
}
