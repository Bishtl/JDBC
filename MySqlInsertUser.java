import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class MySqlInsertUser {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/sonoo";
        String username = "root";
        String password = "2001";
        Connection c = DriverManager.getConnection(url ,  username, password);
        String qu = "insert into emp202 values(?,?,?)";
        PreparedStatement p =  c.prepareStatement(qu);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Id");
        int a = br.read();
        System.out.println("Enter Name");
        String name = br.readLine();
        System.out.println("Enter City");
        String city = br.readLine();

        p.setInt(1, a);
        p.setString(2, name);
        p.setString(3, city);
        p.executeUpdate();
        System.out.println("inserted");

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
