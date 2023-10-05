package ArkhitekturaPO.Practocal.Practical_1.weapons.shields;

/*
Круглый щит
 */


import ArkhitekturaPO.Practocal.Practical_1.weapons.Protection;

public class RoundShield implements Protection {

    @Override
    public int blockDamage() {return 1;}

    @Override
    public String toString() {
        return String.format("Щит : %d ", blockDamage());
    }
}
