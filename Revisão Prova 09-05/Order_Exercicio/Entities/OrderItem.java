package Order_Exercicio.Entities;

import java.text.SimpleDateFormat;

public class OrderItem {

    /* Atributos da classe OrderItem */

    private Integer quantity;
    private Double price;

    /*Assosciação de OrderItem com Product*/
    private Product product;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public OrderItem(){

    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal(){
        return quantity * price;
    }

    @Override
    public String toString() {
        return getProduct().getName()
        + ", Price: $" 
        + price
        + ", Quantity: "
        + quantity
        + ", subTotal: "
        + subTotal();
    }

    
}
