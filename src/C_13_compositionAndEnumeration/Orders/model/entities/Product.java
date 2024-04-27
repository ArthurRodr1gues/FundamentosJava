package C_13_compositionAndEnumeration.Orders.model.entities;

public class Product {

    private String name;
    private Double price;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product(String name, Double price) { //Constructor
        this.name = name;
        this.price = price;
    }



    
    
}
