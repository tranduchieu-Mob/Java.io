import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Item
        List<Item> items = new ArrayList<>();
        Item item1 = new Item(1, "Ban chai dien", 50000.0, "De su dung");
        Item item2 = new Item(2, "Thuoc hoi trinh", 30000.0, "Dung de hoi trinh");
        items.add(item1);
        items.add(item2);
        // Wallet
        Wallet wallet1 = new Wallet(1, "123", "HieuBank", 500000);

        System.out.println("Moi nhap id san pham : ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (Item item :items){
            if(item.getId() == id){
                
                break;
            }else {
                System.out.println("Hien khong co san pham nay!!!");
                System.exit(0);
            }

        }
        System.out.println("San pham ban vua chon :");
        System.out.println(item1.toString());
        System.out.printf("Nhap so luong mua: ");
        int quantity = sc.nextInt();
        double pay = item1.getPrice() * quantity;
        System.out.println("Yeu cau nhap thong tin nguoi mua : ");
        sc.nextLine();
        System.out.printf("Nhap ten khach hang: ");
        String name = sc.nextLine();
        System.out.printf("Nhap dia chi: ");
        String address = sc.nextLine();
        System.out.printf("Nhap SDT: ");
        String phone = sc.nextLine();
        Customer customer = new Customer(1,name,address,phone);
        Order order = new Order(1, quantity, LocalDate.now());
        System.out.println("Thong tin don hang ban vua dat:");
        System.out.println("Name : "+ customer.getName()
                                    +"\n"+"SDT : " + customer.getPhone()
                                    +"\n"+"Address : "+ customer.getAddress()
                                    +"\n"+"Quantity: "+ order.getQuantity() 
                                    +"\n"+"Tong tien: "+ pay 
                                    +"\n"+"Time Order: "+ order.getTimeOder()
                                    +"\n"+ "So du con lai Wallet: "  + (wallet1.getAmount()-pay ));

    }
}
