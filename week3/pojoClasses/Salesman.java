package pojoClasses;

public class Salesman {
    private String name;
    private int salesmanID;

    public Salesman(String name, int salesmanID) {
        this.name = name;
    }
    public Salesman(){

    }

    public int getSalesmanID() {

        return salesmanID;
    }

    public void setSalesmanID(int salesmanID) {

        this.salesmanID = salesmanID;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}