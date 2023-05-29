import java.sql.*;
public class MySqlUpdate {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306:sonoo";
            Connection con = DriverManager.getConnection(null, null, null);
            String q = "update emp set city=Goa where id=3";
           PreparedStatement pre =   con.prepareStatement(q);
           pre.executeUpdate();
           System.out.println("Updated");

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
}
