/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entornografico;

import clases.consultas;

import javax.swing.DefaultListModel;
import java.sql.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class proveedoresinsertar extends javax.swing.JFrame {


    public proveedoresinsertar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListEmpleados = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextCIF = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextTelefono = new javax.swing.JTextField();
        jTextDireccion = new javax.swing.JTextField();
        jButtonInsertar = new javax.swing.JButton();
        jButtonResetear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane1.setViewportView(jListEmpleados);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Proveedores");

        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("*CIF:");

        jLabel3.setText("*Nombre:");

        jLabel4.setText("*Dirección:");

        jLabel5.setText("*Teléfono:");

        jButtonInsertar.setText("Insertar");
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });

        jButtonResetear.setText("Resetear");
        jButtonResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(100, 100, 100)
                                .addComponent(jTextCIF, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jButtonResetear)
                                .addGap(36, 36, 36)
                                .addComponent(jButtonInsertar)))
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))))
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jTextCIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertar)
                    .addComponent(jButtonResetear))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            //controlador.controladorTurnos cc = new controlador.controladorTurnos();
            //DefaultListModel modelo = new DefaultListModel();
            DefaultListModel modelo = new DefaultListModel();
            consultas d = new consultas();
            ResultSet rs = null;
            rs=d.obtenerProveedores();  
            try {
                modelo.addElement("  CIF  ||  Nombre  ||  Direccion  ||  PersonaResponsable || Telefono || InfoFacturacion  ");
                while(rs.next())
                {
                 modelo.addElement(rs.getString("cif")+"  ||  "+rs.getString("nombre").trim()+" ||  "+rs.getString("direccion").trim()+"  ||  "+rs.getString("personaResponsabe")+"  ||  "+rs.getString("telefono")+"  ||  "+rs.getString("infoFacturacion"));
                 jListEmpleados.setModel(modelo);
                }
                 jListEmpleados.setSelectedIndex(0);
            } catch (SQLException ex) {
                Logger.getLogger(proveedoresinsertar.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(proveedoresinsertar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(proveedoresinsertar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        /*CREATE TABLE proveedor(
	cif char(10) PRIMARY KEY,
	nombre varchar(64) NOT NULL,
	direccion varchar(256),
	personaResponsabe varchar(256),
	telefono char(11), -- Contando el prefijo del pais.
	infoFacturacion varchar(512)
);*/
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
    
        if(jTextCIF.getText().equals("") || jTextNombre.getText().equals("") || jTextDireccion.getText().equals("") || jTextTelefono.getText().equals(""))
        {
          JOptionPane.showMessageDialog(null, "¡Por favor, rellene los campos obligatorios (los que tienen *)!", "¡Rellena los campos!", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            try {
                 consultas d = new consultas();
                 ResultSet rs = null;
                 String CIF = jTextCIF.getText();
                 Integer codaux = null;
                 rs=d.obtenerCIFProveedor(CIF);  
                 try {
                      while(rs.next())
                      {
                        codaux=1;                
                      }
                      if(codaux!=null) 
                      { 
                       JOptionPane.showMessageDialog(null, "¡Por favor, este proveedor ya existe en la base de datos, introduzca otro CIF!", "¡Ya existe proveedor!", JOptionPane.INFORMATION_MESSAGE);
                      }
                      else
                      {
                         DefaultListModel modelo = new DefaultListModel(); 
                         try{
                             d.insertarproveedor(jTextCIF.getText(),jTextNombre.getText(),jTextDireccion.getText(), jTextTelefono.getText());
                             JOptionPane.showMessageDialog(null, "¡Proveedor insertado correctamente! No hubo ningun tipo de problemas", "Proveedor insertado", JOptionPane.INFORMATION_MESSAGE);
                             this.dispose();
                             proveedoresinsertar j = new proveedoresinsertar();
                             j.setVisible(true);
                            } catch (FileNotFoundException ex) {
                            Logger.getLogger(proveedoresinsertar.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IOException ex) {
                            Logger.getLogger(proveedoresinsertar.class.getName()).log(Level.SEVERE, null, ex);  
                            }            
                      }
         
                 } catch (SQLException ex) {
                   Logger.getLogger(proveedoresinsertar.class.getName()).log(Level.SEVERE, null, ex);
                    }
           } catch (FileNotFoundException ex) {
             Logger.getLogger(proveedoresinsertar.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                Logger.getLogger(proveedoresinsertar.class.getName()).log(Level.SEVERE, null, ex);
                  }  
        }
 
    }//GEN-LAST:event_jButtonInsertarActionPerformed

    private void jButtonResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetearActionPerformed
        jTextCIF.setText("");
        jTextNombre.setText("");
        jTextDireccion.setText("");
        jTextTelefono.setText("");
    }//GEN-LAST:event_jButtonResetearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(proveedoresinsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proveedoresinsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proveedoresinsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proveedoresinsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new proveedoresinsertar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JButton jButtonResetear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jListEmpleados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCIF;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables
}


