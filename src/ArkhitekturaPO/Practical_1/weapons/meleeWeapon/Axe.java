package ArkhitekturaPO.Practical_1.weapons.meleeWeapon;

/*
Оружие топор.
 */
public class Axe implements Melee{ // класс оружия - топор;
    @Override
    public int damage() { // урон топора;
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Топор: %d ", damage()); // Топор наносит столько-то урона(вывод в терминал);
    }
}