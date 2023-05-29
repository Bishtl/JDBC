import java.io.FileInputStream;
import java.sql.*;
public class MysqlPhotoInsert {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/sonoo";
            String username = "root";
            String password = "2001"; 
           Connection con =  DriverManager.getConnection(url,username,password);
           String qu = "insert into images values(?,?)";
           PreparedStatement p =  con.prepareStatement(qu);

           FileInputStream fi = new FileInputStream("dummy.jpg");
           p.setBinaryStream(2, fi, fi.available());
                      System.out.println("image inserted");

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
