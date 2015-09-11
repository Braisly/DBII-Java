package conexion;

import java.io.*;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class supermercado {

    public Connection conexion = null;

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public void conectar() throws FileNotFoundException, IOException, SQLException{

        if (conexion != null) {
            return;
        }

        try {
            Properties configuracion = new Properties();
            FileInputStream arqConfiguracion;
            arqConfiguracion = new FileInputStream("baseDatos.properties");
            configuracion.load(arqConfiguracion);
            arqConfiguracion.close();

            String url = configuracion.getProperty("fonteDatos") + ":" + configuracion.getProperty("xestor") + "://"
                    + configuracion.getProperty("servidor") + ":"
                    + configuracion.getProperty("porto") + "/"
                    + configuracion.getProperty("baseDatos");

            conexion = DriverManager.getConnection(url, configuracion.getProperty("usuario"), configuracion.getProperty("clave"));
        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(supermercado.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        }
    }

    public void cerrar() {

        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(supermercado.class.getName());
            lgr.log(Level.WARNING, ex.getMessage(), ex);

        }
        
    }
}