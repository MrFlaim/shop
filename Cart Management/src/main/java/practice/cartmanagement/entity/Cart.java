package practice.cartmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @Column(name = "userID")
    private int userID;
    @Id
    @Column(name = "productID")
    private int productID;
    @Column(name = "quantity")
    private int quantity;

    public Cart(){}
    public Cart(int userID, int productID, int quantity) {
        this.userID = userID;
        this.productID = productID;
        this.quantity = quantity;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
