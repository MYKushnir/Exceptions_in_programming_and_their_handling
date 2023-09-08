package Homework3;

public class ShopManager {
    public static double purchaseProduct(int productId, int quantity) throws NotExistException, NotEnoughException {
        Product product = ProductDatabase.getProduct(productId);
        if (product == null){
            throw new NotExistException("Товар закончился!");
        }
        if (quantity>product.getAvailableQuantity()){
            throw new NotEnoughException("На складе недостаточно товара!");
        }
        double totalPrice = product.getPrice() * quantity;
        return totalPrice;
    }
}