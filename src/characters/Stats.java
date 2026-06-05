package characters;

public class Stats {

    private int maxHp;
    private int maxMp;

    private int strength;
    private int defense;
    private int speed;

    public Stats(int maxHp, int maxMp, int strength, int defense, int speed) {
        this.maxHp = maxHp;
        this.maxMp = maxMp;
        this.strength = strength;
        this.defense = defense;
        this.speed = speed;
    }

    // Getters
    public int getMaxHp() {
        return maxHp;
    }

    public int getMaxMp() {
        return maxMp;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    // Setters
    public void setMaxHp(int maxHp) {
    this.maxHp = maxHp;
    }

    public void setStrength(int strength) {
    this.strength = strength;
    }

    public void setDefense(int defense) {
    this.defense = defense;
    }

    public void setSpeed(int speed) {
    this.speed = speed;
    }
}
