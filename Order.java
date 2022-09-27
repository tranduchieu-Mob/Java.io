import java.time.LocalDate;

public class Order {
    private int id;
    private int quantity;
    private LocalDate timeOder;
    private int customer_id;
    private int item_id;
    public Order(int id, int quantity, LocalDate timeOder) {
        this.id = id;
        this.quantity = quantity;
        this.timeOder = timeOder;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public LocalDate getTimeOder() {
        return timeOder;
    }
    public void setTimeOder(LocalDate timeOder) {
        this.timeOder = timeOder;
    }
    @Override
    public String toString() {
        return "Order [customer_id=" + customer_id + ", id=" + id + ", item_id=" + item_id + ", quantity=" + quantity
                + ", timeOder=" + timeOder + "]";
    }
    
    
    
    
}
