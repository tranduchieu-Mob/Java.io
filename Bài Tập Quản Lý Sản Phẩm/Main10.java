import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Quanlisanpham quanlisanpham = new Quanlisanpham("1", "Tu Lanh","Tu lanh cua ngang",2 , 30000, "vnd");
        Quanlisanpham quanlisanpham2 = new Quanlisanpham("2", "May Giat","May Giat 9kg",3 , 60000, "vnd");
        Quanlisanpham quanlisanpham3 = new Quanlisanpham("3", "Tivi","Tivi LG",7 ,90000, "vnd");
        Quanlisanpham quanlisanpham4 = new Quanlisanpham("4", "Bep Tu","Bep dien",8 , 150000, "vnd");
        ArrayList<Quanlisanpham> quanlisanphams = new ArrayList<>();
        quanlisanphams.add(quanlisanpham);
        quanlisanphams.add(quanlisanpham2);
        quanlisanphams.add(quanlisanpham3);
        quanlisanphams.add(quanlisanpham4);
        System.out.println("Danh sach san pham: " + quanlisanphams.toString());

        Quanlisanpham[] Quanlisanphamlist = {quanlisanpham, quanlisanpham2, quanlisanpham3 , quanlisanpham4};
        List<Quanlisanpham> list = Arrays.asList(Quanlisanphamlist);
        System.out.printf("Nhap Ten San Pham: ");

        Scanner scanner = new Scanner(System.in);
        String keyword = scanner.nextLine();
        for(int index = 0; index < Quanlisanphamlist.length; index++){
            Quanlisanpham quanlisanphamm = Quanlisanphamlist[index];
            if(quanlisanphamm.hasKeyword(keyword)){
                System.out.println("Ten San Pham: " + quanlisanphamm.toString()); 
            }
        }

        System.out.printf("Nhap Id: ");
        String keyword1 = scanner.nextLine();
        for(int i = 0; i < Quanlisanphamlist.length; i++){
            Quanlisanpham quanlisanphamm = Quanlisanphamlist[i];
            if(quanlisanphamm.hasKeyword1(keyword1)){
                System.out.println("Ten San Pham: " + quanlisanphamm.toString()); 
            }
        }
        quanlisanphams.remove(2);
        System.out.println("Danh sach san pham cap nhat:" + quanlisanphams.toString());
        System.out.println("So san pham co so luong duoi 5");
        for(int n =0 ; n < Quanlisanphamlist.length;n++){
            Quanlisanpham quanlisanphamm = Quanlisanphamlist[n];
        if(quanlisanphamm.getAmount()<5){
            System.out.printf("Amount =  " + quanlisanphamm.getAmount());
            System.out.println("  " + quanlisanphamm.toString());
        }
      }
        for(Quanlisanpham quanlisanphamm : Quanlisanphamlist){
            if(quanlisanphamm.getPrice() < 50000){
            System.out.println("San pham co gia duoi 50.000: " + quanlisanphamm.toString());
           }else if(quanlisanphamm.getPrice() < 100000 && quanlisanphamm.getPrice()> 50000){
            System.out.println("San pham co gia tu 50.000 den duoi 100.000:  " + quanlisanphamm.toString());
           }else{
            System.out.println("San pham co gia tu 100.000 tro len:  " + quanlisanphamm.toString());
           }
        }
}
}
