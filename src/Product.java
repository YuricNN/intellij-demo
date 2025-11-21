public class Product {
    private String name;
    private int quantity;
    private double price;
    private int productId;

    private static int idCounter = 1;

    public Product() {
        this("Unknown", 0, 0.0);
    }

    public Product(String name, int quantity, double price) {
        this.productId = idCounter;
        idCounter++;

        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public int getProductId() {
        return this.productId;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public double getItemValue() {
        return this.price * this.quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public void setPrice(double price) {
        if (price < 0.0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Product Name: " + this.name + ", Price: " + this.price + " TL";
    }
}