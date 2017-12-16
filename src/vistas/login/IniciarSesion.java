/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.login;

import Main.ViewManager;
import Servicios.login.ServicioUsuario;
import Servicios.login.ServicioUsuarioImpl;

import javax.swing.JOptionPane;
import modelo.login.Login;

public class IniciarSesion extends javax.swing.JFrame {

    private final ServicioUsuario inicio;

    public IniciarSesion() {
        initComponents();
        inicio = new ServicioUsuarioImpl();

        this.setLocationRelativeTo(null); //CENTRAR CUANDO APARECE LA VENTANA
        this.setTitle("Iniciar Sesion");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnRegistar = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        lblContraseña = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        txtInicioDeSesion = new javax.swing.JLabel();
        iconPersona = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(204, 204, 204));
        lblUsuario.setText("USUARIO");
        jPanel2.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 20));

        btnSalir.setBackground(new java.awt.Color(0, 153, 204));
        btnSalir.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 90, 30));

        btnRegistar.setBackground(new java.awt.Color(0, 153, 204));
        btnRegistar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnRegistar.setText("REGISTRAR");
        btnRegistar.setBorder(null);
        btnRegistar.setBorderPainted(false);
        btnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 163, 100, 30));

        btnAdmin.setBackground(new java.awt.Color(204, 0, 0));
        btnAdmin.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(204, 204, 204));
        btnAdmin.setText("ADMIN");
        btnAdmin.setBorder(null);
        btnAdmin.setBorderPainted(false);
        btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 70, 30));

        btnInicio.setBackground(new java.awt.Color(0, 153, 204));
        btnInicio.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnInicio.setText("INICIO");
        btnInicio.setBorder(null);
        btnInicio.setBorderPainted(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel2.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 163, 90, 30));

        lblContraseña.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(204, 204, 204));
        lblContraseña.setText("CONTRASEÑA");
        jPanel2.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 240, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 240, 20));

        txtUsuario.setBackground(new java.awt.Color(0, 51, 102));
        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 240, 20));

        txtContraseña.setBackground(new java.awt.Color(0, 51, 102));
        txtContraseña.setForeground(new java.awt.Color(153, 153, 153));
        txtContraseña.setBorder(null);
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseClicked(evt);
            }
        });
        txtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusGained(evt);
            }
        });
        jPanel2.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 240, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 340, 250));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtInicioDeSesion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtInicioDeSesion.setForeground(new java.awt.Color(204, 255, 255));
        txtInicioDeSesion.setText("INICIO DE SESION");
        jPanel1.add(txtInicioDeSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 160, -1));

        iconPersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ic_person_128_28582.png"))); // NOI18N
        jPanel1.add(iconPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        if (txtUsuario.getText().equals("") || txtContraseña.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Campos Vacios");

        } else {

            if (inicio.Iniciar(txtUsuario.getText().toLowerCase().trim(), txtContraseña.getText().toLowerCase().trim())) {

                Bienvenido miBienvenido = new Bienvenido();
                miBienvenido.setVisible(true);
                dispose();
                //this.setVisible(false);
            } else {
                 if (txtUsuario.getText().equals("") || txtContraseña.getText().equals("")){
                     }else{
                             
                JOptionPane.showMessageDialog(this, "Usuario o Contraseña Incorrecta");
            }
        }
        }
    }//GEN-LAST:event_btnInicioActionPerformed


    private void btnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarActionPerformed
        Registro miRegistro = new Registro();
        miRegistro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistarActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        dispose();

    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        IniciarSesionAdmin miIniciarSesionAdmin = new IniciarSesionAdmin();
        miIniciarSesionAdmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        // TODO add your handling code here:
        txtUsuario.setText(""); //SIRVE PARA PODER ESCRIBIR SINO NO TE DEJA LA BARRA
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseClicked
        // TODO add your handling code here:
        txtContraseña.setText(""); //SIRVE PARA PODER ESCRIBIR SINO NO TE DEJA LA BARRA
    }//GEN-LAST:event_txtContraseñaMouseClicked

    private void txtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusGained
        // TODO add your handling code here:
        txtContraseña.setText("");
    }//GEN-LAST:event_txtContraseñaFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel iconPersona;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUsuario;
    public static javax.swing.JPasswordField txtContraseña;
    private javax.swing.JLabel txtInicioDeSesion;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
