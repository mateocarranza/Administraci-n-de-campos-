
package servicio;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionTemporal {

private static Connection con = null;

    public static Connection obtener() throws SQLException, ClassNotFoundException {
        if (con == null) {
            try {
                String user = "root";
                String pass = "123456789";
                String url = "jdbc:mysql://localhost:3306/administracion?useSSL=false";
                con = DriverManager.getConnection(url, user, pass);
            } catch (SQLException ex) {
                throw new SQLException(ex);
            }
        }
        return con;
    }
    
     public static void cerrar() throws SQLException {
        if (con != null) {
            con.close();
        }
     }

    public void crearTabla(Connection cnx) throws SQLException{
        PreparedStatement stmt;
        stmt = cnx.prepareStatement("CREATE TABLE temporal (patente varchar(10), peso INT, material varchar(30))");  
        stmt.execute(); 
    }
    
    public void borrarTabla(Connection cnx) throws SQLException{
        PreparedStatement stmt;
        stmt = cnx.prepareStatement("DROP TABLE temporal ");  
        stmt.execute(); 
  

    }
    public String imprimirMensajeTemporal() {
        ResultSet rs = null;
        String mensaje;
        String mensajeCompleto = "";
        try {

            Statement st = con.createStatement();
            String query = "select * from temporal";
            rs = st.executeQuery(query);
            while (rs.next()) {
                mensaje = "el camion con patente " + rs.getString("patente") + " salio con " + rs.getInt("peso") + "kg de " + rs.getString("material") + "\n";  
                mensajeCompleto += mensaje;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
               
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
      return mensajeCompleto;

    }
    public void agregarMnesajeTemporal(String patente, int peso, String material){
        try {
            Statement st = con.createStatement();

            //String query = "INSERT INTO administracion.temporal (patente, peso, carga) VALUES ('patente', 'peso', 'material');";
            String query = "INSERT INTO temporal (patente, peso, material) VALUES ('" + patente + "','" + peso + "', '" + material + "');";

            st.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}