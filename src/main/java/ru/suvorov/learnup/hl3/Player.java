package ru.suvorov.learnup.hl3;

import java.io.Serializable;
import java.util.Arrays;

class Player implements Serializable {
    private final String name;
    private int health;
    private int armor;
    private String[] weapon;
    private int kills;
    private int deaths;
    private int level;

    Player(String name) {
        this.name = name;
        this.health = 100;
        this.armor = 0;
        this.weapon = new String[]{"Монтировка"};
        this.kills = 0;
        this.deaths = 0;
        this.level = 1;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", armor=" + armor +
                ", weapon=" + Arrays.toString(weapon) +
                ", kills=" + kills +
                ", deaths=" + deaths +
                ", level=" + level +
                '}';
    }

    public String getName() {
        return name;
    }

    Player(String name, int health, int armor, String[] weapon, int kills, int deaths, int level) {
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.weapon = weapon;
        this.kills = kills;
        this.deaths = deaths;
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String[] getWeapon() {
        return weapon;
    }

    public void setWeapon(String[] weapon) {
        this.weapon = weapon;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
