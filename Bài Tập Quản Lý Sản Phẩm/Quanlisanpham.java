public class Quanlisanpham{
    private String id;
    private String nameProduct;
    private String describe;
    private int amount;
    private int price;
    private String donvi;
    public Quanlisanpham(String id, String nameProduct, String describe, int amount, int price, String donvi) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.describe = describe;
        this.amount = amount;
        this.price = price;
        this.donvi = donvi;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNameProduct() {
        return nameProduct;
    }
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    public String getDescribe() {
        return describe;
    }
    public void setDescribe(String describe) {
        this.describe = describe;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getDonvi() {
        return donvi;
    }
    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }
    public boolean hasKeyword(String keyword){
        boolean result = this.nameProduct.contains(keyword);
        return result;
    }
    public boolean hasKeyword1(String keyword1){
        boolean result = this.id.contains(keyword1);
        return result;
    }
    
    @Override
    public String toString() {
        return "Quanlisanpham [amount=" + amount + ", describe=" + describe + ", donvi=" + donvi + ", id=" + id
                + ", nameProduct=" + nameProduct + ", price=" + price + "]";
    }
    
}