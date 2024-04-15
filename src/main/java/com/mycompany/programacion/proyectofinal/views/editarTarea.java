/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.programacion.proyectofinal.views;

import ImplementacionDAO.DAOTareasImpl;
import com.mycompany.programacion.proyectofinal.NoteApp;
import com.mycompany.programacion.proyectofinal.interfaces.DAOTareas;
import com.mycompany.programacion.proyectofinal.moldels.Tareas;
import java.awt.Color;
import java.awt.event.ItemEvent;
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
public final class editarTarea extends javax.swing.JPanel {

    Connection cx;
    Tareas tarea;

    public editarTarea() {
        initComponents();
        intComponents();
        ColorTarea();

    }

    public editarTarea(Tareas tarea) {
        initComponents();
        this.tarea = tarea; // Asignar el valor del parámetro a la variable de instancia
        intComponents(); // Llamar al método para inicializar los componentes
        ColorTarea();
    }

    public void intComponents() {
        txt2.putClientProperty("JTextField.placeholderText", "Titulo de la tarea");
        txt1.putClientProperty("JTextArea.placeholderText", "Descripcion");
        txt1.setBackground(Color.white);
        txt2.setBackground(Color.white);
        txt1.setForeground(Color.BLACK);
        txt2.setForeground(Color.black);
        jButton2.setBackground(Color.white);
        //jButton3.setForeground(Color.black);

        txt2.setText(tarea.getTitulo());
        txt1.setText(tarea.getDescripcion());
        combo.setSelectedItem(tarea.getEstado());
    }

    public void ColorTarea() {
        if (combo.getSelectedItem() == "Sin estado") {

            barraDeEstado.setBackground(Color.white);
        } else if (combo.getSelectedItem() == "Rojo") {

            barraDeEstado.setBackground(Color.red);
        } else if (combo.getSelectedItem() == "Amarillo") {

            barraDeEstado.setBackground(Color.yellow);
        } else if (combo.getSelectedItem() == "Verde") {

            barraDeEstado.setBackground(Color.green);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();
        btnSave1 = new javax.swing.JButton();
        btnSave2 = new javax.swing.JButton();
        txt2 = new javax.swing.JTextField();
        tittle3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt1 = new javax.swing.JTextArea();
        paneltarea = new javax.swing.JPanel();
        combo = new javax.swing.JComboBox<>();
        barraDeEstado = new javax.swing.JPanel();

        setBackground(new java.awt.Color(229, 239, 248));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 360, 10));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\elava\\Documents\\NetBeansProjects\\programacion-proyectofinal\\src\\main\\Others resource\\img\\left-arrow (1).png")); // NOI18N
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 70, 60));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 180, 180));

        tittle.setBackground(new java.awt.Color(0, 0, 0));
        tittle.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        tittle.setText("Editar tarea");
        add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, 70));

        btnSave1.setBackground(new java.awt.Color(229, 239, 248));
        btnSave1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSave1.setText("Guardar");
        btnSave1.setBorderPainted(false);
        btnSave1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });
        add(btnSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 110, 40));

        btnSave2.setBackground(new java.awt.Color(255, 102, 102));
        btnSave2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSave2.setIcon(new javax.swing.ImageIcon("C:\\Users\\elava\\Documents\\NetBeansProjects\\programacion-proyectofinal\\src\\main\\Others resource\\img\\delete.png")); // NOI18N
        btnSave2.setBorderPainted(false);
        btnSave2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave2ActionPerformed(evt);
            }
        });
        add(btnSave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 50, 40));

        txt2.setBorder(null);
        txt2.setOpaque(true);
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 360, 40));

        tittle3.setBackground(new java.awt.Color(0, 0, 0));
        tittle3.setFont(new java.awt.Font("Pristina", 0, 18)); // NOI18N
        tittle3.setText("Estado");
        add(tittle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 60, 30));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 370, 350, -1));

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txt1.setColumns(20);
        txt1.setRows(5);
        txt1.setBorder(null);
        txt1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txt1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 360, -1));

        paneltarea.setBackground(new java.awt.Color(255, 255, 255));
        paneltarea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin estado", "Rojo", "Amarillo", "Verde" }));
        combo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboItemStateChanged(evt);
            }
        });
        combo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboMouseClicked(evt);
            }
        });
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        paneltarea.add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 354, -1, -1));

        barraDeEstado.setBackground(new java.awt.Color(255, 255, 255));
        paneltarea.add(barraDeEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 20));

        add(paneltarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 420, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NoteApp.ShowJpanels(new Home());
        NoteApp.ShowJpanels(new tarea());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void btnSave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave2ActionPerformed
      DAOTareas dao = new DAOTareasImpl(); // Si DAOTareas es una interfaz, asegúrate de que DAOTareasImpl sea su implementación concreta.
   try {
    int idTarea = tarea.getId(); // Obtener el ID de la tarea actual
    
    // Verificar si los campos están vacíos
    if (txt1.getText().isEmpty() || txt2.getText().isEmpty()) {
        // Mostrar mensaje de error si algún campo está vacío
        JOptionPane.showMessageDialog(this, "No existe una tarea para eliminar", "Tara inexistente", JOptionPane.ERROR_MESSAGE);
    } else {
        // Crear una tarea con campos vacíos
        Tareas tareaVacia = new Tareas();
        tareaVacia.setId(idTarea);
        tareaVacia.setTitulo("");
        tareaVacia.setDescripcion("");
        tareaVacia.setEstado("Sin estado");

        dao.modificar(tareaVacia); // Actualizar la tarea con campos vacíos en la base de datos

        // Vaciar los JTextFields
        txt2.setText("");
        txt1.setText("");
        // Otros componentes que necesites vaciar

        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "Tarea eliminada con éxito.", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);

        // Aquí puedes realizar cualquier otra acción necesaria después de vaciar la tarea.
    }
} catch (Exception e) {
    System.out.println("Error al vaciar tarea: " + e.getMessage());
}
    }//GEN-LAST:event_btnSave2ActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed

     String titulo = txt2.getText();
    String descripcion = txt1.getText();
    String estado = (String) combo.getSelectedItem();

    if (titulo.isEmpty() || descripcion.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "AVISO", JOptionPane.ERROR_MESSAGE);
        txt2.requestFocus();
        return;
    }
    
    // Actualizar los valores de la tarea
    tarea.setTitulo(titulo);
    tarea.setDescripcion(descripcion);
    tarea.setEstado(estado);

    try {
        DAOTareas dao = new DAOTareasImpl();
        dao.modificar(tarea);
        JOptionPane.showMessageDialog(this, "Tarea editada correctamente.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Ocurrió un error al editar la tarea.", "AVISO", JOptionPane.ERROR_MESSAGE);
        System.out.println(e.getMessage());
    }

    }//GEN-LAST:event_btnSave1ActionPerformed

    private void comboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboMouseClicked


    }//GEN-LAST:event_comboMouseClicked

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraDeEstado;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnSave2;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel paneltarea;
    private javax.swing.JLabel tittle;
    private javax.swing.JLabel tittle3;
    private javax.swing.JTextArea txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(editarTarea aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
