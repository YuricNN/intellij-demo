public class TestProduct {
    public static void main(String[] args) {

        Product product1 = new Product("Iphone 17", 23, 78000.0);
        Product product2 = new Product();

        System.out.println("--- BAŞLANGIÇ DURUMU ---");

        System.out.println("Product 1 ID: " + product1.getProductId());
        System.out.println("Product 2 ID: " + product2.getProductId());
        System.out.println("------------------------");

        System.out.println("Product 1 Bilgileri:");
        System.out.println("  Ad: " + product1.getName());
        System.out.println("  Miktar: " + product1.getQuantity());
        System.out.println("  Fiyat: " + product1.getPrice());
        System.out.println("------------------------");

        System.out.println("Product 1 Stok Değeri (Fiyat x Miktar): " + product1.getItemValue());
        System.out.println("------------------------");

        product2.setName("Galaxy Z Fold7");
        product2.setQuantity(20);
        product2.setPrice(50000.0);

        System.out.println("--- GÜNCELLENMİŞ PRODUCT 2 DURUMU ---");
        System.out.println(product2.toString());
        System.out.println("------------------------------------");

        System.out.println("Product 2 Yeni Stok Değeri: " + product2.getItemValue());
    }
}