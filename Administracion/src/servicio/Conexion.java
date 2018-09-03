package servicio;

import java.sql.*;

public class Conexion {

    private Connection con;

    
    public void abrirConexion() {
        try {
            String user = "root";
            String pass = "123456789";
            String url = "jdbc:mysql://localhost:3306/administracion?useSSL=false";
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void cerrarConexion() {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public String printMessages() {
        ResultSet rs = null;
        String mensaje = null;
        String mensajeCompleto = "";
        try {
            abrirConexion();
            Statement st = con.createStatement();
            String query = "select * from camiones";
            rs = st.executeQuery(query);
            while (rs.next()) {
                mensaje = rs.getString("patente") + ": " + rs.getInt("peso") + "kg de " + rs.getString("carga") + "\n";  
                mensajeCompleto += mensaje;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                cerrarConexion();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
      return mensajeCompleto;

    }
    
    

    public void addMessage(String patente,int peso, String carga) {
        try {
            abrirConexion();
            Statement st = con.createStatement();

            //String query = "INSERT INTO administracion.camiones (patente, peso, carga) VALUES ('patente', 'peso', 'carga');";
            String query = "INSERT INTO administracion.camiones (patente, peso, carga) VALUES ('" + patente + "','" + peso + "', '" + carga + "');";

            st.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
}
     

