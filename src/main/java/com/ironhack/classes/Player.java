package com.ironhack.classes;

public class Player {
    private String name;
    private int health;
    private int initialHealth;
    private int strength;
    private int lives;

    public Player(String name, int initialHealth, int strength, int lives) {
        this.name = name;
        this.health = initialHealth;
        this.initialHealth =  initialHealth;
        this.strength = strength;
        this.lives = lives;
    }

    public int loseLives() {
        if (lives > 0) {
            lives -= 1;
            this.health = initialHealth;
        }
        return lives;
    }


    public int getInitialHealth() {
        return initialHealth;
    }

    public void setInitialHealth(int initialHealth) {
        this.initialHealth = initialHealth;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }



    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }


}