import java.util.*;

public class QuanLyPhim {

  public static void main(String args[]) {

    // mảng để quản lý movies
    Movie[] movies;

    // mảng để quản lý series
    Series[] series;
    movies = new Movie[4];
    series = new Series[4];

    movies[0] = new Movie("1", "Tran Duc Hieu", "Phim hai kich", 5.3, TheLoai.COMEDY, 120);
    movies[1] = new Movie("2", "Nguyen Kim Cong","Phim tai lieu", 4.1, TheLoai.DOCUMENTATRY, 140);
    movies[2] = new Movie("3", "Nguyen Tuan Anh", "Phim rung ron", 9.8, TheLoai.HORROR, 160);
    movies[3] = new Movie("4","Nguyen Thanh Tung", "Phim vien tuong", 9.5, TheLoai.FICTION, 180);


    series[0] = new Series("5", "Nguyen Van A", "Phim hai kich", 7.2, TheLoai.COMEDY, 10, 30);
    series[1] = new Series("6", "Nguyen Van B", "Phim tai lieu", 3.3, TheLoai.DOCUMENTATRY, 20, 40);
    series[2] = new Series("7","Nguyen Van C", "Phim rung ron", 8.4, TheLoai.HORROR, 30, 45);
    series[3] = new Series("8","Nguyen Van D", "Phim vien tuong", 8.8, TheLoai.FICTION, 40, 60);

    List<Film> flims1 = Arrays.asList(movies);
    List<Film> flims2 = Arrays.asList(series);
    List<Film> flims = new ArrayList<>();
    flims.addAll(flims1);
    flims.addAll(flims2);

    System.out.println("-----------");
    System.out.println("Thông tin phim !");
    for (int i = 0; i < movies.length; i++) {
      // toString gọi từ bên class Movie
      System.out.println(movies[i].toString());
    }
    for (int i = 0; i < series.length; i++) {
      // toString gọi từ bên class Series
      System.out.println(series[i].toString());
    }
    System.out.println("-----------");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap tieu de de tim kiem phim: ");
    String tieuDe = scanner.nextLine();
    System.out.println(searchTieuDe(tieuDe,movies,series).isEmpty() ? "Khong tim thay phim" : searchTieuDe(tieuDe,movies,series));
    System.out.println("----------");
    System.out.println("Flim co rank thap nhat bao gom : " );
    System.out.println(searchMinRanking(flims));

    System.out.println("----------");
    System.out.println("Dao dien co the loai COMEDY co ranking thap nhat bao gom : " );
    System.out.println(searchMinRankingByTheLoaiIsCOMEDY(flims));
  }


  public static List<Film> searchTieuDe(String tieuDe, Movie[] movies, Series[] series) {
    List<Film> flims = new ArrayList<>();
    // lặp lần lượt để tìm kiếm tiêu để với movie rồi add vào list
    for (Movie movie : movies) {
      if (movie.getTieuDe().equals(tieuDe)) {
        flims.add(movie);
      }
    }
    // lặp lần lượt để tìm kiếm tiêu để với series rồi add vào list
    for (Series s : series) {
      if (s.getTieuDe().equals(tieuDe)) {
        flims.add(s);
      }
    }
    return flims;
  }
  public static List<Film> searchMinRanking(List<Film> flims) {
    List<Film> list = new ArrayList<>();
    // dùng set để loại bổ giá trị trùng nhau ; treeSet là để sắp xếp tăng dần rank
    Set<Double> rank = new TreeSet<>();
    // lặp lần lượt để adđ rank vào set
    for (Film flim : flims){
      rank.add(flim.getRanking());
    }
    List<Double> ranks = new ArrayList<>(rank);
    //lặp lần lượt để lấy lấy list flim có rank thấp nhất add vào list flim
    for (Film flim : flims){
      if(flim.getRanking() == ranks.get(0)){
        list.add(flim);
      }
    }
    return list;

  }
  public static List<Film> searchMinRankingByTheLoaiIsCOMEDY(List<Film> flims) {
    List<Film> list = new ArrayList<>();

    // dùng set để loại bổ giá trị trùng nhau ; treeSet là để sắp xếp tăng dần rank
    Set<Double> rank = new TreeSet<>();

    // lặp lần lượt để adđ rank với điều kiện là thể loại COMEDY vào set
    for (Film flim : flims){
      if(flim.getTheLoai().equals(TheLoai.COMEDY)){
        rank.add(flim.getRanking());
      }
    }
    List<Double> ranks = new ArrayList<>(rank);

  //lặp lần lượt để lấy lấy list flim có rank thấp nhất add vào list flim với điều kiện là thể loại COMEDY
    for (Film flim : flims){
      if(flim.getTheLoai().equals(TheLoai.COMEDY) && flim.getRanking() == ranks.get(0)){
        list.add(flim);
      }
    }
    return list;

  }
}
