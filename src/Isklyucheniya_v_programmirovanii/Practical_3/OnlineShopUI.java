package Isklyucheniya_v_programmirovanii.Practical_3;

import java.util.Scanner;

public class OnlineShopUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ID продукта: ");
        int productId = scanner.nextInt();
        System.out.print("Введите количество продукта: ");
        int quantity = scanner.nextInt();

        double totalPrice = ShopManager.purchaseProduct(productId, quantity);
        System.out.println("Итоговая цена: $" + totalPrice);
    }
    public class ShopManager {
        public static double purchaseProduct(int productId, int quantity) {
            Product product = ProductDatabase.getProduct(productId);
            double totalPrice = product.getPrice() * quantity;
            return totalPrice;
        }
    }
    public class ProductDatabase {
        public static Product getProduct(int productId) {
            // Подразумевается обращение к базе данных или хранилищу товаров
            // и получение информации о товаре по его ID
            // В данном примере мы используем заглушку
            if (productId == 1) {
                return new Product("Product 1", 10, 5.99);
            }
            return null;
        }
    }
}
