import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
class Five{
    public static void main(String[] args){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vamsi","root","Vamsi123@");
            //    Statement st=con.createStatement();
            // int rs=st.executeUpdate("update employee set salary=1500 where id=10");
            // System.out.println(rs+" rows affected");
            PreparedStatement ps=con.prepareStatement("update employee set salary=1500 where id=10");
            int rs=ps.executeUpdate();
            System.out.println(rs+" rows affected");

        }
        catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}