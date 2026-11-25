import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
class Twelve{
    public static void main(String[] args){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vamsi","root","Vamsi123@");
        PreparedStatement ps=con.prepareStatement("select *from employee where id=16");
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            Emp e=new Emp(rs.getInt("id"),rs.getString("name"),rs.getDouble("salary"));
            System.out.println(e.getId()+"  "+e.getName()+"  "+e.getSalary());
        }
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}