package helpers;

import models.Product;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInputHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static Product getProductFromUser() {
        System.out.println("Type product's name: ");
        String productName = scanner.nextLine();
        System.out.println("Type product's price: ");
        BigDecimal productPrice = scanner.nextBigDecimal();
        System.out.println("Type product's amount: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        return new Product(productName, amount, productPrice);
    }
}
