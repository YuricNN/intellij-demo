public class Person {
    private int id;
    private String name;
    private int age;
    private static int idCounter = 100;

    public Person() {
        this("Selma", 15);
    }

    public Person(String name, int age) {
        idCounter++;
        this.id = idCounter;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}