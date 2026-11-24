import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
class Six{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vamsi","root","Vamsi123@");
            PreparedStatement ps=con.prepareStatement("delete from employee where id=10");
            int rs=ps.executeUpdate();
            System.out.println(rs+"rows affected");
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}