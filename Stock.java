public class Stock {
    private int id;
    private int item_id;
    private int quantity_item;
    public Stock(int id, int item_id, int quantity_item) {
        this.id = id;
        this.item_id = item_id;
        this.quantity_item = quantity_item;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getItem_id() {
        return item_id;
    }
    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }
    public int getQuantity_item() {
        return quantity_item;
    }
    public void setQuantity_item(int quantity_item) {
        this.quantity_item = quantity_item;
    }
    @Override
    public String toString() {
        return "Stock [id=" + id + ", item_id=" + item_id + ", quantity_item=" + quantity_item + "]";
    }
    
}
