import java.sql.*;
public class MySqlInsert {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/sonoo";
            String username = "root";
            String password = "2001";
            Connection con =DriverManager.getConnection(url,username,password);
            String a = "insert into emp202 values(?,?,?)";
           PreparedStatement p = con.prepareStatement(a);
            p.setInt(1,1);
            p.setString(2, "Rohit");
            p.setString(3, "Noida");
            p.setInt(1,2);
            p.setString(2, "Sagar");
            p.setString(3, "Ghaziabad");
            p.executeUpdate();
            System.out.println("Inserted");


        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
