package ArkhitekturaPO.Practocal.Practical_1.weapons.meleeWeapon;

/*
Оружие меч.
 */

public class Sword implements Melee{ // Меч;
    @Override
    public int damage() { // Урон меча;
        return 4;
    }

    @Override
    public String toString() {
        return String.format("Меч: %d ", damage()); // Меч наносит столько-то урона(вывод в терминал);
    }
}
