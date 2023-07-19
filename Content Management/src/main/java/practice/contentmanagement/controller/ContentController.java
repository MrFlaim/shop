package practice.contentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import practice.contentmanagement.entity.Product;
import practice.contentmanagement.service.ContentService;

import java.util.List;

@Controller
@RequestMapping("/api/products")
public class ContentController {
    @Autowired
    ContentService contentService;

    @GetMapping("")
    public List<Product> getAllProducts(){
        return contentService.getAllProducts();
    }

    @GetMapping("/store/{storeID}")
    public List<Product> getAllStoreProducts(@PathVariable int storeID){
        return contentService.getAllStoreProducts(storeID);
    }
    @GetMapping("/{productID}")
    public Product getProduct(@PathVariable int productID){
        return contentService.getProduct(productID);
    }

    @PostMapping("")
    public void addProduct(@RequestBody Product product){
        contentService.addProduct(product);
    }
    @PutMapping("")
    public void updateProduct(@RequestBody Product product){
        contentService.updateProduct(product);
    }

    @DeleteMapping("/{productID}")
    public void deleteProduct(@PathVariable int productID){
        contentService.deleteProduct(productID);
    }

}
