package practice.cartmanagement.service;

import practice.cartmanagement.entity.Cart;

import java.util.List;

public interface CartService {
    public List<Integer> getProductsByUser(int userID);

    public void updateCart(Cart cart);

    public void addCart(Cart cart);

    public void deleteProduct(int userID, int productID);

    public int findQuantity(int userID, int productID);

}
