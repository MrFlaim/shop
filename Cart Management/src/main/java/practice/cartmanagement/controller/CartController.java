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

    @PostMapping("")
    public void addProduct(@RequestBody Cart cart) {
        cartService.addCart(cart);
    }

    @PutMapping("")
    public void updateQuantity(@RequestBody Cart cart) {
        cartService.updateCart(cart);
        if (cart.getQuantity() == 0) {
            cartService.deleteProduct(cart.getUserID(), cart.getProductID());
        }
    }

    @DeleteMapping("/{userID}/products/{productID}")
    public void deleteProduct(@PathVariable int userID, @PathVariable int productID) {
        cartService.deleteProduct(userID, productID);
    }

}
