import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
class Eleven{
    public static void main(String[] args){
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vamsi","root","Vamsi123@");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from employee");
        while(rs.next()){
            ElevenA e=new ElevenA(rs.getInt("id"),rs.getString("name"),rs.getDouble("salary"));
            System.out.println(e.getId()+"  "+e.getName()+"  "+e.getSalary());
        }
       } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
       }
    }
}