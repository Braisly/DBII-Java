/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entornografico;

import clases.consultas;
import javax.swing.*;
//import javax.swing.DefaultListModel;

import java.sql.*;
import java.io.*;
//import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class empleadosinsertar extends javax.swing.JFrame {

    /**
     * Creates new form empleados
     */
    public empleadosinsertar() {
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
        jTNombre = new javax.swing.JTextField();
        jTApellidos = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();
        jTDNI = new javax.swing.JTextField();
        jLabelDNI = new javax.swing.JLabel();
        jLabelSueldo = new javax.swing.JLabel();
        jTSueldo = new javax.swing.JTextField();
        jBInsertar = new javax.swing.JButton();
        jBResetear = new javax.swing.JButton();
        jLabelTelefono = new javax.swing.JLabel();
        jTTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBInsertar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane1.setViewportView(jListEmpleados);

        jTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreActionPerformed(evt);
            }
        });

        jTApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTApellidosActionPerformed(evt);
            }
        });

        jLabelNombre.setText("*Nombre:");

        jLabelApellidos.setText("*Apellidos:");

        jTDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDNIActionPerformed(evt);
            }
        });

        jLabelDNI.setText("*DNI:");

        jLabelSueldo.setText("*Sueldo:");

        jBInsertar.setText("Insertar");
        jBInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBInsertarMouseClicked(evt);
            }
        });

        jBResetear.setText("Resetear");
        jBResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResetearActionPerformed(evt);
            }
        });

        jLabelTelefono.setText("*Telefono:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Empleados");

        jBInsertar1.setText("Atrás");
        jBInsertar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBInsertar1MouseClicked(evt);
            }
        });
        jBInsertar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInsertar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelApellidos, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabelTelefono))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jTNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jTTelefono))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelSueldo)
                    .addComponent(jLabelDNI))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTDNI)
                    .addComponent(jTSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBInsertar)
                        .addGap(35, 35, 35)
                        .addComponent(jBResetear)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jBInsertar1)
                        .addGap(128, 128, 128))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jBInsertar1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDNI))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellidos)
                    .addComponent(jLabelSueldo)
                    .addComponent(jTSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono)
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInsertar)
                    .addComponent(jBResetear))
                .addGap(31, 31, 31))
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
            rs=d.obtenerEmpleados();  
            try {
                modelo.addElement("  DNI  ||  Nombre  ||  APELLIDOS  ||  TELEFONO || SUELDO");
                while(rs.next())
                {
                 modelo.addElement(rs.getString("DNI")+"  ||  "+rs.getString("nombre").trim()+" ||  "+rs.getString("apellidos").trim()+"  ||  "+rs.getString("telefono")+"  ||  "+rs.getFloat("sueldo"));
                 jListEmpleados.setModel(modelo);  
                }
                jListEmpleados.setSelectedIndex(0);

            } catch (SQLException ex) {
                Logger.getLogger(empleadosinsertar.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(empleadosinsertar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(empleadosinsertar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void jTApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTApellidosActionPerformed

    private void jTDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDNIActionPerformed

    private void jTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreActionPerformed

    private void jBResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResetearActionPerformed
        // TODO add your handling code here:
        
        jTNombre.setText("");
        jTApellidos.setText("");
        jTDNI.setText("");
        jTSueldo.setText("");
        jTTelefono.setText("");
      
 /* jTextField1.setText("");
  jTextField2.setText("");
  jTextField3.setText("");*/
    }//GEN-LAST:event_jBResetearActionPerformed

    private void jBInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBInsertarMouseClicked

        
 if(jTNombre.getText().equals("") ||  jTApellidos.getText().equals("") || jTDNI.getText().equals("") || jTNombre.getText().equals("") || jTTelefono.getText().equals("") || jTSueldo.getText().equals(""))
 {
  JOptionPane.showMessageDialog(null, "¡Por favor, rellene los campos obligatorios (los que tienen *)!", "¡Rellena los campos!", JOptionPane.INFORMATION_MESSAGE);
 }
 else
 {
        
        // TODO add your handling code here:
     consultas d = new consultas();    
        try {
            d.insertarempleado(jTDNI.getText(),jTNombre.getText(),jTApellidos.getText(),Integer.parseInt(jTTelefono.getText()),Float.parseFloat(jTSueldo.getText()));
            JOptionPane.showMessageDialog(null, "¡Empleado insertado correctamente! No hubo ningun tipo de problemas", "Empleado insertado", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            empleadosinsertar j = new empleadosinsertar();
            j.setVisible(true);
          /*  jTNombre.setText("");
            jTApellidos.setText("");
            jTDNI.setText("");
            jTSueldo.setText("");
            jTTelefono.setText("");*/
            //SwingUtilities.updateComponentTreeUI(this);
            //this.validateTree(); 
            //this.invalidate();
            //this.repaint(); // Para la grafica
            //this.validate(); // Para los JComponents
        } catch (FileNotFoundException ex) {
            Logger.getLogger(empleadosinsertar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(empleadosinsertar.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    }//GEN-LAST:event_jBInsertarMouseClicked

    private void jBInsertar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBInsertar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBInsertar1MouseClicked

    private void jBInsertar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertar1ActionPerformed
        // TODO add your handling code here:
    this.dispose();
    }//GEN-LAST:event_jBInsertar1ActionPerformed

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
            java.util.logging.Logger.getLogger(empleadosinsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empleadosinsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empleadosinsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empleadosinsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new empleadosinsertar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBInsertar;
    private javax.swing.JButton jBInsertar1;
    private javax.swing.JButton jBResetear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSueldo;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JList jListEmpleados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTApellidos;
    private javax.swing.JTextField jTDNI;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTSueldo;
    private javax.swing.JTextField jTTelefono;
    // End of variables declaration//GEN-END:variables
}

