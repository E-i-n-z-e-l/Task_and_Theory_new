package Isklyucheniya_v_programmirovanii.Practical_attestation;

public class ExceptionShop {

    // Неверное число
    public static class InvalidNumberException extends Exception {
        public InvalidNumberException(String message) {
            super(message);
        }
    }

    // Товар не найден +
    public static class InvalidProductNotFound extends Exception {
        public InvalidProductNotFound(String message) {
            super(message);
        }
    }

    // Недостаточно товара +
    public static class InvalidNotEnoughGoods extends Exception {
        public InvalidNotEnoughGoods(String message) {
            super(message);
        }
    }
}
