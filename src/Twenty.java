import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
class Twenty{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vamsi","root","Vamsi123@");
            PreparedStatement ps=con.prepareStatement("select * from employee ");
            ResultSet rs=ps.executeQuery();
            ArrayList<Emp2> al=new ArrayList<>();
            while(rs.next()){
                Emp2 e=new Emp2(rs.getInt("id"),rs.getString("name"),rs.getDouble("salary"));
                al.add(e);
            }
            int searchid=16;
            boolean found=false;
            for(Emp2 e:al){
                if(e.getId()==searchid){
                System.out.println(e.getId()+""+e.getName()+""+e.getSalary());
                found=true;
                break;
                }

            }
             if(!found){
                    System.out.println("Employee not forund");
                }
        }
        catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}