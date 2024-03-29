package Isklyucheniya_v_programmirovanii.Seminar_3.Task_2;

import Isklyucheniya_v_programmirovanii.Seminar_3.Task_2.exceptions.OrderException;
import Isklyucheniya_v_programmirovanii.Seminar_3.Task_2.view.OrderProcessor;

import java.util.Scanner;

// Уровень Интерфейса пользователя (UI)
public class OrderUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        try {
            double totalCost = OrderProcessor.processOrder(productId, quantity);
            System.out.println("Total cost: $" + totalCost);
        } catch (OrderException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
