package practice.cartmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import practice.cartmanagement.dto.UserProduct;
import practice.cartmanagement.entity.Cart;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, UserProduct> {
    public List<Integer> findAllByUserID(int userID);

    public void deleteByProductIDAndUserID(int productID, int userID);

    public Cart findByProductIDAndUserID(int productID, int userID);
}
