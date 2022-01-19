
package tienda_online;

import java.awt.Image;
import java.awt.image.*;
import java.io.*;
import java.util.logging.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Ventana_Vendedor extends javax.swing.JFrame {

    Image logo;
    Producto Producto,ProductoRecibido,ProductoEditar;
    FileProducto FileProducto;
    String nombre=null;
    String pais=null;
    File file=null;
    public Ventana_Vendedor(String nombre_,String pais_) throws IOException, FileNotFoundException, ClassNotFoundException  {
        initComponents();
        nombre=nombre_;
        pais=pais_;
        jLabel11.setText(nombre);
        Producto= new Producto();
        ProductoRecibido=null;
        ProductoEditar= new Producto();
        FileProducto = new FileProducto();
        FileProducto.obtenerDatos();
        
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
        jTextField4.setEnabled(false);
        jTextField5.setEnabled(false);
        jTextField6.setEnabled(false);
        jTextField7.setEnabled(false);
        jTextField8.setEnabled(false);
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);

        
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

    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Amazon");
        setPreferredSize(new java.awt.Dimension(900, 700));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("ID:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(23, 173, 20, 16);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(23, 220, 60, 16);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Descripcion:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(23, 269, 90, 16);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(23, 315, 60, 16);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Costo Envio:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(23, 360, 90, 16);

        jButton2.setBackground(java.awt.Color.white);
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(662, 182, 130, 41);

        jButton3.setBackground(java.awt.Color.white);
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarr.png"))); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(662, 248, 130, 41);

        jButton4.setBackground(java.awt.Color.white);
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(662, 309, 130, 41);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Cantidad:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(23, 400, 62, 16);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Imagen del Producto:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(23, 468, 139, 16);

        jButton5.setBackground(java.awt.Color.white);
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarimagen.png"))); // NOI18N
        jButton5.setText("Seleccionar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(400, 470, 140, 33);

        jButton6.setBackground(java.awt.Color.orange);
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar_sesion.png"))); // NOI18N
        jButton6.setText("Cerrar Sesion");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(730, 0, 170, 40);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 170, 210, 22);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 220, 210, 22);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(170, 270, 210, 22);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(170, 320, 210, 22);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(170, 360, 210, 22);

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(170, 400, 210, 22);

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7);
        jTextField7.setBounds(170, 470, 210, 22);

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jTextField8);
        jTextField8.setBounds(445, 86, 204, 22);

        jButton1.setBackground(java.awt.Color.orange);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(670, 80, 130, 33);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(220, 50, 170, 20);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(290, 0, 32, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.setPreferredSize(new java.awt.Dimension(1300, 120));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 0, 990, 120);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondodown.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(-60, 540, 970, 90);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(-190, -50, 260, 220);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoblanco.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 120, 870, 420);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-18, 0, 920, 630);

        jMenu1.setText("Producto");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        jMenuItem1.setText("Nuevo Producto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jMenuItem2.setText("Cancelar  Producto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // AGREGAR PRODUCTO
        
        jTextField1.setText("");
        int id=FileProducto.ultimoId();
        jTextField1.setText(Integer.toString(id+1));
        jTextField2.setEnabled(true);
        jTextField2.setText("");
        jTextField3.setEnabled(true);
        jTextField3.setText("");
        jTextField4.setEnabled(true);
        jTextField4.setText("");
        jTextField5.setEnabled(true);
        jTextField5.setText("");
        jTextField6.setEnabled(true);
        jTextField6.setText("");
        jTextField7.setEnabled(true);
        jTextField7.setText("");
        jTextField8.setEnabled(true);
        jTextField8.setText("");
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // AGREGAR IMAGEN
        String ID;
        JFileChooser archivo = new JFileChooser();
        BufferedImage fileA = null;
        int ventana = archivo.showOpenDialog(null);
       try {
        if (ventana == JFileChooser.APPROVE_OPTION){
            
             file = archivo.getSelectedFile();

            ID = jTextField1.getText();
            this.jTextField7.setText(String.valueOf(file));
            File imagefile = new File(jTextField7.getText());
            fileA = ImageIO.read(imagefile);
            ImageIO.write(fileA, "jpg",new File("C:\\Users\\vdgp_\\OneDrive\\Escritorio\\3\\Proyecto #3\\Tienda_Online\\src\\Imagenes\\"+ID+".jpg"));
            
            logo = getToolkit().getImage(this.jTextField7.getText());
            
            
            logo=logo.getScaledInstance(250,Math.round(250*(250/logo.getWidth(null))), Image.SCALE_DEFAULT);
            //logo=logo.getScaledInstance(100,100, Image.SCALE_DEFAULT);
        }
        } catch (IOException e) {
              e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // GUARDAR
        if(jTextField1.getText().equals("")||jTextField2.getText().equals("")||jTextField3.getText().equals("")||jTextField4.getText().equals("")||jTextField5.getText().equals("")||jTextField6.getText().equals("")||jTextField7.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Todos los campos deben estar llenos");
        }else{
            if(validarNombre(jTextField2.getText())){
                //if(validarNombre(jTextField3.getText())){
                        try {
                            Producto.setID(Integer.toString(Integer.parseInt(jTextField1.getText())));
                            Producto.setNombre(jTextField2.getText());
                            Producto.setDescripcion(jTextField3.getText());
                            Producto.setPrecio(jTextField4.getText());
                            Producto.setCostoEnvio(jTextField5.getText());
                            Producto.setCantidad(jTextField6.getText());
                            Producto.setFile(String.valueOf(file));
                            Producto.setNombreVendedor(nombre);
                            Producto.setPais(pais);
                            FileProducto.write(Producto);
                            //FileProducto.escribirPrimerProducto(Producto);
                            JOptionPane.showMessageDialog(this,"Se guardó correctamente ");
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(Ventana_Vendedor.class.getName()).log(Level.SEVERE, null, ex);
                        }
               // }else JOptionPane.showMessageDialog(this,"Error en campo Descripcion");
            }else JOptionPane.showMessageDialog(this,"Error en campo Nombre");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // CANCELAR PRODUCTO
        jTextField1.setEnabled(false);
        jTextField1.setText("");
        jTextField2.setEnabled(false);
        jTextField2.setText("");
        jTextField3.setEnabled(false);
        jTextField3.setText("");
        jTextField4.setEnabled(false);
        jTextField4.setText("");
        jTextField5.setEnabled(false);
        jTextField5.setText("");
        jTextField6.setEnabled(false);
        jTextField6.setText("");
        jTextField7.setEnabled(false);
        jTextField7.setText("");
        jTextField8.setEnabled(false);
        jTextField8.setText("");
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // ELIMINAR PRODUCTO
        if(!jTextField8.getText().equals("")){
             FileProducto.BorrarProducto(ProductoRecibido.getID());
             JOptionPane.showMessageDialog(this,"Se eliminó correctamente");
         }else JOptionPane.showMessageDialog(this,"Busca un Producto Primero");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // EDITAR PRODUCTO
        if(jTextField8.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Busca un usuario Primero");
        }else{
        if(jTextField1.getText().equals("")||jTextField2.getText().equals("")||jTextField3.getText().equals("")||jTextField4.getText().equals("")||jTextField5.getText().equals("")||jTextField6.getText().equals("")||jTextField7.getText().equals("")){
            JOptionPane.showMessageDialog(this,"todos los Campos deben estar llenos");
        }else{
            if(validarNombre(jTextField2.getText())){
                if(validarNombre(jTextField3.getText())){
                    ProductoEditar.setID(ProductoRecibido.getID());
                    ProductoEditar.setNombre(jTextField2.getText());
                    ProductoEditar.setDescripcion(jTextField3.getText());
                    ProductoEditar.setPrecio(jTextField4.getText());
                    ProductoEditar.setCostoEnvio(jTextField5.getText());
                    ProductoEditar.setCantidad(jTextField6.getText());
                    ProductoEditar.setFile(jTextField7.getText());;
                    ProductoEditar.setNombreVendedor(nombre);
                    ProductoEditar.setPais(pais);
                    FileProducto.editarProducto(ProductoRecibido, ProductoEditar);
                    JOptionPane.showMessageDialog(this,"Se editó correctamente ");  
                }else JOptionPane.showMessageDialog(this,"Error en Campo Descripcion");
            }else JOptionPane.showMessageDialog(this,"Error en campo nombre");
        }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BUSCAR PRODUCTO
        String NombreProducto="";
        if(jTextField8.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Ingresa un nombre para buscarlo");
        }else{
            try {
                NombreProducto=jTextField8.getText();                
                ProductoRecibido= FileProducto.read(NombreProducto,nombre);
                if(ProductoRecibido.getNombre().equals("no")){
                   jTextField8.setText("No se encontró");
                   jButton3.setEnabled(false);
                   jButton4.setEnabled(false);
               }else{
                   jTextField1.setText(ProductoRecibido.getID());
                   jTextField2.setText(ProductoRecibido.getNombre());
                   jTextField3.setText(ProductoRecibido.getDescripcion());
                   jTextField4.setText(ProductoRecibido.getPrecio());
                   jTextField5.setText(ProductoRecibido.getCostoEnvio());
                   jTextField6.setText(ProductoRecibido.getCantidad());
                   jTextField7.setText(ProductoRecibido.getFile());
                   
                   jButton3.setEnabled(true);
                   jButton4.setEnabled(true);
               }  
            } catch (IOException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        // VALIDAR PRECIO
        if(isNumeric(jTextField4.getText())==true){
                float a = Float.parseFloat(jTextField4.getText());
                long b;
                b=9999999999l;
            if(a<0||a>b){
                jTextField4.setText("Invalido");
            }
        }else{
            jTextField4.setText("Invalido");
        }
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        // VALIDAR COSTO DE ENVIO
        if(isNumeric(jTextField5.getText())==true){
                float a = Float.parseFloat(jTextField5.getText());
                long b;
                b=9999999999l;
            if(a<0||a>b){
                jTextField5.setText("Invalido");
            }
        }else{
            jTextField5.setText("Invalido");
        }
    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        // VALIDAR CANTIDAD
        if(isNumeric(jTextField6.getText())==true){
                float a = Float.parseFloat(jTextField6.getText());
                long b;
                b=9999999999l;
            if(a<0||a>b){
                jTextField6.setText("Invalido");
            }
        }else{
            jTextField6.setText("Invalido");
        }
    }//GEN-LAST:event_jTextField6FocusLost

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
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
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Ventana_Vendedor(null,null).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Ventana_Vendedor.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Ventana_Vendedor.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
