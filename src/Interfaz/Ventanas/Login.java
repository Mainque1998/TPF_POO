/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz.Ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Mainque
 */
public class Login extends javax.swing.JFrame {
    private static int dniUsuario = 0;
    
    // Constructor
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Interfaz/Imagenes/icono v1.png"));
        return retValue;
    }
    
    public static int getDniUsuario() {
        return dniUsuario;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonCrearUsuario = new javax.swing.JButton();
        jButtonIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonExit.setBackground(new java.awt.Color(255, 0, 0));
        jButtonExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(0, 0, 0));
        jButtonExit.setText("Salir");
        jButtonExit.setBorder(null);
        jButtonExit.setBorderPainted(false);
        jButtonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 60, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/img_login.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jButtonCrearUsuario.setBackground(new java.awt.Color(0, 211, 153));
        jButtonCrearUsuario.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonCrearUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCrearUsuario.setText("Crear usuario");
        jButtonCrearUsuario.setBorder(null);
        jButtonCrearUsuario.setBorderPainted(false);
        jButtonCrearUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 30));

        jButtonIngresar.setBackground(new java.awt.Color(0, 211, 153));
        jButtonIngresar.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonIngresar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.setBorder(null);
        jButtonIngresar.setBorderPainted(false);
        jButtonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 120, 30));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 211, 153));
        jLabel1.setText("Contraseña");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 211, 153));
        jLabel2.setText("DNI");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        jTextFieldUsuario.setBackground(new java.awt.Color(0, 211, 153));
        jTextFieldUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 200, -1));

        jPassword.setBackground(new java.awt.Color(0, 211, 153));
        jPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPassword.setForeground(new java.awt.Color(0, 0, 0));
        jPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 260, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 445, 515));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        int dni = Integer.valueOf(jTextFieldUsuario.getText().strip());
        String contraseña = jPassword.getPassword().toString();
        
        if(true){//Consultar a la BD si existe el usuario con el DNI y la contraseña
            this.dniUsuario = dni;
            Menu menu = new Menu();
            menu.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "El DNI y/o la contraseña son incorrectos");
        }
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jButtonCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearUsuarioActionPerformed
        NuevoUsuario siguiente = new NuevoUsuario();
        siguiente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCrearUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrearUsuario;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
