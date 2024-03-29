/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz.Ventanas;

import cl.pojos.*;
import cl.sistema.SistemaAplicacion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


/**
 * Clase para la interfaz de visualizacion clara de una publicación
 * @author Mainque
 */
public class PublicacionDetallada extends javax.swing.JFrame {
    
    public PublicacionDetallada() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Interfaz/Imagenes/icono v1.png"));
        return retValue;
    }
   
    //Metodo usado para enviar la publicacion que se desea detallar
    public void setPublicacion(Publicacion p){
        //Publicacion
        jTextFieldAltura.setText(String.valueOf(p.getAltura()));
        jTextFieldPrecio.setText(String.valueOf(p.getPrecio()));
        jTextFieldPiso.setText(String.valueOf(p.getPiso()));
        jTextFieldDepto.setText(String.valueOf(p.getDepto()));
        jTextFieldMetrosCuadrados.setText(String.valueOf(p.getMetrosCuadrados()));
        jTextFieldHabitaciones.setText(String.valueOf(p.getCantHabitaciones()));
        jTextFieldTipo.setText(p.getTipo());
        jTextFieldZona.setText(p.getZona());
        jTextFieldCalle.setText(p.getCalle());
        jTextFieldPago.setText(p.getPago());
        jTextAreaDescripcion.setText(p.getDescripcion());
        if(p.isEsAmueblado()){
            jTextFieldAmueblado.setText("Sí");
        }else{
            jTextFieldAmueblado.setText("No");
        }
        if(p.isTienePatio()){
            jTextFieldPatio.setText("Sí");
        }else{
            jTextFieldPatio.setText("No");
        }
        //Dueño
        jTextFieldCNombre.setText(p.getUsuario().getNombre());
        jTextFieldEmail.setText(p.getUsuario().getEmail());
        jTextFieldTelefono.setText(p.getUsuario().getTelefono());
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
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTipo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldZona = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCalle = new javax.swing.JTextField();
        jTextFieldAltura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jTextFieldPago = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldPiso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDepto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldHabitaciones = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldMetrosCuadrados = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPatio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldAmueblado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldCNombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonExit.setBackground(new java.awt.Color(255, 0, 0));
        jButtonExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonExit.setText("Cerrar");
        jButtonExit.setBorder(null);
        jButtonExit.setBorderPainted(false);
        jButtonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 60, 20));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 211, 153));
        jLabel3.setText("Tipo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jTextFieldTipo.setEditable(false);
        jTextFieldTipo.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldTipo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldTipo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldTipo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldTipo.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextFieldTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTipoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 180, 30));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 211, 153));
        jLabel7.setText("Zona");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTextFieldZona.setEditable(false);
        jTextFieldZona.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldZona.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldZona.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldZona.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldZona.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextFieldZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldZonaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 340, 30));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 211, 153));
        jLabel1.setText("Calle");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jTextFieldCalle.setEditable(false);
        jTextFieldCalle.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldCalle.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldCalle.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCalle.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCalle.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextFieldCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCalleActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 180, 30));

        jTextFieldAltura.setEditable(false);
        jTextFieldAltura.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldAltura.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAltura.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldAltura.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldAltura.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextFieldAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlturaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 150, 30));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 211, 153));
        jLabel8.setText("Precio");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jTextFieldPrecio.setEditable(false);
        jTextFieldPrecio.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldPrecio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldPrecio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPrecio.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPrecio.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 180, 30));

        jTextFieldPago.setEditable(false);
        jTextFieldPago.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldPago.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldPago.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPago.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPago.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextFieldPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPagoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 150, 30));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 211, 153));
        jLabel11.setText("Piso");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jTextFieldPiso.setEditable(false);
        jTextFieldPiso.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldPiso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldPiso.setText("0");
        jTextFieldPiso.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPiso.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPiso.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextFieldPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPisoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 100, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 211, 153));
        jLabel4.setText("Departamento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jTextFieldDepto.setEditable(false);
        jTextFieldDepto.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldDepto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldDepto.setText("0");
        jTextFieldDepto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldDepto.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldDepto.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextFieldDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDeptoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 70, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 211, 153));
        jLabel10.setText("Habitaciones");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jTextFieldHabitaciones.setEditable(false);
        jTextFieldHabitaciones.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldHabitaciones.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldHabitaciones.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldHabitaciones.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldHabitaciones.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextFieldHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHabitacionesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 40, 30));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 211, 153));
        jLabel6.setText("Metros cuadrados");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jTextFieldMetrosCuadrados.setEditable(false);
        jTextFieldMetrosCuadrados.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldMetrosCuadrados.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldMetrosCuadrados.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldMetrosCuadrados.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldMetrosCuadrados.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextFieldMetrosCuadrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMetrosCuadradosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMetrosCuadrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 40, 30));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 211, 153));
        jLabel5.setText("¿Es amueblado?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jTextFieldPatio.setEditable(false);
        jTextFieldPatio.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldPatio.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldPatio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPatio.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPatio.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextFieldPatio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPatioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPatio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 40, 30));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 211, 153));
        jLabel9.setText("¿Tiene patio?");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jTextFieldAmueblado.setEditable(false);
        jTextFieldAmueblado.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldAmueblado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldAmueblado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldAmueblado.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldAmueblado.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextFieldAmueblado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAmuebladoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAmueblado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 40, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 211, 153));
        jLabel2.setText("Descripción");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jTextAreaDescripcion.setEditable(false);
        jTextAreaDescripcion.setBackground(new java.awt.Color(0, 211, 153));
        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextAreaDescripcion.setLineWrap(true);
        jTextAreaDescripcion.setRows(5);
        jTextAreaDescripcion.setText("\n");
        jTextAreaDescripcion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextAreaDescripcion.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextAreaDescripcion.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 410, 160));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 44)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 211, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Contacto");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 210, 280, 60));

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 211, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Nombre");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 270, 290, -1));

        jTextFieldCNombre.setEditable(false);
        jTextFieldCNombre.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldCNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldCNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCNombre.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCNombre.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextFieldCNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 280, 30));

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 211, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Email");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 350, 280, -1));

        jTextFieldEmail.setEditable(false);
        jTextFieldEmail.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldEmail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEmail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEmail.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEmail.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 280, 30));

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 211, 153));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText(" Teléfono");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 280, -1));

        jTextFieldTelefono.setEditable(false);
        jTextFieldTelefono.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldTelefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTelefono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldTelefono.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldTelefono.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 280, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/img_login.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        jLabelFondo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/fondo.png"))); // NOI18N
        jLabelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 217, 153)));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 515));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTextFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioActionPerformed

    private void jTextFieldMetrosCuadradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMetrosCuadradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMetrosCuadradosActionPerformed

    private void jTextFieldCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCalleActionPerformed

    private void jTextFieldDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDeptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDeptoActionPerformed

    private void jTextFieldHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHabitacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHabitacionesActionPerformed

    private void jTextFieldPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPisoActionPerformed

    private void jTextFieldAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlturaActionPerformed

    private void jTextFieldTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTipoActionPerformed

    private void jTextFieldZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldZonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldZonaActionPerformed

    private void jTextFieldPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPagoActionPerformed

    private void jTextFieldPatioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPatioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPatioActionPerformed

    private void jTextFieldAmuebladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAmuebladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAmuebladoActionPerformed

    private void jTextFieldCNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCNombreActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(PublicacionDetallada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PublicacionDetallada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PublicacionDetallada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PublicacionDetallada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PublicacionDetallada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldAmueblado;
    private javax.swing.JTextField jTextFieldCNombre;
    private javax.swing.JTextField jTextFieldCalle;
    private javax.swing.JTextField jTextFieldDepto;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldHabitaciones;
    private javax.swing.JTextField jTextFieldMetrosCuadrados;
    private javax.swing.JTextField jTextFieldPago;
    private javax.swing.JTextField jTextFieldPatio;
    private javax.swing.JTextField jTextFieldPiso;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldTipo;
    private javax.swing.JTextField jTextFieldZona;
    // End of variables declaration//GEN-END:variables
}
