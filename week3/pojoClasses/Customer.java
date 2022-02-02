package pojoClasses;

public class Customer {
    private String customerName;
    private int contact;
    private int customerID;


    public Customer(int contact, int customerID) {
        this.contact = contact;
        this.customerID = customerID;
    }

    public Customer() {

    }

    public int getContact() {

        return contact;
    }

    public void setContact(int contact) {

        this.contact = contact;
    }

    public int getCustomerID() {

        return customerID;
    }

    public void setCustomerID(int customerID) {

        this.customerID = customerID;
    }

    public Customer(String name) {
        this.customerName = name;

    }

    public String getCustomerName() {

        return customerName;
    }

    public void setCustomerName(String customerName) {

        this.customerName = customerName;
    }
}
