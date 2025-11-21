public class Cat {
    private int x;
    private double direction;
    private String name;

    public Cat() {
        this(0, 180.0, "Sofya");
    }

    public Cat(int x, double direction, String name) {
        this.x = x;
        this.direction = direction;
        this.name = name;
    }

    public void move() {
        this.x += 20;
    }

    public void move2(int a) {
        this.x += a;
    }

    public void turn(double angle) {
        this.direction += angle;
    }

    public void status() {
        System.out.println("Cat Status:");
        System.out.println("  x: " + this.x);
        System.out.println("  direction: " + this.direction);
        System.out.println("  name: " + this.name);
    }
}