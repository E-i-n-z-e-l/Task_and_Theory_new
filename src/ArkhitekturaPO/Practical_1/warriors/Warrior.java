package ArkhitekturaPO.Practical_1.warriors;

/*
Класс воин и его методы.
 */



import ArkhitekturaPO.Practical_1.weapons.Protection;
import ArkhitekturaPO.Practical_1.weapons.Weapon;

import java.util.Random;
/*
Создаем абстрактный метод "Warrior" (так называемый скелет всех будущих подклассов, чтобы избежать копирования кода);
 */
public abstract class Warrior<W extends Weapon, P extends Protection> { // Создаем поля - имя, здоровье, оружие, щит;
    private final String name; // "final" не позволяет более изменять поле;
    private int healthPoint; // с помощью "private" защищаем наши переменные от внешнего воздействия;
    private W weapon;

    private P protection;

    public Warrior(String name, int healthPoint, W weapon, P protection) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.protection = protection;
    }

    public String getName() { // метод получения имени;
        return name;
    }

    public int getHealthPoint() { // метод получения здоровья;
        return healthPoint;
    }

    public W getWeapon() { // метод получения оружия;
        return weapon;
    } // Этот метод используем в классе Archer;


    public P getProtection() { // Метод получения шита;
        return protection;
    }

    public int defense() { // Метод блокирования урона;
        Random rndD = new Random();

        return rndD.nextInt(0, protection.blockDamage() + 1);
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }
    /*
    Метод урона оружием - "hit()";
     */
    public int hit() {
        Random rnd = new Random();

        return rnd.nextInt(0, weapon.damage() + 1); // урон от оружия от 0 до урона самого оружия;
    }
    /*
    Метод получения урона - "reduceHealth(int damage)";
     */
    public void reduceHealth(int damage, int block) { // Метод блока щитом;

        if (block >= 0) {
            if (block > damage) {
                healthPoint = healthPoint;
                if (healthPoint < 0) { // Чтобы при получении урона здоровье не уходило в минус;
                    healthPoint = 0;
                }
            }
            if (damage >= block) {
                healthPoint = healthPoint - (damage - block);
                if (healthPoint < 0) { // Чтобы при получении урона здоровье не уходило в минус;
                    healthPoint = 0;
                }
            }
        }

    }

    @Override
    public String toString() {
        return String.format("Имя: %s, Оружие: %s, Здоровье: %d, Щит: %s", name, weapon, healthPoint, protection);
    }
}
