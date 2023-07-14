package practice.cartmanagement.service;

import java.util.List;

public interface CartService {
    public List<Integer> getProductsByUser(int userID);

    public void updateCart(int userID, int productID);

    public void deleteProduct(int userID, int productID);

    public int findQuantity(int userID, int productID);

}
