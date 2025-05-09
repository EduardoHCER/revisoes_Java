package exeFixação;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.println("common, used or imported (c/u/i): ");
            char type = sc.next().charAt(0);
            System.out.println("Name:  ");
            sc.next();
            String name = sc.nextLine();
            System.out.println("Price: ");
            Double price = sc.nextDouble();

            if (type == 'c') {
                list.add(new Product(name, price));
            }
            else if (type == 'u') {
                System.out.println("Manufacture date (dd/MM/yyyy): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new usedProduct(name, price, date));
            }
            else{
                System.out.println("Custom Fee: ");
                Double customFee = sc.nextDouble();
                list.add(new importedProduct(name,price, customFee));
            }
        }

        System.out.println("List of Products: ");

        for (Product product : list) {
            product.priceTag();
        }


        sc.close();
    }
}