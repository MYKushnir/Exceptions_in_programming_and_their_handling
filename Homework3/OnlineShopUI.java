package Homework3;

import java.util.Scanner;
public class OnlineShopUI {
    public static void main(String[] args) throws RuntimeException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        if (quantity<0) {
            throw new RuntimeException("Incorrect quantity");
        }
        double totalPrice = 0;
        try {
            totalPrice = ShopManager.purchaseProduct(productId, quantity);
        } catch (NotExistException e) {
            throw new RuntimeException(e);
        } catch (NotEnoughException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total price: $" + totalPrice);
    }
}
