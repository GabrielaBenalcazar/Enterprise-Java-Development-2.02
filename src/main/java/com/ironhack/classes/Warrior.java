package com.ironhack.classes;

public class Warrior extends Player {

    public Warrior(String name, int health, int strength, int lives) {
        super(name, health, strength, lives);
        int plusLive = 1;
        setLives(getLives() + plusLive);

    }
}