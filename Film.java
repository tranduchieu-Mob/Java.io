enum TheLoai{
    HORROR, COMEDY, DOCUMENTATRY, FICTION;
  }
  public class Film {
    private String id;
    private String tacgia;
    private String tieuDe;
    private double ranking;
    private TheLoai theLoai;
  
    protected Film(String id, String tacgia ,String tieuDe, double ranking, TheLoai theLoai) {
      this.id = id;
      this.tacgia = tacgia;
      this.tieuDe = tieuDe;
      this.ranking = ranking;
      this.theLoai = theLoai;
    }
  
    protected String getId() {
      return id;
    }
  
    protected void setId(String id) {
      this.id = id;
    }
    protected String getTacGia() {
      return tacgia;
    }
  
    protected void setTacGia(String tacgia) {
      this.tacgia = tacgia;
    }
  
  
    protected String getTieuDe() {
      return tieuDe;
    }
  
    protected void setTieuDe(String tieuDe) {
      this.tieuDe = tieuDe;
    }
  
    protected double getRanking() {
      return ranking;
    }
  
    protected void setRanking(double ranking) {
      this.ranking = ranking;
    }
  
    protected TheLoai getTheLoai() {
      return theLoai;
    }
  
    protected void setTheLoai(TheLoai theLoai) {
      this.theLoai = theLoai;
    }
  
    @Override
    public String toString() {
      return "{" +
          "id='" + id + '\'' +
          ", tacgia='" + tacgia + '\'' +
          ", tieuDe='" + tieuDe + '\'' +
          ", ranking=" + ranking +
          ", theLoai=" + theLoai + ", ";
    }
  }