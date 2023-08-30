package Isklyucheniya_v_programmirovanii.Seminar_3.Task_2.view;

// Уровень Доступа к Данным
public class ProductDatabase {
    public static Product getProduct(int productId) {
        // Здесь происходит обращение к базе данных или хранилищу товаров
        // и получение информации о товаре по его ID
        // В данном примере мы используем заглушку
        if (productId == 1) {
            return new Product("Product 1", 10, 5.99);
        }
        return null;
    }
}
