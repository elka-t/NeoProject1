package pojoClasses;

public class Cart {
    private int cartID;
    private String productName;
    private int amount;




    public Cart(String name, int quantity, int cartID) {
        this.productName = name;
        this.amount = quantity;
        this.cartID = cartID;

    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
