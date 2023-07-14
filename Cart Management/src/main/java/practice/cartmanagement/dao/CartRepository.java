package practice.cartmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.cartmanagement.dto.UserProduct;
import practice.cartmanagement.entity.Cart;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, UserProduct> {
    public List<Integer> findAllByUserID(int userID);
    public void updateAllByUserIDAndProductID(int userID, int productID);
    public void deleteByProductIDAndUserID(int productID, int userID);

    public Cart findByProductIDAndUserID(int productID, int userID);
}
