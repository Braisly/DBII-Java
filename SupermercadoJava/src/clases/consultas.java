package clases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import conexion.supermercado;

public class consultas {
    
    
    
    
   
    
    
    
    
    
    
    
    public ResultSet obtenerProveedores() throws FileNotFoundException, IOException{

        ResultSet rs = null;
        Statement st = null;
        supermercado adap = new supermercado();

        try {
            
            adap.conectar();
            st = adap.getConexion().createStatement();
            rs = st.executeQuery("select cif, nombre, direccion, personaResponsabe, telefono, infoFacturacion from proveedor");
           

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(consultas.class.getName());
            lgr.log(Level.WARNING, ex.getMessage(), ex);
        } finally {
            try {
                if (st != null) {
                    adap.cerrar();
                }
                if (adap.getConexion() != null) {
                    adap.cerrar();
                }
            } catch (Exception ex) {
                Logger lgr = Logger.getLogger(consultas.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }

        }
        return rs;
    }
    
    
    
    
       public int insertarproveedor(String CIF, String nombre, String direccion, String telefono) throws FileNotFoundException, IOException{

       Statement st = null;
       supermercado adap = new supermercado();

        try {
            adap.conectar();
            st = adap.getConexion().createStatement();
            adap.getConexion().setAutoCommit(false);
            st.executeUpdate("insert into proveedor values ('"+CIF+"','"+nombre+"','"+direccion+"',NULL,'"+telefono+"',NULL)");
            //insert into proveedor values('8889984O','Juan Guerrero','Calle Rosales, Santiago','Juan Guerrero','34987456','Suministradores de congelados');
            adap.getConexion().commit();

        } catch (SQLException ex) {
            if (adap.getConexion() != null) {
                try {
                     adap.getConexion().rollback();
                } catch (SQLException ex1) {
                    Logger lgr = Logger.getLogger(consultas.class.getName());
                    lgr.log(Level.WARNING, ex1.getMessage(), ex1);
                }
            }
            Logger lgr = Logger.getLogger(consultas.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
            return 1;
        } finally {
            try {
                if (st != null) {
                    adap.cerrar();
                }
                if (adap.getConexion() != null) {
                    adap.cerrar();
                }
                return st.getFetchSize();
            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(consultas.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
                return 1;
            }

        }
    }
       
       
       
       public ResultSet obtenerCIFProveedor(String CIF) throws FileNotFoundException, IOException{

        ResultSet rs = null;
        Statement st = null;
        supermercado adap = new supermercado();

        try {
            
            adap.conectar();
            st = adap.getConexion().createStatement();
            rs = st.executeQuery("select cif, nombre, direccion, telefono from proveedor where cif='"+CIF+"'");
           

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(consultas.class.getName());
            lgr.log(Level.WARNING, ex.getMessage(), ex);
        } finally {
            try {
                if (st != null) {
                    adap.cerrar();
                }
                if (adap.getConexion() != null) {
                    adap.cerrar();
                }
            } catch (Exception ex) {
                Logger lgr = Logger.getLogger(consultas.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }

        }
        return rs;
    }
       
       
       
       
       public int modificarproveedor(String CIF1, String CIF, String nombre, String direccion, String telefono) throws FileNotFoundException, IOException{

       Statement st = null;
       supermercado adap = new supermercado();

        try {
            adap.conectar();
            st = adap.getConexion().createStatement();
            adap.getConexion().setAutoCommit(false);
            st.executeUpdate("update proveedor set cif='"+CIF+"',nombre='"+nombre+"',direccion='"+direccion+"',telefono='"+telefono+"' where cif='"+CIF1+"'");
            adap.getConexion().commit();

        } catch (SQLException ex) {
            if (adap.getConexion() != null) {
                try {
                     adap.getConexion().rollback();
                } catch (SQLException ex1) {
                    Logger lgr = Logger.getLogger(consultas.class.getName());
                    lgr.log(Level.WARNING, ex1.getMessage(), ex1);
                }
            }
            Logger lgr = Logger.getLogger(consultas.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
            return 1;
        } finally {
            try {
                if (st != null) {
                    adap.cerrar();
                }
                if (adap.getConexion() != null) {
                    adap.cerrar();
                }
                return st.getFetchSize();
            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(consultas.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
                return 1;
            }

        }
    }

}