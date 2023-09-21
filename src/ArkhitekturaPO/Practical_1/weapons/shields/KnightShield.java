package ArkhitekturaPO.Practical_1.weapons.shields;

/*
Рыцарский щит
 */


import ArkhitekturaPO.Practical_1.weapons.Protection;

public class KnightShield implements Protection {

    @Override
    public int blockDamage() {return 3;}

    @Override
    public String toString() {
        return String.format("Щит : %d ", blockDamage());
    }
}
