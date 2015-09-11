package clases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import conexion.porto;

public class consultas {

    public int insertarempleado(String DNI, String nombre, String apellidos, Integer telefono, Float sueldo) throws FileNotFoundException, IOException{

       Statement st = null;
       porto adap = new porto();

        try {
            adap.conectar();
            st = adap.getConexion().createStatement();
            adap.getConexion().setAutoCommit(false);
            st.executeUpdate("insert into persoas values ('"+DNI+"','"+nombre+"','"+apellidos+"',NULL,'"+telefono+"',NULL,NULL,NULL,true,NULL,"+sueldo+")");
           // insert into persoas values('888014O','Carlos','Mella Perol','1992/03/15',69875568,'Salgueiriños','carlos@mail.com',false,true,'2010/02/14',875);
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
    
    
    
    
    
    public ResultSet obtenerEmpleados() throws FileNotFoundException, IOException{

        ResultSet rs = null;
        Statement st = null;
        porto adap = new porto();

        try {
            
            adap.conectar();
            st = adap.getConexion().createStatement();
            rs = st.executeQuery("select * from persoas where empleados=true");
           

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
    
    
    
    public ResultSet obtenerAmarres() throws FileNotFoundException, IOException{

        ResultSet rs = null;
        Statement st = null;
        porto adap = new porto();

        try {
            
            adap.conectar();
            st = adap.getConexion().createStatement();
            rs = st.executeQuery("select * from estaramarrado");
           

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
    
    
    
    
    
    public ResultSet obtenerBarcosCodigo(Integer codigo) throws FileNotFoundException, IOException{

        ResultSet rs = null;
        Statement st = null;
        porto adap = new porto();

        try {
            
            adap.conectar();
            st = adap.getConexion().createStatement();
            rs = st.executeQuery("select * from barcos where codigo="+codigo+"");
           

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
    
    
    
    
    
    public int reservaramarre(String FE, String FS, Integer codigoBarco, Integer codigoAmarre, Integer codigoMuelle) throws FileNotFoundException, IOException{

       Statement st = null;
       porto adap = new porto();

        try {
            adap.conectar();
            st = adap.getConexion().createStatement();
            adap.getConexion().setAutoCommit(false);
            if(FS.equals(""))
            {
            st.executeUpdate("insert into estaramarrado values('"+FE+"',NULL,"+codigoBarco+","+codigoAmarre+","+codigoMuelle+")");
            }
            else
            {
            st.executeUpdate("insert into estaramarrado values('"+FE+"','"+FS+"',"+codigoBarco+","+codigoAmarre+","+codigoMuelle+")");
            }
            // insert into persoas values('888014O','Carlos','Mella Perol','1992/03/15',69875568,'Salgueiriños','carlos@mail.com',false,true,'2010/02/14',875);
           //insert into estaramarrado values('2010/05/20','2011/05/20',1,1,1);
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