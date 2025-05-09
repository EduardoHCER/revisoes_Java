package exeFixação;

public class importedProduct extends Product {

    protected Double CustomFee;

    public importedProduct(Double customFee) {
        CustomFee = customFee;
    }

    public importedProduct(String name, Double price, Double customFee) {
        super(name, price);
        CustomFee = customFee;
    }

    public Double getCustomFee() {
        return CustomFee;
    }

    public void setCustomFee(Double customFee) {
        CustomFee = customFee;
    }

    public double totalPrice() {
        return CustomFee + price;
    }

    public void priceTag(){
        System.out.println(" -------- Product tag -------");
        System.out.println("Product name: " + name);
        System.out.println("Product price: $" + String.format("%.2f", price));
        System.out.println("Custom Fee: $" + String.format("%.2f", CustomFee));
        System.out.println("Total price: $" + String.format("%.2f", totalPrice()));
    }

}
