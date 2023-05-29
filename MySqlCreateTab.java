import java.sql.*;
public class MySqlCreateTab {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/sonoo";
            String username = "root";
            String password = "2001";
            Connection con = DriverManager.getConnection(url,username,password);
            String q = "create table emp202(id int primary key , Name varchar(50) , City Varchar(50))";
            Statement s = con.createStatement();
            s.executeUpdate(q);
            System.out.println("Table is craeted");



        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
