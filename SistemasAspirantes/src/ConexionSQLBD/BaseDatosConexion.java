
package ConexionSQLBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDatosConexion {
     static String mibd = "jdbc:oracle:thin:@localhost:1521:XE";
          static String usuario = "BDASPIRANTES";
          static String contrasena="1234";
    public static Connection getConnection(){
      try{
          Class.forName("oracle.jdbc.driver.OracleDriver");
        
          
          Connection conex=DriverManager.getConnection(mibd,usuario,contrasena);
          
          return conex;
      }catch(SQLException ex){
       System.out.println(ex.getMessage());  
      } catch(ClassNotFoundException ex){
          Logger.getLogger(BaseDatosConexion.class.getName()).log(Level.SEVERE,null,ex);
      }
      return null;
    }
    
}
