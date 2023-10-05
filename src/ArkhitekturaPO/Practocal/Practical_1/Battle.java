package ArkhitekturaPO.Practocal.Practical_1;

/*
Класс битвы и метод битвы.
 */


import ArkhitekturaPO.Practocal.Practical_1.warriors.Warrior;

public class Battle {
    private Warrior w1;
    private Warrior w2;

    public Battle(Warrior w1, Warrior w2) { // Создаем поля битвы;
        this.w1 = w1;
        this.w2 = w2;
    }

    public void fight(){ // Само сражение;
        while (w1.getHealthPoint() > 0 && w2.getHealthPoint() > 0){ // Пока здоровье бойцов выше 0;
            int damage1 = w1.hit();
            int damage2 = w2.hit();
            int block1 = w1.defense();
            int block2 = w2.defense();

            System.out.println("\nfirst hit second : " + damage1 + "\n");
            System.out.println("\nБлокирование щитом : " + block1 + "\n");
            w2.reduceHealth(damage1, block2);



            System.out.println("second hit first : " + damage2 + "\n");
            System.out.println("\nБлокирование щитом : " + block2 + "\n");
            w1.reduceHealth(damage2, block1);
            System.out.println(w1);
            System.out.println(w2);
        }
    }
}
