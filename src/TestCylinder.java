public class TestCylinder {
    public static void main(String[] args) {

        System.out.println("--- BAŞLANGIÇ ---");
        System.out.println("Oluşturulan Silindir Sayısı: " + Cylinder.getNoOfCylinder());
        System.out.println("-----------------");

        Cylinder cylinder1 = new Cylinder();

        System.out.println("--- SİLİNDİR 1 (Varsayılan) ---");
        System.out.println("Yarıçap (r): 3.0");
        System.out.println("Yükseklik (h): 4.0");

        System.out.println("Oluşturulan Silindir Sayısı: " + Cylinder.getNoOfCylinder());
        System.out.println("-----------------");

        Cylinder cylinder2 = new Cylinder(10, 20);

        System.out.println("--- SİLİNDİR 2 (r=10, h=20) ---");

        System.out.println("Yarıçap (r): 10.0");
        System.out.println("Yükseklik (h): 20.0");

        System.out.println("Taban Alanı: " + cylinder2.calculateBaseArea());
        System.out.println("Yüzey Alanı: " + cylinder2.calculateSurfaceArea());
        System.out.println("Hacim: " + cylinder2.calculateVolume());

        double density = 5.12;
        System.out.println("Yoğunluk (" + density + ") için Kütle: " + cylinder2.calculateMass(density));

        System.out.println("Oluşturulan Silindir Sayısı: " + Cylinder.getNoOfCylinder());
        System.out.println("-----------------");
    }
}