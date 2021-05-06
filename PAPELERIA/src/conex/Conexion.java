package Conex;
/* author Sandra DLS */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Conexion {
    Connection con;
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dulces","root","");
        }catch (Exception e){
            System.err.println("Error: "+ e);
        }
         return con;
    }
    public static void main(String[] args) throws SQLException{
       Conexion cn=new Conexion();
       Statement st;
       ResultSet rs;
       try {
            st=cn.con.createStatement();
           rs=st.executeQuery("select * from usuarios");
           while (rs.next() ){
               System.out.println(rs.getString("Nombre")+" " +rs.getString("password"));
           }
       }catch(Exception e){
           
       }
    }
    
}
