import helpers.DatabaseHandler;
import models.Basket;

public class BasketApp {
    public static void main(String[] args) {
        Basket basket = new Basket();

        DatabaseHandler.fillBasketWithProducts(basket);
        DatabaseHandler.getBasketInformation(basket);

    }
}
