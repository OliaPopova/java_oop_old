package homework04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import homework04.Additional.BattleField;

import homework04.Units.*;

/**
 Создать класс с описанием координат, x и y.
Добавить в абстрактный класс порле с координатами и пробросить его инициализацию до конструкторов персонажей.
Farmer farmer = new Farmer(getName(), x, y);
Реализовать метод step() лучников.
3.1 Если жизнь равна нулю или стрел нет, завершить обработку.
3.2 Поиск среди противников наиболее приближённого.
3.3 Нанести среднее повреждение найденному противнику.
3.4 Найти среди своих крестьянина.
3.5 Если найден завершить метод иначе уменьшить запас стрел на одну.
 */
public class Main {
    public static void main(String[] args) {
       System.out.println("homework04"); 
     BattleField.start(); 
    }
}