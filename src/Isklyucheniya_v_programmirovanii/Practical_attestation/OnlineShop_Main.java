package Isklyucheniya_v_programmirovanii.Practical_attestation;

import Isklyucheniya_v_programmirovanii.Practical_attestation.GoodsShop.Goods;
import Isklyucheniya_v_programmirovanii.Practical_attestation.WorkShop.ShopMethods;

import java.util.List;
import java.util.Scanner;

public class OnlineShop_Main {
    public static void main(String[] args) throws Exception {
        ShopMethods shop = new ShopMethods();
        shop.addProduct(new Goods("Ноутбук", 10, 100))
                .addProduct(new Goods("Смартфон", 20, 30))
                .addProduct(new Goods("Наручные часы", 50, 25));

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите число 1, если хотите купить товар:  \n"
                    + "Введите число 2, если хотите посмотреть ассортимент товаров: \n"
                    + "Введите число 3, если хотите завершить покупки в нашем магазине: ");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    scanner.nextLine(); // очистка буфера ввода
                    System.out.print("Введите название продукта: ");
                    String productName = scanner.nextLine();
                    System.out.print("Введите количество продукта: ");
                    int quantity = scanner.nextInt();
                    try {
                        Goods product = shop.findProductByName(productName);
                        if (product != null && product.sell(quantity)) {
                            double saleAmount = quantity * product.getPrice();
                            System.out.println("Продано " + quantity + " единиц товара " + productName + ". Сумма продажи: "
                                    + saleAmount + " $");
                        }
                    } catch (ExceptionShop.InvalidProductNotFound e) {
                        System.out.println(e.getMessage());
                        do {
                            System.out.print("Введите название продукта: ");
                            productName = scanner.nextLine();
                        } while (shop.findProductByName(productName) == null);
                        System.out.print("Введите количество продукта: ");
                        quantity = scanner.nextInt();
                        Goods product = shop.findProductByName(productName);
                        double saleAmount = quantity * product.getPrice();
                        System.out.println("Продано " + quantity + " единиц товара " + productName + ". Сумма продажи: "
                                + saleAmount + " $");
                    }
                case 2:
                    List<Goods> productList = shop.getGoods();
                    for (Goods prod : productList) {
                        System.out.println(prod);
                    }
                    break;
                case 3:
                    System.out.println("Удачного дня!");
                    break;
                default:
                    try {
                        throw new ExceptionShop.InvalidNumberException("Ошибка! Введите число 1, 2 или 3.");
                    } catch (ExceptionShop.InvalidNumberException e) {
                        System.out.println(e.getMessage());
                    }
            }
        }while (number != 3) ;
    }
}
