/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.programacion.proyectofinal.views;

import com.mycompany.programacion.proyectofinal.NoteApp;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author elava
 */
public class agregarTarea extends javax.swing.JPanel {

    public agregarTarea() {
        initComponents();
        intComponents();

    }

    public void intComponents() {
        txt2.putClientProperty("JTextField.placeholderText", "Titulo de la tarea");
        txt1.putClientProperty("JTextArea.placeholderText", "Descripcion");
        txt1.setBackground(Color.white);
        txt2.setBackground(Color.white);
        txt1.setForeground(Color.GRAY);
        txt2.setForeground(Color.GRAY);
        jButton2.setBackground(Color.white);

    }

    public void Limpiar() {
        txt1.setText("");
        txt2.setText("");

    }

    public Connection Conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/NoteApp", "root", "2003");
        } catch (SQLException e) {
            System.err.println(e.toString());
            JOptionPane.showMessageDialog(this, "Ocurrio un error inesperado.\n ");
        }
        return con;
    }

    public void ingresar() {
        Connection con1 = null;

        try {
            con1 = Conectar(); // Obtener la conexión a la base de datos
            PreparedStatement pst = con1.prepareStatement("INSERT INTO tareas (titulo, descripcion, estado) VALUES (?,?,?)");

            pst.setString(1, txt2.getText());
            pst.setString(2, txt1.getText());
            pst.setString(3, combo.getSelectedItem().toString()); // Obtener el valor seleccionado del JComboBox

            pst.executeUpdate(); // Ejecutar la consulta para insertar los datos

            JOptionPane.showMessageDialog(this, "Los datos se han ingresado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al ingresar los datos: " + e.toString());
            JOptionPane.showMessageDialog(this, "Ocurrió un error al ingresar los datos.\n" + e.getMessage());
        } finally {
            if (con1 != null) {
                try {
                    con1.close(); // Cerrar la conexión
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e.toString());
                }
            }
        }

        Limpiar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt2 = new javax.swing.JTextField();
        tittle3 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt1 = new javax.swing.JTextArea();
        barraDeEstado = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(229, 239, 248));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 360, 10));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 180, 180));

        tittle.setBackground(new java.awt.Color(0, 0, 0));
        tittle.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        tittle.setText("Agregar tareas");
        add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, 70));

        jButton1.setBackground(new java.awt.Color(229, 239, 248));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 110, 40));

        txt2.setForeground(new java.awt.Color(231, 235, 242));
        txt2.setBorder(null);
        txt2.setOpaque(true);
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 370, 40));

        tittle3.setBackground(new java.awt.Color(0, 0, 0));
        tittle3.setFont(new java.awt.Font("Pristina", 0, 18)); // NOI18N
        tittle3.setText("Estado");
        add(tittle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 60, 30));

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin estado", "Rojo", "Amarillo", "Verde" }));
        combo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboItemStateChanged(evt);
            }
        });
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 340, 350, -1));

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txt1.setColumns(20);
        txt1.setRows(5);
        txt1.setBorder(null);
        txt1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txt1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 360, -1));

        barraDeEstado.setBackground(new java.awt.Color(255, 255, 255));
        add(barraDeEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 420, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\elava\\Documents\\NetBeansProjects\\programacion-proyectofinal\\src\\main\\Others resource\\img\\left-arrow (1).png")); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton2)
                .addContainerGap(377, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 420, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboItemStateChanged
        if (combo.getSelectedItem() == "Sin estado") {

            barraDeEstado.setBackground(Color.white);
        } else if (combo.getSelectedItem() == "Rojo") {

            barraDeEstado.setBackground(Color.red);
        } else if (combo.getSelectedItem() == "Amarillo") {

            barraDeEstado.setBackground(Color.yellow);
        } else if (combo.getSelectedItem() == "Verde") {

            barraDeEstado.setBackground(Color.green);
        }
    }//GEN-LAST:event_comboItemStateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        if (evt.getButton() == MouseEvent.BUTTON1) { // Verificar si se hizo clic con el botón izquierdo del mouse
            if (txt1.getText().isEmpty() || txt2.getText().isEmpty()) { // Verificar si los campos de texto están vacíos
                JOptionPane.showMessageDialog(this, "No puede dejar campos vacíos.\n");
            } else {
                ingresar();
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NoteApp.ShowJpanels(new Home());
        NoteApp.ShowJpanels(new tarea());
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraDeEstado;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel tittle;
    private javax.swing.JLabel tittle3;
    private javax.swing.JTextArea txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables
}
