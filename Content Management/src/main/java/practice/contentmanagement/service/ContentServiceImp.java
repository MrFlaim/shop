package practice.contentmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.contentmanagement.dao.ProductRepository;
import practice.contentmanagement.entity.Product;

import java.util.List;
import java.util.Optional;

@Service
public class ContentServiceImp implements ContentService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getAllStoreProducts(int storeID) {
        return productRepository.findAllByStoreId(storeID);
    }

    @Override
    public Product getProduct(int productID) {
        Product product = null;
        Optional<Product> optionalProduct = productRepository.findById(productID);
        if (optionalProduct.isPresent()) {
            return optionalProduct.get();
        }
        return product;
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.save(product);

    }

    @Override
    public void deleteProduct(int productID) {
        productRepository.deleteByID(productID);

    }
}
