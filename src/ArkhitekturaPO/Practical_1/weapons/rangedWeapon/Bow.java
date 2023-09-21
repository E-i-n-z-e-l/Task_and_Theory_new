package ArkhitekturaPO.Practical_1.weapons.rangedWeapon;

/*
Лук и его методы.
 */
public class Bow implements Ranged{ // Класс лук;
    @Override
    public int damage() { // Урон лука;
        return 8;
    }

    @Override
    public int distance() { // Дистанция стрельбы;
        return 50;
    }

    @Override
    public String toString() {
        return String.format("Лук: %d ", damage());
    }
}
