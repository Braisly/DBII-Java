package porto;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO {

    public ResultSet obtenerEstibadores() throws FileNotFoundException, IOException{

        ResultSet rs = null;
        Statement st = null;
        adaptador adap = new adaptador();
        
        try {
            adap.conectar();
            st = adap.getConexion().createStatement();
            rs = st.executeQuery("SELECT t.DNI "
                               + "FROM   traballaen as t, personalcargadescarga as p, transportistas as t "
                               + "WHERE  (t.personalcargadescarga != p.empleado AND p.empleado = t.DNI) "
                               + "AND    (SELECT COUNT(*) FROM traballaen as tra WHERE tra.DNI = t.DNI AND fechaFin IS NULL) < 2 "
                               );

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(DAO.class.getName());
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
                Logger lgr = Logger.getLogger(DAO.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }

        }
        return rs;
    }

    public ResultSet obtenerMovimientos() throws FileNotFoundException, IOException{

        ResultSet rs = null;
        Statement st = null;
        adaptador adap = new adaptador();

        try {
            
            adap.conectar();
            st = adap.getConexion().createStatement();
            rs = st.executeQuery("SELECT b.nombre "
                               + "FROM   movementos as m, barcotransporte as bar, barcos as b, mercancias as mer "
                               + "WHERE  (m.barco = bar.barco AND bar.barco = b.codigo AND m.mercancia = mer.codigo) "
                               + "AND     m.fechaFin > (SELECT current_timestamp) "
                               );

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(DAO.class.getName());
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
                Logger lgr = Logger.getLogger(DAO.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }

        }
        return rs;
    }

    public int insertarTraballo(String fechaMov, String dni, String barco, String mercancia) throws FileNotFoundException, IOException{

       Statement st = null;
       adaptador adap = new adaptador();

        try {
            adap.conectar();
            st = adap.getConexion().createStatement();
            adap.getConexion().setAutoCommit(false);
            st.executeUpdate("INSERT INTO traballaen VALUES ('" + fechaMov + "','" + dni + "'," + barco + "," + mercancia + ", NULL)");
            
            adap.getConexion().commit();

        } catch (SQLException ex) {
            if (adap.getConexion() != null) {
                try {
                    adap.getConexion().rollback();
                } catch (SQLException ex1) {
                    Logger lgr = Logger.getLogger(DAO.class.getName());
                    lgr.log(Level.WARNING, ex1.getMessage(), ex1);
                }
            }
            Logger lgr = Logger.getLogger(DAO.class.getName());
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
                Logger lgr = Logger.getLogger(DAO.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
                return 1;
            }

        }
    }

}
