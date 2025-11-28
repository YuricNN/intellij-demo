import java.util.Random;

public class GameCharacter {
    private int characterId;
    private String name;
    private int level;
    private int health;
    private static int totalCharacters = 0;

    public GameCharacter(String name, int level, int health) {
        Random random = new Random();
        this.characterId = random.nextInt(8001) + 1000; // 1000 ile 9000 arasında rastgele sayı
        this.name = name;
        this.level = level;
        this.health = health;
        totalCharacters++;
    }

    public int getCharacterId() {
        return characterId;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public static int getTotalCharacters() {
        return totalCharacters;
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            this.health -= damage;
            if (this.health < 0) {
                this.health = 0; // Can 0'ın altına inemez
            }
        }
    }

    public void heal(int amount) {
        if (amount > 0) {
            this.health += amount;
        }
    }

    public String getInfo() {
        return "Character ID: " + characterId +
                ", Name: " + name +
                ", Level: " + level +
                ", Health: " + health +
                ", Total Characters Created: " + totalCharacters;
    }
}