
package ConexionSQLBD;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import selecciones.Aspirante;

public class BDAspirantes {
  public ArrayList <Aspirante> ListaAspirantes(){
     ArrayList <Aspirante> aspirante= new ArrayList(); 
     
      try {
          Connection con=BaseDatosConexion.getConnection();
          Statement st= con.createStatement();
          ResultSet rs= st.executeQuery(" SELECT MATRICULA, NOMBRE,APELLIDOPATERNO,APELLIDOMATERNO,CORREO,CELULAR,GENERACION,CARRERA,PROYECTOTESIS,DIRECTORTESIS "
          + "  FROM ASPIRANTEST ORDER BY 2");
          while(rs.next()){
            Aspirante asp=new Aspirante();
            asp.setMatricula(rs.getString("MATRICULA"));
            asp.setNombre(rs.getString("NOMBRE"));
            asp.setApelPaterno(rs.getString("APELLIDOPATERNO"));
            asp.setApelMaterno(rs.getString("APELLIDOMATERNO"));
            asp.setCorreo(rs.getString("CORREO"));
            asp.setCelular(rs.getString("CELULAR"));
            asp.setGeneracion(rs.getString("GENERACION"));
            asp.setCarrera(rs.getString("CARRERA"));
            asp.setTemTesis(rs.getString("PROYECTOTESIS"));
            asp.setDirTesis(rs.getString("DIRECTORTESIS"));
            aspirante.add(asp);
          }
      } catch (SQLException ex) {
        System.out.println(ex.getMessage());
        System.out.println("Error en la lista de aspirantes");
      }
     return aspirante;
  }
public void InsertarAspirantes(Aspirante aspirante){
  try{
    Connection con=BaseDatosConexion.getConnection();
    PreparedStatement pst= con.prepareStatement(" INSERT INTO ASPIRANTEST( MATRICULA, NOMBRE, APELLIDOPATERNO, APELLIDOMATERNO, CORREO, CELULAR, GENERACION, CARRERA, PROYECTOTESIS, DIRECTORTESIS)"
    +"VALUES(?,?,?,?,?,?,?,?,?,?)");
    pst.setString(1,aspirante.getMatricula());
    pst.setString(2,aspirante.getNombre());
    pst.setString(3,aspirante.getApelPaterno());
    pst.setString(4,aspirante.getApelMaterno());
    pst.setString(5,aspirante.getCorreo());
    pst.setString(6,aspirante.getCelular());
    pst.setString(7,aspirante.getGeneracion());
    pst.setString(8,aspirante.getCarrera());
    pst.setString(9,aspirante.getTemTesis());
    pst.setString(10,aspirante.getDirTesis());
    pst.executeUpdate();
    }catch(SQLException ex){
   System.out.println(ex.getMessage());
   System.out.println("Error en insertar los aspirantes");
  }  
} 
    
}
