
    package com.ironhack.classes;

    public class Elf extends Player {
        private int earsLong;

        public Elf(String name, int health, int strength, int lives) {
            super(name, health, strength, lives);
            this.earsLong = getName().length();

        }
    }

