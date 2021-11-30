package models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Basket {
    private final List<Product> productsList;

    public Basket() {
        this.productsList = new ArrayList<>();
    }

    public void addProductToBasket(Product productToAdd) {
        Product product = findProductInList(productToAdd);
        if (isProductAlreadyInBasket(product)) {
            setNewProductAmount(productsList, product, productToAdd.getAmount());
            System.out.println("Product already in basket. Amount increased.");
            return;
        }
        productsList.add(productToAdd);
        System.out.println("Product added.");
    }

    public void printAllProductsInBasketInformation() {
        BigDecimal totalBasketValue = BigDecimal.ZERO;
        for (Product product : productsList) {
            totalBasketValue = totalBasketValue.add(product.getTotalCost());
            System.out.println(product);
        }
        System.out.println("Total cost in basket: " + totalBasketValue);
    }

    private boolean isProductAlreadyInBasket(Product product) {
        return Objects.nonNull(product);
    }

    private Product findProductInList(Product productName) {
        return productsList.stream()
                .filter(product -> product.getName().equals(productName.getName()))
                .findAny()
                .orElse(null);
    }

    private int getProductIndex(Product productInBasket) {
        return productsList.indexOf(productInBasket);
    }

    private void setNewProductAmount(List<Product> listOfProducts, Product productToIncrease, int amountToIncrease) {
        int productIndexInList = getProductIndex(productToIncrease);
        listOfProducts.get(productIndexInList).addProductsAmount(amountToIncrease);
    }


}
