import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
class Thirteen{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vamsi","root","Vamsi123@");
            PreparedStatement ps=con.prepareStatement("select * from employee");
            ResultSet rs=ps.executeQuery();
            ArrayList<EmployeeArray> al=new ArrayList<>();
            while(rs.next()){
                EmployeeArray e=new EmployeeArray(rs.getInt("id"),rs.getString("name"),rs.getDouble("salary"));
                al.add(e);
            }
            for(EmployeeArray e:al){
                System.out.println(e.getId()+""+e.getName()+""+e.getSalary());
            }
        }
        catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}