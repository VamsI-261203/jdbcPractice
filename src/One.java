//Insert a single employee record using Statement.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
class One{
    public static void main(String[] args){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vamsi","root","Vamsi123@");
        Statement st=con.createStatement();
        int rs=st.executeUpdate("insert into employee values(100,'Vamsi',1000000)");
        System.out.println("Record Inserted Successfully"+rs);
    }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}