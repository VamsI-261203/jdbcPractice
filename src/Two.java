import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
class Two{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vamsi","root","Vamsi123@");
            System.out.println("Connection Established"+con);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from employee");
            int id;
            String name;
            double salary;
            System.out.println("ID\tName\tSalary");
            while(rs.next()){
                System.out.println(rs.getInt("id")+"    "+rs.getString("name")+"    "+rs.getDouble("salary"));
            }
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}