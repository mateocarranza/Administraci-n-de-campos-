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

    public void printMessages() {
        ResultSet rs = null;
        try {
            abrirConexion();
            Statement st = con.createStatement();
            String query = "select * from camiones";
            rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("patente") + ": " + rs.getString("carga"));
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
    }
    
    

    public void addMessage(String patente, String carga) {
        try {
            abrirConexion();
            Statement st = con.createStatement();

            //String query = "INSERT INTO irc.chat (usuario, mensaje) VALUES ('user', 'message');";
            String query = "INSERT INTO irc.camiones (patente, carga) VALUES ('" + patente + "', '" + carga + "');";

            st.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
