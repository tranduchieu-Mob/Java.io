

public class Movie extends Film{
    private int thoiLuong;
    protected Movie(String id, String tacgia, String tieuDe, double ranking, TheLoai theLoai, int thoiLuong) {
      super(id, tacgia, tieuDe, ranking, theLoai);
      this.thoiLuong = thoiLuong;
    }
  
    protected int getThoiLuong() {
      return thoiLuong;
    }
  
    protected void setThoiLuong(int thoiLuong) {
      this.thoiLuong = thoiLuong;
    }
  
    @Override
    public String toString() {
      return super.toString() +
          "thoiLuong=" + thoiLuong +
          '}';
    }
  }
