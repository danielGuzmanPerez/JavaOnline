
package tienda_online;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Registro extends javax.swing.JFrame {
    Usuario usuario,usuarioRecibido,usuarioEditar;
    FileUsuario FileUsuario;
    public Registro() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        usuario= new Usuario();
        usuarioRecibido=null;
        usuarioEditar= new Usuario();
        FileUsuario = new FileUsuario();
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        FileUsuario.obtenerDatos();
    }
private static boolean isNumeric(String cadena){
        try {
                Long.parseLong(cadena);
                return true;
        } catch (NumberFormatException nfe){
                return false;
        }
    }
    private static boolean validarNombre(String nombre){
        return nombre.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
    }
    private static boolean validarCorreo(String correo){
        return correo.matches("[a-z0-9](\\.?[a-z0-9]){5,}@[a-z]+\\.[a-z]{2,3}(\\.([a-z]{2}))?");//"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Amazon");
        setPreferredSize(new java.awt.Dimension(925, 760));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(43, 93, 47, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido Paterno:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(43, 146, 96, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido Materno:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(43, 218, 99, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(43, 268, 41, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(43, 398, 52, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo de Usuario:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(43, 427, 90, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Usuario:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(43, 489, 46, 14);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(43, 532, 57, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Confirmacion de Password:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(43, 591, 151, 14);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(238, 88, 247, 22);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(238, 154, 247, 22);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(238, 213, 247, 22);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(238, 263, 247, 22);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(238, 303, 247, 22);

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField7FocusLost(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(238, 393, 247, 22);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(238, 527, 247, 22);

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
        });
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(238, 583, 247, 22);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("REGISTRO");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(250, 19, 175, 35);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Vendedor", "Administrador" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(238, 422, 247, 22);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        jButton1.setText("Registrarse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(264, 632, 180, 59);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Direccion:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(43, 303, 55, 14);

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(238, 343, 247, 22);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Pais");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(43, 353, 23, 14);

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(238, 481, 247, 22);

        jButton2.setBackground(java.awt.Color.orange);
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(526, 88, 113, 33);

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9);
        jTextField9.setBounds(661, 92, 187, 22);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editarr.png"))); // NOI18N
        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(526, 146, 113, 41);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarr.png"))); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(526, 205, 113, 41);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paquete.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(700, 310, 130, 100);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sesionlogo.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(700, 380, 120, 70);

        jButton5.setBackground(java.awt.Color.orange);
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jButton5.setText("Rgresar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(720, 590, 130, 50);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_sesion.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 940, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // REGISTRARSE
        jComboBox1.setEnabled(true);
        if(jTextField1.getText().equals("")||jTextField2.getText().equals("")||jTextField3.getText().equals("")||jTextField4.getText().equals("")||jTextField5.getText().equals("")||jTextField6.getText().equals("")||jTextField7.getText().equals("")||jTextField8.getText().equals("")||jPasswordField1.getText().equals("")||jPasswordField2.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Todos los campos deben estar llenos");
        }else{
            if(validarNombre(jTextField1.getText())){
                if(validarNombre(jTextField2.getText())){
                    if(validarNombre(jTextField3.getText())){
                        if(validarCorreo(jTextField4.getText())){
                            if(validarNombre(jTextField6.getText())){
                                if(true){/*FileUsuario.comprobarUsser(jTextField8.getText())*/
                                    if(jPasswordField2.getText().equals(jPasswordField1.getText())){
                                        try {
                                            usuario.setNombre(jTextField1.getText());
                                            usuario.setAP(jTextField2.getText());
                                            usuario.setAM(jTextField3.getText());
                                            usuario.setCorreo(jTextField4.getText());
                                            usuario.setDireccion(jTextField5.getText());
                                            usuario.setPais(jTextField6.getText());
                                            usuario.setTelefono(jTextField7.getText());
                                            usuario.setTipoUser(jComboBox1.getSelectedItem().toString());
                                            usuario.setUser(jTextField8.getText());
                                            usuario.setPass(jPasswordField1.getText());
                                            FileUsuario.write(usuario);
                                            JOptionPane.showMessageDialog(this,"Se guardó correctamente ");
                                        } catch (ClassNotFoundException ex) {
                                            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }else JOptionPane.showMessageDialog(this,"la contraseña no coincide ");
                                }else JOptionPane.showMessageDialog(this,"usuario invalido");
                            }else JOptionPane.showMessageDialog(this,"Error en campo País");
                        }else JOptionPane.showMessageDialog(this,"Error en campo Correo");
                 }else JOptionPane.showMessageDialog(this,"Error en campo Apellido Materno");   
                }else JOptionPane.showMessageDialog(this,"Error en campo Apellido paterno");
            }else JOptionPane.showMessageDialog(this,"Error en campo nombre");
            
            
            
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Boton buscar
        String nombre="";
        if(jTextField9.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Ingresa un nombre para buscarlo");
        }else{
           
            try {
                nombre=jTextField9.getText();                
               usuarioRecibido= FileUsuario.read(nombre);
               if(usuarioRecibido.getUser().equals("no")){
                   jTextField9.setText("No se encontró");
                   jButton3.setEnabled(false);
                    jButton4.setEnabled(false);
               }else{
                   jTextField1.setText(usuarioRecibido.getNombre());
                   jTextField2.setText(usuarioRecibido.getAP());
                   jTextField3.setText(usuarioRecibido.getAM());
                   jTextField4.setText(usuarioRecibido.getCorreo());
                   jTextField5.setText(usuarioRecibido.getDireccion());
                   jTextField6.setText(usuarioRecibido.getPais());
                   jTextField7.setText(usuarioRecibido.getTelefono());
                   jComboBox1.setSelectedItem(usuarioRecibido.getTipoUser());
                   jTextField8.setText(usuarioRecibido.getUser());
                   jPasswordField1.setText(usuarioRecibido.getPass());
                   
                   jButton3.setEnabled(true);
                    jButton4.setEnabled(true);
                    jComboBox1.setEnabled(false);
               }
                
                
            } catch (IOException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
        // COMPROBAR CONTRASEÑA
        if(!(jPasswordField2.getText().equals(jPasswordField1.getText()))){
            JOptionPane.showMessageDialog(this,"La contraseña no coincide");
            jPasswordField2.setText("");
        }
    }//GEN-LAST:event_jPasswordField2FocusLost

    private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
         // validar telefono
         if(isNumeric(jTextField7.getText())==true){
                float a = Float.parseFloat(jTextField7.getText());
                long b;
                b=9999999999l;
            if(a<0||a>b){
                JOptionPane.showMessageDialog(this,"Solo 10 Digitos");
                jTextField7.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(this,"Telefono solo acepta numeros");
            jTextField7.setText("");
        }
    }//GEN-LAST:event_jTextField7FocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Editar
        if(jTextField1.getText().equals("")||jTextField2.getText().equals("")||jTextField3.getText().equals("")||jTextField4.getText().equals("")||jTextField5.getText().equals("")||jTextField6.getText().equals("")||jTextField7.getText().equals("")||jTextField8.getText().equals("")||jPasswordField1.getText().equals("")||jPasswordField2.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Todos los campos deben estar llenos");
        }else{
            if(validarNombre(jTextField1.getText())){
                if(validarNombre(jTextField2.getText())){
                    if(validarNombre(jTextField3.getText())){
                        if(validarCorreo(jTextField4.getText())){
                            if(validarNombre(jTextField6.getText())){
                                if(jPasswordField2.getText().equals(jPasswordField1.getText())){
                                    usuarioEditar.setNombre(jTextField1.getText());
                                    usuarioEditar.setAP(jTextField2.getText());
                                    usuarioEditar.setAM(jTextField3.getText());
                                    usuarioEditar.setCorreo(jTextField4.getText());
                                    usuarioEditar.setDireccion(jTextField5.getText());
                                    usuarioEditar.setPais(jTextField6.getText());
                                    usuarioEditar.setTelefono(jTextField7.getText());
                                    usuarioEditar.setTipoUser(jComboBox1.getSelectedItem().toString());
                                    usuarioEditar.setUser(jTextField8.getText());
                                    usuarioEditar.setPass(jPasswordField1.getText());
                                    FileUsuario.editar(usuarioRecibido, usuarioEditar);
                                    JOptionPane.showMessageDialog(this,"Se editó correctamente ");
                                }else JOptionPane.showMessageDialog(this,"la contraseña no coincide ");
                            }JOptionPane.showMessageDialog(this,"Error en campo País");
                        }else JOptionPane.showMessageDialog(this,"Error en campo Correo");
                 }else JOptionPane.showMessageDialog(this,"Error en campo Apellido Materno");   
                }else JOptionPane.showMessageDialog(this,"Error en campo Apellido paterno");
            }else JOptionPane.showMessageDialog(this,"Error en campo nombre");
            
            
            
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Borrar
         if(jPasswordField2.getText().equals(jPasswordField1.getText())){
             FileUsuario.Borrar(usuarioRecibido.getUser());
             JOptionPane.showMessageDialog(this,"Se eliminó correctamente");
         }else JOptionPane.showMessageDialog(this,"La contraseña no coincide");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // REGRESAR
        try {
            // Boton regresar
            this.setVisible(false);
            Sesion sesion = new Sesion();
            sesion.setVisible(true);
            sesion.setLocationRelativeTo(null);
            sesion.show();
        } catch (IOException ex) {
            Logger.getLogger(carritoComprador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(carritoComprador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Throwable ex) {
            Logger.getLogger(carritoComprador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Registro().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
