package characters;

public abstract class Character {

    protected String name;
    protected Stats stats;

    protected int currentHP;
    protected int currentMP; 

    protected boolean defending;

    public Character(String name, Stats stats) {
        this.name = name;
        this.stats = stats;

        this.currentHP = stats.getMaxHp();
        this.currentMP = stats.getMaxMp();

        this.defending = false;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Stats getStats() {
        return stats;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public int getCurrentMP() {
        return currentMP;
    }

    public boolean isDefending() {
        return defending;
    }

    // Setters
    public void setDefending(boolean defending) {
        this.defending = defending;
    }

    // Combat methods
    public void takeDamage(int damage) {
        currentHP -= damage;

        if (currentHP < 0) {
            currentHP = 0;
        }
    }

    public void heal(int amount) {
        currentHP += amount;

        if (currentHP > stats.getMaxHp()) {
            currentHP = stats.getMaxHp();
        }
    }

    public void restoreMP(int amount) {
        currentMP += amount;

        if (currentMP > stats.getMaxMp()) {
            currentMP = stats.getMaxMp();
        }
    }

    public boolean isAlive() {
        return currentHP > 0;
    }

    // Display
    public void showStatus() {
        System.out.println(
            name +
            " | HP: " + currentHP + "/" + stats.getMaxHp() +
            " | MP: " + currentMP + "/" + stats.getMaxMp()
        );
    }
}