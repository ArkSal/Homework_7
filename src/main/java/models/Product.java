package models;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    private String name;
    private int amount;
    private BigDecimal price;
    private BigDecimal totalCost;

    public Product(String name, int amount, BigDecimal price) {
        this.name = name;
        this.amount = amount;
        this.price = price.setScale(2, RoundingMode.CEILING);
        this.totalCost = setTotalCost();
    }

    public String getName() {
        return name;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void addProductsAmount(int amountToAdd) {
        amount += amountToAdd;
        totalCost = setTotalCost();
    }

    public int getAmount() {
        return amount;
    }

    private BigDecimal setTotalCost() {
        return price.multiply(BigDecimal.valueOf(amount));
    }

    @Override
    public String toString() {
        return "models.Product name: " + name +
                ", amount: " + amount +
                ", price: " + price +
                ", cost: " + totalCost;
    }
}
