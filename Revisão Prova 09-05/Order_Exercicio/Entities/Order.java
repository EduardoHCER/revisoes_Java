package Order_Exercicio.Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Order_Exercicio.Enum.OrderStatus;

public class Order {
    /* Atributos da classe Order */
    private Date moment;
    private OrderStatus status;

    /*
     * Assosciações da classe Order
     * Um cliente por pedido
     * Varios itens por pedido.
     */
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Order(){

    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        double soma = 0.0;
        for (OrderItem it : items) {
            soma += it.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nOrder Summary: " + sdf.format(moment));
        sb.append("\nOrder Status: " + status);
        sb.append("\nClient: " + client);
        sb.append("\nOrder Items: \n");
        for (OrderItem it : items) {
            sb.append(it + "\n");
        }
        sb.append("\nTotal Price: " + (String.format("%.2f", total())));

        return sb.toString();
    }

    

}
