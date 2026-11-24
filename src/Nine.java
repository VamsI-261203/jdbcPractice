import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
class Nine{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vamsi","root","Vamsi123@");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from employee order by salary asc");
            int id;String name;double salary;
            System.out.println("ID\tName\tSalary");
            while(rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getDouble("salary"));
            }
        }
        catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}