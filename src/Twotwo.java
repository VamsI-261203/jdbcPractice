import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
class Twotwo{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vamsi","root","Vamsi123@");
            PreparedStatement ps=con.prepareStatement("select * from employee");
            ResultSet rs=ps.executeQuery();
            ArrayList<Emp> al=new ArrayList<>();
            while(rs.next()){
                Emp e=new Emp(rs.getInt("id"),rs.getString("name"),rs.getDouble("salary"),rs.getString("departments"));
                al.add(e);
            }
            HashMap<String,Integer> map=new HashMap<>();
            for(Emp e:al){
                String str=e.getDepartments();
                if(map.containsKey(str)){
                    map.put(str,map.get(str)+1);
                }
                else{
                    map.put(str,1);
                }
            }
            for(String key:map.keySet()){
                System.out.println(key+"-->"+map.get(key));
            }
        }
        catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    static class Emp{
        int id;String name;double salary;String departments;
        Emp(int id,String name,double salary,String departments){
            this.id=id;
            this.name=name;
            this.salary=salary;
            this.departments=departments;
        }
        public void setId(int id){
            this.id=id;
        }
        public void setName(String name){
            this.name=name;
        }
        public void setSalary(double salary){
            this.salary=salary;
        }
        public void setDepartments(String departments){
            this.departments=departments;
        }
        public int getId(){
            return id;
        }
        public String getName(){
            return name;
        }
        public double getSalary(){
            return salary;
        }
        public String getDepartments(){
            return departments;
        }

    }
}