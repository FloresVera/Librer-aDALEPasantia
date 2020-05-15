/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author MI PC
 */
public class InformacionCliente extends javax.swing.JFrame {
    
    int IDcliente_update = 0;
    String user = ""; 

    /**
     * Creates new form InformacionCliente
     */
    public InformacionCliente() {
        initComponents();
        user = Login.user;
        IDcliente_update = GestionarClientes.IDcliente_update;
        
        setSize(550, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Informacion del cliente " + IDcliente_update + " - Sesión de " + user);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from clientes where cli_id = '" + IDcliente_update + "'");
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                setTitle("Informacion del cliente " + rs.getString("cli_nombre") + " - Sesión de " + user);
                jLabel_nom.setText("Informacion del cliente " + rs.getString("cli_nombre"));
                
                txt_nombre.setText(rs.getString("cli_nombre"));
                txt_ruc.setText(rs.getString("cli_ruc"));
                txt_dv.setText(rs.getString("cli_dv"));
                txt_dire.setText(rs.getString("cli_dire"));
                txt_telefono.setText(rs.getString("cli_telefono"));
                txt_registradoPor.setText(rs.getString("cli_ultima"));
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar usuario." + e);
            JOptionPane.showMessageDialog(null, "¡¡ERROR al cargar!!, contacte al administrador.");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_nom = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_ruc = new javax.swing.JTextField();
        txt_dv = new javax.swing.JTextField();
        txt_registradoPor = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_dire = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton_actualizar = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_nom.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_nom.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nom.setText("Información del cliente");
        getContentPane().add(jLabel_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Direccion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RUC:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registrado por:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(153, 153, 255));
        txt_nombre.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        txt_ruc.setBackground(new java.awt.Color(153, 153, 255));
        txt_ruc.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_ruc.setForeground(new java.awt.Color(255, 255, 255));
        txt_ruc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_ruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 160, -1));

        txt_dv.setBackground(new java.awt.Color(153, 153, 255));
        txt_dv.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_dv.setForeground(new java.awt.Color(255, 255, 255));
        txt_dv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_dv, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 30, -1));

        txt_registradoPor.setEditable(false);
        txt_registradoPor.setBackground(new java.awt.Color(153, 153, 255));
        txt_registradoPor.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_registradoPor.setForeground(new java.awt.Color(255, 255, 255));
        txt_registradoPor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_registradoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 210, -1));

        txt_telefono.setBackground(new java.awt.Color(153, 153, 255));
        txt_telefono.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));

        txt_dire.setBackground(new java.awt.Color(153, 153, 255));
        txt_dire.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_dire.setForeground(new java.awt.Color(255, 255, 255));
        txt_dire.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_dire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direActionPerformed(evt);
            }
        });
        getContentPane().add(txt_dire, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("-");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 65, -1, -1));

        jButton_actualizar.setBackground(new java.awt.Color(153, 153, 255));
        jButton_actualizar.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jButton_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_actualizar.setText("Actualizar cliente");
        jButton_actualizar.setBorder(null);
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 210, 35));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_direActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direActionPerformed

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed

        int validacion = 0;
        String nombre, ruc, dv, telefono, direccion;
        
        nombre = txt_nombre.getText().trim();
        ruc = txt_ruc.getText().trim();
        dv = txt_dv.getText().trim();
        telefono = txt_telefono.getText().trim();
        direccion = txt_dire.getText().trim();
        
        if (nombre.equals("")) {
            txt_nombre.setBackground(Color.red);
            validacion++;
        }
        if (ruc.equals("")) {
            txt_ruc.setBackground(Color.red);
            validacion++;
        }
        if (dv.equals("")) {
            txt_dv.setBackground(Color.red);
            validacion++;
        }
        
        if (validacion == 0) {
            
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "update clientes set cli_nombre=?, cli_ruc=?, cli_dv=?, cli_telefono=?, cli_dire=?, cli_ultima=?"
                                + "where cli_id = '" + IDcliente_update + "'");
                pst.setString(1, nombre);
                pst.setString(2, ruc);
                pst.setString(3, dv);
                pst.setString(4, telefono);
                pst.setString(5, direccion);
                pst.setString(6, user);
                
                pst.executeUpdate();
                cn.close();
                
                Limpiar();
                
                txt_nombre.setBackground(Color.green);
                txt_ruc.setBackground(Color.green);
                txt_dv.setBackground(Color.green);
                txt_telefono.setBackground(Color.green);
                txt_dire.setBackground(Color.green);
                txt_registradoPor.setBackground(Color.green);
                
                JOptionPane.showMessageDialog(null, "Actualizacion correcta.");
                this.dispose();
                
            } catch (SQLException e) {
                System.err.println("Error en actualizar cliente." + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al actualizar cliente!!, contacte al administrador");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
        }
        
    }//GEN-LAST:event_jButton_actualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_nom;
    private javax.swing.JTextField txt_dire;
    private javax.swing.JTextField txt_dv;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_registradoPor;
    private javax.swing.JTextField txt_ruc;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {
        txt_nombre.setText("");
        txt_ruc.setText("");
        txt_telefono.setText("");
        txt_dv.setText("");
        txt_dire.setText("");
    }
    
}
