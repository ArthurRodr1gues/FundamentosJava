package C_13_compositionAndEnumeration.Orders.model.entities;

public class OrderItem {

    private Integer quantity;
    private double price;

    // Composition
    private Product product;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public OrderItem(Integer quantity, double price, Product product) { // Constructor
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public double subTotal() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return product.getName() // Acessa a classe Product através da variável product
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }

}
