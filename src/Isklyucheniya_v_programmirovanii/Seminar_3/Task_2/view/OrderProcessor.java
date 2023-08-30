package Isklyucheniya_v_programmirovanii.Seminar_3.Task_2.view;

import Isklyucheniya_v_programmirovanii.Seminar_3.Task_2.exceptions.OrderException;

// Уровень Бизнес-Логики
public class OrderProcessor {
    public static double processOrder(int productId, int quantity) throws OrderException {
        Product product = ProductDatabase.getProduct(productId);
        if (product == null) {
            throw new OrderException("Product not found.");
        }

        if (quantity > product.getAvailableQuantity()) {
            throw new OrderException("Not enough quantity available.");
        }

        double totalCost = product.getPrice() * quantity;
        return totalCost;
    }
}
