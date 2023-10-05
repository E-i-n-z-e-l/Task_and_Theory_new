package ArkhitekturaPO.Practocal.Practical_1;

import ArkhitekturaPO.Practocal.Practical_1.warriors.Archer;
import ArkhitekturaPO.Practocal.Practical_1.warriors.Infantryman;
import ArkhitekturaPO.Practocal.Practical_1.warriors.Warrior;
import ArkhitekturaPO.Practocal.Practical_1.weapons.meleeWeapon.Axe;
import ArkhitekturaPO.Practocal.Practical_1.weapons.meleeWeapon.Sword;
import ArkhitekturaPO.Practocal.Practical_1.weapons.rangedWeapon.Bow;
import ArkhitekturaPO.Practocal.Practical_1.weapons.rangedWeapon.CrossBow;
import ArkhitekturaPO.Practocal.Practical_1.weapons.shields.HeavyShield;
import ArkhitekturaPO.Practocal.Practical_1.weapons.shields.NotShield;
import ArkhitekturaPO.Practocal.Practical_1.weapons.shields.RoundShield;

/*
Файл Main.
 */
public class Main {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>(); // Создаем команду;
        team1.add(new Archer("Robin", 100, new Bow(), new NotShield()));
        team1.add(new Infantryman("John", 150, new Axe(), new RoundShield()));

        Team<Archer> teamArchers = new Team<>(); // Создаем команду только лучников;
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow(), new NotShield()));
        teamArchers.add(new Archer("Piter",100, new Bow(), new NotShield()));

        Team<Infantryman> teamInfantryman = new Team<>(); // Создаем команду только пехотинцев;
        teamInfantryman.add(new Infantryman("James", 150, new Sword(), new HeavyShield()));

        System.out.println(team1);
        System.out.println("-----------------------------------------------------------------------------\n");
        System.out.println(teamArchers);
        System.out.println("-----------------------------------------------------------------------------\n");
        System.out.println(teamInfantryman);
        System.out.println("-----------------------------------------------------------------------------\n");

        Battle battle1 = new Battle(new Infantryman("John", 150, new Axe(), new RoundShield()),
                (new Archer("Robin", 100, new Bow(), new NotShield())));

        battle1.fight();

    }
}
