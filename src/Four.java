import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
class Four{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vamsi","root","Vamsi123@");
            PreparedStatement ps=con.prepareStatement("insert into employee values(50,'Vamsi',1000000)");
            int a=ps.executeUpdate();
            System.out.println(+a+"Record Inserted Successfully");
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }

}