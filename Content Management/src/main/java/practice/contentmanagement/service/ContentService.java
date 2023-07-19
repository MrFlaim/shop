package practice.contentmanagement.service;

import practice.contentmanagement.entity.Product;

import java.util.List;

public interface ContentService {
    public List<Product> getAllProducts();
    public List<Product> getAllStoreProducts(int storeID);
    public Product getProduct(int productID);
    public void addProduct(Product product);
    public void updateProduct(Product product);
    public void deleteProduct(int productID);
}
