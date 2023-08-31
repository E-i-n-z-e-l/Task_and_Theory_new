package Isklyucheniya_v_programmirovanii.Practical_3;

public class Product {
    private String name;
    private int availableQuantity;
    private double price;

    public Product(String name, int availableQuantity, double price) {
        this.name = name;
        this.availableQuantity = availableQuantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Вид товара: %s, Количество: %d, Цена: %F", name, availableQuantity, price);
    }
}
