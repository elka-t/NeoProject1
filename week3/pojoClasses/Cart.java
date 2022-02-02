package pojoClasses;

public class Cart {
    private int cartID;
    private int amount;
    private double totalPrice;




    public Cart(int quantity, int cartID, double totalPrice) {
        this.amount = quantity;
        this.cartID = cartID;
        this.totalPrice = totalPrice;

    }
    public Cart(){

    }

    public int getCartID() {

        return cartID;
    }

    public void setCartID(int cartID) {

        this.cartID = cartID;
    }

    public String getProductTotal() {

        return totalPrice;
    }

    public void setProductTotal(double totalPrice) {

        this.totalPrice = totalPrice;
    }

    public int getAmount() {

        return amount;
    }

    public void setAmount(int amount) {

        this.amount = amount;
    }
}
