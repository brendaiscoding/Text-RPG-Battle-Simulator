package characters.enemies;

import characters.Character;
import characters.Stats;

public class Enemy extends Character {

    private int experienceReward;
    private int goldReward;
    private String description;

    public Enemy(String name, Stats stats, int experienceReward, int goldReward, String description) {
        super(name, stats);
        this.experienceReward = experienceReward;
        this.goldReward = goldReward;
        this.description = description;
    }

    public int getExperienceReward() {
        return experienceReward;
    }

    public int getGoldReward() {
        return goldReward;
    }

    public String getDescription() {
        return description;
    }

    public void showIntro() {
        System.out.println();
        System.out.println("A Wild " + getName() + " appears!");
        System.out.println(getDescription());
        System.out.println();
    }

    
    @Override
    public void showStatus() {
        System.out.println(getName() + " | HP: " + currentHP + "/" + stats.getMaxHp());
    }
    
}
