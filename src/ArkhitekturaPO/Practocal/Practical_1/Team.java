package ArkhitekturaPO.Practocal.Practical_1;

/*
Класс команд и методы команд.
*/

import ArkhitekturaPO.Practocal.Practical_1.warriors.Archer;
import ArkhitekturaPO.Practocal.Practical_1.warriors.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T> { // Класс команды;
    private List<T> team = new ArrayList<>(); // Список команды;

    public void add(T element) { // Метод заполнения команды;
        team.add(element);
    }

    @Override
    public Iterator<T> iterator() { // Описываем Итератор;
        return team.iterator();
    }

    public int getTeamHealth() { // Метод подсчета общего здоровья команды;
        int teamHealth = 0;
        for (T t : this) { // Пишем this потому что есть Итератор "Т";
            teamHealth += t.getHealthPoint(); // Складываем здоровье каждого персонажа в общее здоровье;
        }
        return teamHealth;
    }

    public int maxAttackDistance() { // Метод максимальной дистанции для атаки;
        int maxDistance = 0;
        for (T t : this) { // Пишем this потому что есть Итератор "Т";
            if (!(t instanceof Archer)) { // Если у нас не лучники, то идем к следующей записи;
                continue;
            }
            int currentDistance = ((Archer) t).distance(); // Создаем новую переменную;
            if (maxDistance < currentDistance) { // Сравниваем дистанцию стрельбы лучника с максимальной;
                maxDistance = currentDistance;
            }
        }
        return maxDistance;
    }

    public int getTeamAttack() { // Метод подсчета максимальной атаки команд;
        int teamAttack = 0;
        for (T t : this) { // Пишем this потому что есть Итератор "Т";
            teamAttack += t.getWeapon().damage(); // Обращение к оружию и получение его урона;
        }
        return teamAttack;
    }

    public int getTeamDefense() { // Метод подсчета максимальной защиты команд;
        int teamDefense = 0;
        for (T t : this) { // Пишем this потому что есть Итератор "Т";
            teamDefense += t.getProtection().blockDamage(); //
        }
        return teamDefense;
    }

    /*
    Метод определения минимального щита в команде
     */
    public int getMinShield() {
        int minShield = Integer.MAX_VALUE; // начальное значение минимального щита - максимальное значение int

        for (T player : this) { // перебираем всех игроков в команде
            if (player.getProtection().blockDamage() < minShield) { // если щит игрока меньше текущего минимального значения
                minShield = player.getProtection().blockDamage(); // обновляем минимальное значение
            }
        }

        return minShield;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T t : this) { // Пишем this потому что есть Итератор "Т";
            builder.append(t).append('\n');
        }
        builder.append(String.format("Атака команды: %d ", getTeamAttack()));
        builder.append(String.format("Здоровье команды: %d ", getTeamHealth()));
        builder.append(String.format("Дальность атаки команды: %d ", maxAttackDistance()));
        builder.append(String.format("Защита команды: %d ", getTeamDefense()));
        return builder.toString();
    }
}