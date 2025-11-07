class Engine {
    int horsePower;
    // Constructor
    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }
    // showPower method
    public void showPower() {
        System.out.println("Engine power: " + horsePower + " HP");
    }
}
class Car {
    String model;
    Engine engine;
    // Constructor
    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }
    // displayInfo method
    public void displayInfo() {
        System.out.println("Car model: " + model);
        engine.showPower();
    }
}
public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(300);
        Car car = new Car("Tesla Model S", engine);
        car.displayInfo();
    }
}