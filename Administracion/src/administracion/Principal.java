
package administracion;

import java.sql.SQLException;
import servicio.Conexion;
import servicio.ConexionTemporal;

public class Principal {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        Inicio i = new Inicio();
        ConexionTemporal c = new ConexionTemporal();
        c.crearTabla(c.obtener());
    }
    
}
