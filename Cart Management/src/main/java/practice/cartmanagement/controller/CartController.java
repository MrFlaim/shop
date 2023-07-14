package practice.cartmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import practice.cartmanagement.entity.Cart;
import practice.cartmanagement.service.CartService;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    CartService cartService;

    @GetMapping("/{userID}")
    public List<Integer> getProductsIdByUser(@PathVariable int userID) {
        return cartService.getProductsByUser(userID);
    }

    @PostMapping("/{userID}/products/{productID}")
    public void addProduct(@PathVariable int userID, @PathVariable int productID) {
        cartService.updateCart(userID, productID);
    }

    @PutMapping("/{userID}/products/{productID}")
    public void updateQuantity(@PathVariable int userID, @PathVariable int productID) {
        cartService.updateCart(userID, productID);
        if (cartService.findQuantity(userID, productID) == 0) {
            cartService.deleteProduct(userID, productID);
        }
    }

    @DeleteMapping("/{userID}/products/{productID}")
    public void deleteProduct(@PathVariable int userID, @PathVariable int productID) {
        cartService.deleteProduct(userID, productID);
    }

}
