// 21. Calculate the average salary of employees using ArrayList.	
// 21. Calculate the average salary of employees using ArrayList.	

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import java.sql.ResultSet;
public class TwoOne {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vamsi","root","Vamsi123@");
            PreparedStatement ps=con.prepareStatement("select * from employee");
            ResultSet rs=ps.executeQuery();
            ArrayList<Employee> al=new ArrayList<>();
            while(rs.next()){
                Employee e=new Employee(rs.getInt("id"),rs.getString("name"),rs.getDouble("salary"));
                al.add(e);
            }
            double totalSalary=0;
            int n=0;
            for(Employee e:al){
                totalSalary+=e.getSalary();
                n++;
            }
            double avg;
            avg=totalSalary/n;
            System.out.println(avg);

        }
        catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
   public static class Employee{
        int id;
        String name;
        double salary;
        Employee(int id,String name,double salary){
            this.id=id;
            this.name=name;
            this.salary=salary;
        }
        public void setId(int id){
            this.id=id;
        }
        public int getId(){
            return id;
        }
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
        public void setSalary(double salary){
            this.salary=salary;
        }
        public double getSalary(){
            return salary;
        }
    }
}
