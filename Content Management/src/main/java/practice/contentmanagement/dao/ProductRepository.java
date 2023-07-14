package practice.contentmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practice.contentmanagement.entity.Product;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    public List<Product> findAllByStoreId(int storeID);
    public void deleteByID(int productID);
}
