package org.example;

public enum Weapon {
    SWORD(25, 1.5),
    AXE(35, 1.0),
    BOW(15, 2.0),
    DAGGER(10, 3.0);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}