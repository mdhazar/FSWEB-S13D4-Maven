package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;

        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage < 0) {
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        if (healthPercentage > 100) {
            healthPercentage = 100;
        }
    }

    public static void main(String[] args) {
        Player player = new Player("Warrior", 100, Weapon.SWORD);
        System.out.println("Initial health: " + player.healthRemaining());

        player.loseHealth(30);
        System.out.println("Health after damage: " + player.healthRemaining());

        player.restoreHealth(20);
        System.out.println("Health after potion: " + player.healthRemaining());

        player.loseHealth(100);
    }
}