import java.sql.*;
import java.util.Scanner;

public class Movie {
//    public static final String DB_DRIVER = "org.apache.hive.jdbc.HiveDriver";
    public static final String DB_URL = "jdbc:hive2://localhost:10000/dbda";
    public static final String DB_USER = "";
    public static final String DB_PASSWORD = "";

//    static {
//        try {
//            Class.forName(DB_DRIVER);
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.exit(1);
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a movie id: ");
        int movieId = sc.nextInt();

        try(Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "SELECT m.id, m.title, mc.cnt, mc.cor FROM movies_orc m INNER JOIN movies_corr mc ON (mc.m1 = m.id OR mc.m2 = m.id) WHERE mc.cor IS NOT NULL AND mc.cnt > 50 AND (mc.m1 = ? OR mc.m2 = ?) AND (m.id != ?) ORDER BY mc.cor DESC LIMIT 5";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, movieId);
                stmt.setInt(2, movieId);
                stmt.setInt(3, movieId);

                try(ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        int id = rs.getInt(1);
                        String title = rs.getString(2);
                        double corr = rs.getDouble(4);
                        int cnt = rs.getInt(3);
                        System.out.printf("%d, %s, %.2f, %d\n", id, title, corr, cnt);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
