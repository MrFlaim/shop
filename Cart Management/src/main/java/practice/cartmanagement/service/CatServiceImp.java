package practice.cartmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import practice.cartmanagement.dao.CartRepository;
import practice.cartmanagement.entity.Cart;

import java.util.List;
import java.util.Optional;

@Service
public class CatServiceImp implements CartService {
    @Autowired
    CartRepository cartRepository;

    @Override
    public List<Integer> getProductsByUser(int userID) {
        return cartRepository.findAllByUserID(userID);
    }

    @Override
    public void updateCart(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public void addCart(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public void deleteProduct(int userID, int productID) {
        cartRepository.deleteByProductIDAndUserID(userID, productID);

    }

    @Override
    public int findQuantity(int userID, int productID) {
        Cart cart = cartRepository.findByProductIDAndUserID(productID, userID);
        return cart.getQuantity();
    }

}
