/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda_online;

import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author vdgp_
 */
public class panel1 extends javax.swing.JPanel {

    Producto producto=null;
    int cantidad=1;
    String nombreUser = null;
    FileProducto fileProducto=null;
    FileUsuario fileUsuario=null;
    public panel1(Producto producto_,String nombreUser_) throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        producto=producto_;
        nombreUser=nombreUser_;
        this.setVisible(true);
        fileProducto=new FileProducto();
        fileProducto.obtenerDatos();
        fileUsuario=new FileUsuario();
        fileUsuario.obtenerDatos();
        ImageIcon imagen=new ImageIcon(getClass().getResource("/Imagenes/"+producto.getID()+".jpg"));
        //imagen.getImage()//.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_DEFAULT);
        Image img=imagen.getImage().getScaledInstance(172, 174, 10);
        jLabel1.setIcon(new ImageIcon(img));
        
        jLabel8.setText(producto.getNombre());
        jLabel9.setText(producto.getNombreVendedor());
        jLabel10.setText(producto.getPais());
        jLabel11.setText(producto.getPrecio());
        jLabel12.setText(producto.getCostoEnvio());
        jLabel13.setText(producto.getDescripcion());
        jLabel14.setText("1");
        jLabel16.setText(producto.getCantidad());
        if(producto.getCantidad().equals("0")){
            jButton1.setText("Agotado");
            jButton1.setEnabled(false);
        }
       
    }
   public void agregar(Producto producto_){
       producto=producto_;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(601, 204));
        setLayout(null);
        add(jLabel1);
        jLabel1.setBounds(12, 13, 172, 177);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Nombre:");
        add(jLabel2);
        jLabel2.setBounds(202, 13, 67, 16);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Descripcion:");
        add(jLabel3);
        jLabel3.setBounds(202, 119, 79, 16);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Vendedor: ");
        add(jLabel4);
        jLabel4.setBounds(202, 36, 72, 16);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("País: ");
        add(jLabel5);
        jLabel5.setBounds(202, 59, 53, 16);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Precio: ");
        add(jLabel6);
        jLabel6.setBounds(202, 82, 49, 16);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Costo envío:");
        add(jLabel7);
        jLabel7.setBounds(202, 98, 81, 16);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel8);
        jLabel8.setBounds(287, 13, 170, 16);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel9);
        jLabel9.setBounds(292, 36, 170, 16);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel10);
        jLabel10.setBounds(290, 60, 170, 16);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel11);
        jLabel11.setBounds(281, 82, 190, 16);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel12);
        jLabel12.setBounds(290, 100, 170, 16);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel13);
        jLabel13.setBounds(290, 120, 170, 16);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(480, 40, 110, 45);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(450, 155, 50, 30);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setText("+");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(543, 155, 50, 30);
        add(jLabel14);
        jLabel14.setBounds(510, 160, 28, 25);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setText("Disponibles");
        add(jLabel15);
        jLabel15.setBounds(202, 142, 72, 16);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel16);
        jLabel16.setBounds(288, 142, 180, 16);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_sesion.png"))); // NOI18N
        jLabel17.setText("jLabel17");
        add(jLabel17);
        jLabel17.setBounds(0, 190, 720, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Boton -
        if(Integer.parseInt(jLabel14.getText())>1){
            cantidad=Integer.parseInt(jLabel14.getText())-1;
            jLabel14.setText(Integer.toString(cantidad));
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Boton +
        if(Integer.parseInt(jLabel14.getText())<Integer.parseInt(producto.getCantidad())){
            cantidad++;//Integer.parseInt(jLabel14.getText()+1);
            jLabel14.setText(Integer.toString(cantidad));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOton añadir carrito
        fileProducto.restarCantidad(producto.getID(), Integer.parseInt(jLabel14.getText()));
        producto.setCantidad(Integer.toString(cantidad));
        fileUsuario.agregarCarrito(nombreUser, producto);
        jLabel14.setText("1");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}