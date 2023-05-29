import java.sql.*;
public class MYSqlCon{

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/sonoo";
            String username = "root";
            String password = "2001";
            Connection con = DriverManager.getConnection(url,username,password);
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from emp");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));

            }
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}