package Isklyucheniya_v_programmirovanii.Practical_attestation.GoodsShop;

public class Goods {
    private String name;
    private int availableQuantity;
    private double price;

    public Goods(String name, int availableQuantity, double price) {
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
        return String.format("Вид товара: %s, Количество: %d, Цена: %f", name, availableQuantity, price);
    }

    static class InvalidNotEnoughGoods extends Exception {
        public InvalidNotEnoughGoods(String message) {
            super(message);
        }
    }

    public boolean sell(int quantity) throws InvalidNotEnoughGoods {
        if (availableQuantity >= quantity) {
            availableQuantity -= quantity;
            return true; // если продажа прошла успешно
        } else {
            throw new InvalidNotEnoughGoods("Недостаточно товара для продажи"); // генерируем исключение
        }
    }
}
