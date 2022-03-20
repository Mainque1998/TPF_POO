/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz.Ventanas;

import cl.pojos.Publicacion;
import cl.sistema.SistemaAplicacion;
import cl.pojos.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


/**
 * Clase para la interfaz de creación de nueva publicación
 * @author Mainque
 */
public class NuevaPublicacion extends javax.swing.JFrame {
    
    public NuevaPublicacion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Interfaz/Imagenes/icono v1.png"));
        return retValue;
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
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxZona = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCalle = new javax.swing.JTextField();
        jTextFieldAltura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jComboBoxPago = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldPiso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDepto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldHabitaciones = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldMetrosCuadrados = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCheckBoxAmueblado = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jCheckBoxPatio = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jButtonCrear = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();
        jButtonMisPublicaciones = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonExit.setBackground(new java.awt.Color(255, 0, 0));
        jButtonExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 211, 153));
        jLabel3.setText("Tipo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jComboBoxTipo.setBackground(new java.awt.Color(0, 217, 153));
        jComboBoxTipo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alquiler", "Venta", "Pensión" }));
        jComboBoxTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 180, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 211, 153));
        jLabel7.setText("Zona");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jComboBoxZona.setBackground(new java.awt.Color(0, 217, 153));
        jComboBoxZona.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centro", "Semi-Centro", "Barrio 25 de Mayo", "Barrio 17 de Agosto", "Barrio Arco Iris 1° etapa", "Barrio Arco Iris 2° etapa", "Barrio de las Ranas", "Barrio Eduardo Olivero", "Barrio El Calvario", "Barrio El Centinela", "Barrio Falucho 1", "Barrio Falucho 2", "Barrio Fatica", "Barrio Fonavi", "Barrio de Graduados", "Barrio General Belgrano", "Barrio Jardín", "Barrio La Movediza", "Barrio Maggiori", "Barrio Manantial", "Barrio Metalúrgico", "Barrio Militar", "Barrio Mirage", "Barrio Palermo", "Barrio Parque La Movediza", "Barrio Pro-Casa", "Barrio Rodríguez-Selvetti", "Barrio San Juan", "Barrio Sierra Sud", "Barrio Terminal", "Barrio Uncas", "Barrio Universitario", "Barrio Villa del Parque", "El Cerrito", "El Tropezón", "El Bolsón", "La Elena", "La Florida", "Las Tunitas", "Villa del Lago", "Villa Don Bosco", "Villa Galicia", "Villa Italia", "Villa Laza", "Villa Gaucho", "Villa Aguirre", "Cerro Leones", "Barrio A.T.E.P.A.M. I y II" }));
        jComboBoxZona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jComboBoxZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 340, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 211, 153));
        jLabel1.setText("Calle");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jTextFieldCalle.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldCalle.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldCalle.setText("Nombre");
        jTextFieldCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCalleActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 180, 30));

        jTextFieldAltura.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldAltura.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAltura.setText("Altura");
        jTextFieldAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlturaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 140, 30));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 211, 153));
        jLabel8.setText("Precio");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jTextFieldPrecio.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldPrecio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 180, 30));

        jComboBoxPago.setBackground(new java.awt.Color(0, 217, 153));
        jComboBoxPago.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mensual", "Por día", "Por semana", "Único" }));
        jComboBoxPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPagoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 140, 30));
        jComboBoxPago.getAccessibleContext().setAccessibleName("");

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 211, 153));
        jLabel11.setText("Piso");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jTextFieldPiso.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldPiso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldPiso.setText("0");
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

        jTextFieldDepto.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldDepto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldDepto.setText("0");
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

        jTextFieldHabitaciones.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldHabitaciones.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

        jTextFieldMetrosCuadrados.setBackground(new java.awt.Color(0, 217, 153));
        jTextFieldMetrosCuadrados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

        jCheckBoxAmueblado.setBackground(new java.awt.Color(0, 211, 153));
        jCheckBoxAmueblado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jCheckBoxAmueblado.setAlignmentY(0.0F);
        jCheckBoxAmueblado.setBorder(null);
        jCheckBoxAmueblado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBoxAmueblado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBoxAmueblado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBoxAmueblado.setMargin(new java.awt.Insets(2, 2, 10, 2));
        jCheckBoxAmueblado.setMinimumSize(new java.awt.Dimension(30, 30));
        jCheckBoxAmueblado.setPreferredSize(new java.awt.Dimension(20, 20));
        jCheckBoxAmueblado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAmuebladoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxAmueblado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 40, 30));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 211, 153));
        jLabel9.setText("¿Tiene patio?");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jCheckBoxPatio.setBackground(new java.awt.Color(0, 211, 153));
        jCheckBoxPatio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jCheckBoxPatio.setAlignmentY(0.0F);
        jCheckBoxPatio.setBorder(null);
        jCheckBoxPatio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBoxPatio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBoxPatio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBoxPatio.setMargin(new java.awt.Insets(2, 2, 10, 2));
        jCheckBoxPatio.setMinimumSize(new java.awt.Dimension(30, 30));
        jCheckBoxPatio.setPreferredSize(new java.awt.Dimension(20, 20));
        jCheckBoxPatio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPatioActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxPatio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 40, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 211, 153));
        jLabel2.setText("Descripción");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jTextAreaDescripcion.setBackground(new java.awt.Color(0, 211, 153));
        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextAreaDescripcion.setLineWrap(true);
        jTextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 410, 110));

        jButtonCrear.setBackground(new java.awt.Color(0, 217, 153));
        jButtonCrear.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jButtonCrear.setText("Crear");
        jButtonCrear.setBorder(null);
        jButtonCrear.setBorderPainted(false);
        jButtonCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 120, 40));

        jButtonMenu.setBackground(new java.awt.Color(0, 217, 153));
        jButtonMenu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonMenu.setText("Menú inicial");
        jButtonMenu.setBorder(null);
        jButtonMenu.setBorderPainted(false);
        jButtonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 120, 20));

        jButtonMisPublicaciones.setBackground(new java.awt.Color(0, 217, 153));
        jButtonMisPublicaciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonMisPublicaciones.setText("MisPublicaciones");
        jButtonMisPublicaciones.setBorder(null);
        jButtonMisPublicaciones.setBorderPainted(false);
        jButtonMisPublicaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMisPublicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMisPublicacionesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMisPublicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 130, 20));

        jLabelFondo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/fondo.png"))); // NOI18N
        jLabelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 217, 153)));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 445, 515));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        //Primero verificamos que no esten vacios los campos obligatorios
        if(jTextFieldCalle.getText().isEmpty() || jTextFieldPrecio.getText().isEmpty() || jTextFieldHabitaciones.getText().isEmpty() || jTextFieldMetrosCuadrados.getText().isEmpty() || jTextAreaDescripcion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios (a excepcion de piso y departamento).");
        }else{
            String calle= jTextFieldCalle.getText().strip();
            String altura= jTextFieldAltura.getText().strip();
            String precio= jTextFieldPrecio.getText().strip();
            String cantH= jTextFieldHabitaciones.getText().strip();
            String metros= jTextFieldMetrosCuadrados.getText().strip();
            
            String piso= jTextFieldPiso.getText().strip();
            String depto= jTextFieldDepto.getText().strip();
            //Los campos piso y depto al no ser obligatorios se los pone en 0 si no fueron llenados
            if(piso.isEmpty())
                piso="0";
            if(depto.isEmpty())
                depto="0";
            
            //Luego verificamos que los campos numericos solo contengan numeros
            if(precio.matches("[+-]?\\d*(\\.\\d+)?") && altura.matches("[+-]?\\d*(\\.\\d+)?") && cantH.matches("[+-]?\\d*(\\.\\d+)?") && metros.matches("[+-]?\\d*(\\.\\d+)?") && piso.matches("[+-]?\\d*(\\.\\d+)?") && depto.matches("[+-]?\\d*(\\.\\d+)?")){
                Publicacion p = new Publicacion(Login.getUsuarioActual(), jComboBoxTipo.getSelectedItem().toString(), jComboBoxZona.getSelectedItem().toString(), calle, Integer.valueOf(altura), Integer.valueOf(piso), Integer.valueOf(depto), jComboBoxPago.getSelectedItem().toString(), Integer.valueOf(precio), Integer.valueOf(cantH), Integer.valueOf(metros), jCheckBoxAmueblado.isSelected(), jCheckBoxPatio.isSelected(), jTextAreaDescripcion.getText());
                SistemaAplicacion sistema = new SistemaAplicacion();
                boolean seAgrego = sistema.agregarPublicacion(p);

                if(seAgrego){
                    JOptionPane.showMessageDialog(null, "La publicación se creó exitosamente.");
                    //Pongo las celdas en blanco para agregar otras
                    jTextFieldCalle.setText("");
                    jTextFieldAltura.setText("");
                    jTextFieldPrecio.setText("");
                    jTextFieldHabitaciones.setText("");
                    jTextFieldMetrosCuadrados.setText("");
                    jTextFieldPiso.setText("");
                    jTextFieldDepto.setText("");
                    jTextAreaDescripcion.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Ya existe una publicación con la misma calle, piso y depto.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Los campos numéricos solo pueden contener números.");
            }
        }
    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        Menu anterior = new Menu();
        anterior.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jTextFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioActionPerformed

    private void jTextFieldMetrosCuadradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMetrosCuadradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMetrosCuadradosActionPerformed

    private void jComboBoxPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPagoActionPerformed

    private void jTextFieldCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCalleActionPerformed

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

    private void jTextFieldDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDeptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDeptoActionPerformed

    private void jCheckBoxAmuebladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAmuebladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAmuebladoActionPerformed

    private void jCheckBoxPatioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPatioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxPatioActionPerformed

    private void jTextFieldHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHabitacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHabitacionesActionPerformed

    private void jTextFieldPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPisoActionPerformed

    private void jTextFieldAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlturaActionPerformed

    private void jButtonMisPublicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMisPublicacionesActionPerformed
        MisPublicaciones m = new MisPublicaciones();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMisPublicacionesActionPerformed

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
            java.util.logging.Logger.getLogger(NuevaPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaPublicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonMisPublicaciones;
    private javax.swing.JCheckBox jCheckBoxAmueblado;
    private javax.swing.JCheckBox jCheckBoxPatio;
    private javax.swing.JComboBox<String> jComboBoxPago;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JComboBox<String> jComboBoxZona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField jTextFieldCalle;
    private javax.swing.JTextField jTextFieldDepto;
    private javax.swing.JTextField jTextFieldHabitaciones;
    private javax.swing.JTextField jTextFieldMetrosCuadrados;
    private javax.swing.JTextField jTextFieldPiso;
    private javax.swing.JTextField jTextFieldPrecio;
    // End of variables declaration//GEN-END:variables
}
