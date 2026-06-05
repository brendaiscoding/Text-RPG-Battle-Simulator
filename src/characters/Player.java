package characters;

import java.util.ArrayList;
import java.util.List;

import enums.CharacterClass;
import items.Inventory;
import skills.Skill;

public class Player extends Character {

    private int level;
    private int experience;
    private int gold;

    private CharacterClass characterClass;

    private Inventory inventory;
    private List<Skill> skills;

    public Player(String name, Stats stats, CharacterClass characterClass) {
        super(name, stats);
        this.characterClass = characterClass;

        this.level = 1;
        this.experience = 0;
        this.gold = 0;

        this.inventory = new Inventory();
        this.skills = new ArrayList<>();
    }

    // Getters
    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public int getGold() {
        return gold;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    // Gold

    public void addGold(int amount) {
        gold += amount;
    }

    public boolean spendGold(int amount) {
        if (gold < amount) {
            return false;
        }

        gold -= amount;
        return true;
    }

    // Experience 
    public void gainExperience(int amount) {
        
        experience += amount;

        while (experience >= experienceToNextLevel()) {
            levelUp();
        }
    }

    private int experienceToNextLevel() {
        return level * 100; // Example: 100 XP per level
    }

    private void levelUp() {
        experience -= experienceToNextLevel();

        level++;

        stats.setMaxHp(stats.getMaxHp() + 10); 
        stats.setStrength(stats.getStrength() + 2);
        stats.setDefense(stats.getDefense() + 2);

        currentHP = stats.getMaxHp();

        System.out.println();
        System.out.println(" LEVEL UP! ");
        System.out.println(name + " reached level " + level + "!");
        System.out.println();
    }

    // Skills
    public void learnSkill(Skill skill) {

        if (!skills.contains(skill)) {
            skills.add(skill);
        }
    }

    // Display
    @Override
    public void showStatus() {
        System.out.println(
            name +
            " | Class: " + characterClass +
            " | Level: " + level +
            " | HP: " + currentHP + "/" + stats.getMaxHp() +
            " | MP: " + currentMP + "/" + stats.getMaxMp() +
            " | EXP: " + experience +
            " | Gold: " + gold
        );
    }
}
