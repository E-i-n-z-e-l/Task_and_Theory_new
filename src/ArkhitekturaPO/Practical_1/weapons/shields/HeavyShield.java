package ArkhitekturaPO.Practical_1.weapons.shields;

/*
Тяжелый щит.
 */


import ArkhitekturaPO.Practical_1.weapons.Protection;

public class HeavyShield implements Protection {

    @Override
    public int blockDamage() {return 5;}

    @Override
    public String toString() {
        return String.format("Щит : %d ", blockDamage());
    }
}
