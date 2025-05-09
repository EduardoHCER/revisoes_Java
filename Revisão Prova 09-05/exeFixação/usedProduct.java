package exeFixação;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class usedProduct extends Product {

    protected LocalDate manufactureDate;

    public usedProduct(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public usedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public void priceTag() {
        System.out.println(" -------- Product tag -------");
        System.out.println("Product name: " + name);
        System.out.println("Product price: $" + String.format("%.2f", price));
        System.out.println("Manufacture date: " + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
    }

}
