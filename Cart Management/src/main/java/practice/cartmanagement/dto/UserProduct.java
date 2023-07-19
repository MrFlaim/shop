package practice.cartmanagement.dto;

public class UserProduct {
    private int userID;
    private int cartID;

    public UserProduct() {
    }
    public UserProduct(int userID, int cartID) {
        this.userID = userID;
        this.cartID = cartID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }
}
