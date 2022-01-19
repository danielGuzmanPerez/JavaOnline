/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda_online;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Sesion extends javax.swing.JFrame {
    Usuario usuario=null;
    FileUsuario fileUs=null;
    public Sesion() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        usuario= new Usuario();
        fileUs = new FileUsuario();
        fileUs.obtenerDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Amazon");
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(34, 57, 46, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(34, 125, 57, 14);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(109, 52, 249, 22);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciar_sesion.png"))); // NOI18N
        jButton1.setText("Iniciar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 210, 160, 41);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo_usuario.png"))); // NOI18N
        jButton2.setText("Registrarse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 210, 150, 41);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(109, 120, 249, 22);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sesionlogo.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 270, 120, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_sesion.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 520, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // INICIAR SESION
        usuario.setUser(jTextField1.getText());
        usuario.setPass(jPasswordField1.getText());
        Usuario us=fileUs.iniciarSesion(usuario);
        if(us.getUser().equals("no")){
            JOptionPane.showMessageDialog(this,"Usuario invalido");
            jPasswordField1.setText("");
        }else{
            if(us.getTipoUser().equals("Cliente")){
                Ventana_Comprador ventanaComprador = null;
                try {
                    try {
                        ventanaComprador = new Ventana_Comprador(us.getUser());
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
                }
                                    ventanaComprador.setVisible(true);
                                    ventanaComprador.setLocationRelativeTo(null);
                                    ventanaComprador.show();
            }
            if(us.getTipoUser().equals("Vendedor")){
                try {
                    Ventana_Vendedor ventanaVendedor= new Ventana_Vendedor(us.getUser(),us.getPais());
                    ventanaVendedor.setVisible(true);
                    ventanaVendedor.setLocationRelativeTo(null);
                    ventanaVendedor.show();
                } catch (IOException ex) {
                    Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(us.getTipoUser().equals("Administrador")){
                try {
                    Ventana_Comprador ventanaCompra= new Ventana_Comprador(us.getUser());
                    ventanaCompra.setVisible(true);
                    ventanaCompra.setLocationRelativeTo(null);
                    ventanaCompra.show();
                    
                    
                    Ventana_Vendedor ventanaVende= new Ventana_Vendedor(us.getUser(),us.getPais());
                    ventanaVende.setVisible(true);
                    ventanaVende.setLocationRelativeTo(null);
                    ventanaVende.show();
                    
                } catch (IOException ex) {
                    Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
                }

        }
            this.setVisible(false);
        } 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // REGISTRARSE
            Registro Registro=new Registro();
            Registro.setLocationRelativeTo(null);
            Registro.setVisible(true);
            Registro.show();
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Sesion().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Sesion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
