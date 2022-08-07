public class Series extends Film {
    private int soTap;
    private int thoiLuongTrungBinh;
  
    protected Series(String id , String tacgia, String tieuDe, double ranking, TheLoai theLoai, int soTap, int thoiLuongTrungBinh) {
      super(id, tacgia, tieuDe, ranking, theLoai);
      this.soTap = soTap;
      this.thoiLuongTrungBinh = thoiLuongTrungBinh;
    }
    protected int getSoTap() {
      return soTap;
    }
    protected void setSoTap(int soTap) {
      this.soTap = soTap;
    }
    protected int getThoiLuongTrungBinh() {
      return thoiLuongTrungBinh;
    }
    protected void setThoiLuongTrungBinh(int thoiLuongTrungBinh) {
      this.thoiLuongTrungBinh = thoiLuongTrungBinh;
    }
    @Override
    public String toString() {
      return super.toString()+
          "soTap=" + soTap +
          ", thoiLuongTrungBinh=" + thoiLuongTrungBinh +
          '}';
    }
  
  
  }
