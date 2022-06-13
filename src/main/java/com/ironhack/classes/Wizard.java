package com.ironhack.classes;

public class Wizard extends Player {

    public Wizard(String name, int health, int strength, int lives) {
        super(name, health, strength, lives);
        int plusHealth =  2;
        setHealth(getHealth() + plusHealth);
    }
}