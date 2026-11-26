// 19. Display all employees using an enhanced for loop.  
// 19. Display all employees using an enhanced for loop.  
// 19. Display all employees using an enhanced for loop.  

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
class Nineteen{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vamsi","root","Vamsi123@");
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery("select* from employee");
            ArrayList<Emp1> el=new ArrayList<>();
            while(rs.next()){
                Emp1 e=new Emp1(rs.getInt("id"),rs.getString("name"),rs.getDouble("salary"));
                el.add(e);
            }
            for(Emp1 e:el){
                System.out.println(e.getId()+"  "+e.getName()+"  "+e.getSalary());
            }
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}