package ArkhitekturaPO.Practocal.Practical_1.weapons.shields;

/*
Без щита
 */
public class NotShield implements Def {

    @Override
    public int blockDamage() {return 0;}

    @Override
    public String toString() {
        return String.format("Щита нет: %d ", blockDamage());
    }
}
