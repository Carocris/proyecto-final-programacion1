
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    protected Connection conexion;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/NoteApp";

    private final String USER = "root";
    private final String PASS = "2003";

    public void conectar() {
        
        try {
            Class.forName(JDBC_DRIVER); // Primero cargamos el controlador JDBC
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
    }
    
    public void Cerrar() throws SQLException{
        if (conexion != null){
       if( conexion.isClosed()){
           conexion.close();
       }
    }
    }
}