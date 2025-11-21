public class TestClass {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat(5, 45.0, "Lucy");

        System.out.println("--- BAŞLANGIÇ DURUMU ---");
        cat1.status();
        cat2.status();

        cat1.move();
        cat2.move2(20);

        System.out.println("--- HAREKET SONRASI DURUM ---");
        cat1.status();
        cat2.status();
    }
}