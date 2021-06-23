
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Huerta Gonzalez
 */
public class conexion {
    
    public static Connection getConexion(){
        
        Connection conexion = null;
        
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/base_elguapo?&serverTimezone=UTC", "root", "");
            
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        return conexion;
    }
}
