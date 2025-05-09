package exeFixação;

public class Product {

    protected String name;
    protected Double price;

    public Product(){

    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

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

    public void priceTag(){
        System.out.println(" -------- Product tag -------");
        System.out.println("Product name: " + name);
        System.out.println("Product price: $" + String.format("%.2f", price));
    }

    


}
