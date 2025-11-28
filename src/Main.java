public class Main {
    public static void main(String[] args) {
        GameCharacter hero = new GameCharacter("Brave Knight", 10, 100);
        GameCharacter villain = new GameCharacter("Evil Sorcerer", 8, 80);

        System.out.println(hero.getInfo());
        System.out.println(villain.getInfo());
        System.out.println("Total Game Characters: " + GameCharacter.getTotalCharacters());

        System.out.println("\n--- Combat Simulation ---");
        hero.takeDamage(25);
        System.out.println(hero.getName() + " health after damage: " + hero.getHealth());

        villain.heal(15);
        System.out.println(villain.getName() + " health after healing: " + villain.getHealth());

        hero.takeDamage(100);
        System.out.println(hero.getName() + " health after massive damage: " + hero.getHealth());

        System.out.println("\n--- Final Info ---");
        System.out.println(hero.getInfo());
        System.out.println(villain.getInfo());
    }
}