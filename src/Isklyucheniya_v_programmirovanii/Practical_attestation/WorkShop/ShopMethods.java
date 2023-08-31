package Isklyucheniya_v_programmirovanii.Practical_attestation.WorkShop;

import Isklyucheniya_v_programmirovanii.Practical_attestation.ExceptionShop;
import Isklyucheniya_v_programmirovanii.Practical_attestation.GoodsShop.Goods;

import java.util.ArrayList;
import java.util.List;

public class ShopMethods {
    private List<Goods> productList = new ArrayList<>();

    public ShopMethods addProduct(Goods prod){
        productList.add(prod);
        return this; // Позволяет в Main добавлять "товары" через (.add);
    }
    public List<Goods> getGoods() {
        return productList;
    }


    public Goods findProductByName(String name) throws ExceptionShop.InvalidProductNotFound {
        for (Goods prod : productList) {
            if (prod.getName().equalsIgnoreCase(name)) {
                return prod;
            }
        }
        throw new ExceptionShop.InvalidProductNotFound("Товар с таким именем не найден"); // генерируем исключение
    }
}
