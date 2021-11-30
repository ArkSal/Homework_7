package helpers;

import models.Basket;

public class DatabaseHandler {

    public static void fillBasketWithProducts(Basket basket) {
        System.out.println("Running BasketApp. \nPlease add 5 products to basket.");
        for (int i = 0; i < 5; i++) {
            basket.addProductToBasket(UserInputHandler.getProductFromUser());
        }
    }

    public static void getBasketInformation(Basket basket) {
        basket.printAllProductsInBasketInformation();
    }
}
