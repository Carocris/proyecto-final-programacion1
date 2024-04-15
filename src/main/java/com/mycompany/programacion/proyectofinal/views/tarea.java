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
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author elava
 */
public class tarea extends javax.swing.JPanel {

    public tarea() {
        initComponents();
        intComponents();
        actualizarNotas();
        actualizarEstados();

    }

    public void actualizarEstados() {
        try {
            // Obtener la tarea 1
            int tareaId1 = 1;
            DAOTareas dao = new DAOTareasImpl();
            Tareas tarea1 = dao.getTareaById(tareaId1);

            String estadoTarea1 = tarea1.getEstado();

            // Cambiar el color del panel Estado 1 en función del estado de la tarea 1
            switch (estadoTarea1) {
                case "Rojo":
                    PanelEstado.setBackground(Color.RED);
                    break;
                case "Amarillo":
                    PanelEstado.setBackground(Color.YELLOW);
                    break;
                case "Verde":
                    PanelEstado.setBackground(Color.GREEN);
                    break;
                default:
                    PanelEstado.setBackground(Color.WHITE); // Color por defecto
                    break;
            }

            // Obtener la tarea 2
            int tareaId2 = 2;
            Tareas tarea2 = dao.getTareaById(tareaId2);

            String estadoTarea2 = tarea2.getEstado();

            // Cambiar el color del panel Estado 2 en función del estado de la tarea 2
            switch (estadoTarea2) {
                case "Rojo":
                    PanelEstado1.setBackground(Color.RED);
                    break;
                case "Amarillo":
                    PanelEstado1.setBackground(Color.YELLOW);
                    break;
                case "Verde":
                    PanelEstado1.setBackground(Color.GREEN);
                    break;
                default:
                    PanelEstado1.setBackground(Color.WHITE); // Color por defecto
                    break;
            }

            // Obtener la tarea 3
            int tareaId3 = 3;
            Tareas tarea3 = dao.getTareaById(tareaId3);

            String estadoTarea3 = tarea3.getEstado();

            // Cambiar el color del panel Estado 3 en función del estado de la tarea 3
            switch (estadoTarea3) {
                case "Rojo":
                    PanelEstado2.setBackground(Color.RED);
                    break;
                case "Amarillo":
                    PanelEstado2.setBackground(Color.YELLOW);
                    break;
                case "Verde":
                    PanelEstado2.setBackground(Color.GREEN);
                    break;
                default:
                    PanelEstado2.setBackground(Color.WHITE); // Color por defecto
                    break;
            }

            // Obtener la tarea 4
            int tareaId4 = 4;
            Tareas tarea4 = dao.getTareaById(tareaId4);

            String estadoTarea4 = tarea4.getEstado();

            // Cambiar el color del panel Estado 4 en función del estado de la tarea 4
            switch (estadoTarea4) {
                case "Rojo":
                    PanelEstado3.setBackground(Color.RED);
                    break;
                case "Amarillo":
                    PanelEstado3.setBackground(Color.YELLOW);
                    break;
                case "Verde":
                    PanelEstado3.setBackground(Color.GREEN);
                    break;
                default:
                    PanelEstado3.setBackground(Color.WHITE); // Color por defecto
                    break;
            }

            // Obtener la tarea 5
            int tareaId5 = 5;
            Tareas tarea5 = dao.getTareaById(tareaId5);

            String estadoTarea5 = tarea5.getEstado();

            // Cambiar el color del panel Estado 5 en función del estado de la tarea 5
            switch (estadoTarea5) {
                case "Rojo":
                    PanelEstado4.setBackground(Color.RED);
                    break;
                case "Amarillo":
                    PanelEstado4.setBackground(Color.YELLOW);
                    break;
                case "Verde":
                    PanelEstado4.setBackground(Color.GREEN);
                    break;
                default:
                    PanelEstado4.setBackground(Color.WHITE); // Color por defecto
                    break;
            }

            // Obtener la tarea 6
            int tareaId6 = 6;
            Tareas tarea6 = dao.getTareaById(tareaId6);

            String estadoTarea6 = tarea6.getEstado();

            // Cambiar el color del panel Estado 6 en función del estado de la tarea 6
            switch (estadoTarea6) {
                case "Rojo":
                    PanelEstado5.setBackground(Color.RED);
                    break;
                case "Amarillo":
                    PanelEstado5.setBackground(Color.YELLOW);
                    break;
                case "Verde":
                    PanelEstado5.setBackground(Color.GREEN);
                    break;
                default:
                    PanelEstado5.setBackground(Color.WHITE); // Color por defecto
                    break;
            }

            // Obtener la tarea 7
            int tareaId7 = 7;
            Tareas tarea7 = dao.getTareaById(tareaId7);

            String estadoTarea7 = tarea7.getEstado();

            // Cambiar el color del panel Estado 7 en función del estado de la tarea 7
            switch (estadoTarea7) {
                case "Rojo":
                    PanelEstado6.setBackground(Color.RED);
                    break;
                case "Amarillo":
                    PanelEstado6.setBackground(Color.YELLOW);
                    break;
                case "Verde":
                    PanelEstado6.setBackground(Color.GREEN);
                    break;
                default:
                    PanelEstado6.setBackground(Color.WHITE); // Color por defecto
                    break;
            }

            // Obtener la tarea 8
            int tareaId8 = 8;
            Tareas tarea8 = dao.getTareaById(tareaId8);

            String estadoTarea8 = tarea8.getEstado();

            // Cambiar el color del panel Estado 8 en función del estado de la tarea 8
            switch (estadoTarea8) {
                case "Rojo":
                    PanelEstado7.setBackground(Color.RED);
                    break;
                case "Amarillo":
                    PanelEstado7.setBackground(Color.YELLOW);
                    break;
                case "Verde":
                    PanelEstado7.setBackground(Color.GREEN);
                    break;
                default:
                    PanelEstado7.setBackground(Color.WHITE); // Color por defecto
                    break;
            }

            int tareaId9 = 9;
            Tareas tarea9 = dao.getTareaById(tareaId8);

            String estadoTarea9 = tarea9.getEstado();

            // Cambiar el color del panel Estado 8 en función del estado de la tarea 8
            switch (estadoTarea9) {
                case "Rojo":
                    PanelEstado9.setBackground(Color.RED);
                    break;
                case "Amarillo":
                    PanelEstado9.setBackground(Color.YELLOW);
                    break;
                case "Verde":
                    PanelEstado9.setBackground(Color.GREEN);
                    break;
                default:
                    PanelEstado9.setBackground(Color.WHITE); // Color por defecto
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar estados: " + e.getMessage());
        }
    }

    public void actualizarNotas() {
    try {
        DAOTareas dao = new DAOTareasImpl();
        
        // Obtener la tarea 1
        int tareaId1 = 1;
        Tareas tarea1 = dao.getTareaById(tareaId1);
        lblNota1.setText((tarea1 != null && tarea1.getTitulo() != null && !tarea1.getTitulo().isEmpty()) ? tarea1.getTitulo() : "Tarea sin título");

        // Obtener la tarea 2
        int tareaId2 = 2;
        Tareas tarea2 = dao.getTareaById(tareaId2);
        lblNota2.setText((tarea2 != null && tarea2.getTitulo() != null && !tarea2.getTitulo().isEmpty()) ? tarea2.getTitulo() : "Sin título");

        // Obtener la tarea 3
        int tareaId3 = 3;
        Tareas tarea3 = dao.getTareaById(tareaId3);
        lblNota3.setText((tarea3 != null && tarea3.getTitulo() != null && !tarea3.getTitulo().isEmpty()) ? tarea3.getTitulo() : "Sin título");

        // Obtener la tarea 4
        int tareaId4 = 4;
        Tareas tarea4 = dao.getTareaById(tareaId4);
        lblNota4.setText((tarea4 != null && tarea4.getTitulo() != null && !tarea4.getTitulo().isEmpty()) ? tarea4.getTitulo() : "Sin título");

        // Obtener la tarea 5
        int tareaId5 = 5;
        Tareas tarea5 = dao.getTareaById(tareaId5);
        lblNota5.setText((tarea5 != null && tarea5.getTitulo() != null && !tarea5.getTitulo().isEmpty()) ? tarea5.getTitulo() : "Sin título");

        // Obtener la tarea 6
        int tareaId6 = 6;
        Tareas tarea6 = dao.getTareaById(tareaId6);
        lblNota6.setText((tarea6 != null && tarea6.getTitulo() != null && !tarea6.getTitulo().isEmpty()) ? tarea6.getTitulo() : "Sin título");

        // Obtener la tarea 7
        int tareaId7 = 7;
        Tareas tarea7 = dao.getTareaById(tareaId7);
        lblNota7.setText((tarea7 != null && tarea7.getTitulo() != null && !tarea7.getTitulo().isEmpty()) ? tarea7.getTitulo() : "Sin título");

        // Obtener la tarea 8
        int tareaId8 = 8;
        Tareas tarea8 = dao.getTareaById(tareaId8);
        lblNota8.setText((tarea8 != null && tarea8.getTitulo() != null && !tarea8.getTitulo().isEmpty()) ? tarea8.getTitulo() : "Sin título");

        // Obtener la tarea 9
        int tareaId9 = 9;
        Tareas tarea9 = dao.getTareaById(tareaId9);
        lblNota9.setText((tarea9 != null && tarea9.getTitulo() != null && !tarea9.getTitulo().isEmpty()) ? tarea9.getTitulo() : "Sin título");

    } catch (Exception e) {
        System.out.println("Error al actualizar notas: " + e.getMessage());
    }
}


    public void intComponents() {
        //Labels

        lbl1.setForeground(Color.black);
        lbl2.setForeground(Color.black);
        lbl3.setForeground(Color.black);
        lbl5.setForeground(Color.black);
        lbl6.setForeground(Color.black);
        lbl7.setForeground(Color.black);
        lbl8.setForeground(Color.black);
        lbl9.setForeground(Color.black);
        lbl10.setForeground(Color.black);
        lblNota1.setForeground(Color.black);
        lblNota2.setForeground(Color.black);
        lblNota3.setForeground(Color.black);
        lblNota4.setForeground(Color.black);
        lblNota5.setForeground(Color.black);
        lblNota6.setForeground(Color.black);
        lblNota7.setForeground(Color.black);
        lblNota8.setForeground(Color.black);
        lblNota9.setForeground(Color.black);

        //comboBox
        comboBox1.setForeground(Color.BLACK);

        //text
        txt1.putClientProperty("JTextField.placeholderText", "Buscar tarea");
        txt1.setBackground(Color.white);
        txt1.setForeground(Color.black);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbl2 = new javax.swing.JButton();
        lblNota3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JButton();
        lblNota1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblNota2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lbl5 = new javax.swing.JButton();
        lblNota7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbl6 = new javax.swing.JButton();
        lblNota5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lbl7 = new javax.swing.JButton();
        lblNota6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lbl8 = new javax.swing.JButton();
        lblNota4 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lbl9 = new javax.swing.JButton();
        lblNota8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lbl10 = new javax.swing.JButton();
        lblNota9 = new javax.swing.JLabel();
        PanelEstado = new javax.swing.JPanel();
        PanelEstado1 = new javax.swing.JPanel();
        PanelEstado2 = new javax.swing.JPanel();
        PanelEstado3 = new javax.swing.JPanel();
        PanelEstado5 = new javax.swing.JPanel();
        PanelEstado6 = new javax.swing.JPanel();
        PanelEstado7 = new javax.swing.JPanel();
        PanelEstado9 = new javax.swing.JPanel();
        PanelEstado4 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        jLabel3.setText("Filtrar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 40, 20));

        comboBox1.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        comboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha", "Estado", "Orden Alfabetico" }));
        comboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(comboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 160, -1));

        jLabel2.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel2.setText("Lista de tareas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\elava\\Documents\\NetBeansProjects\\programacion-proyectofinal\\src\\main\\Others resource\\img\\magnifying-glass.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 30, 30));

        txt1.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        txt1.setText(" ");
        txt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt1MousePressed(evt);
            }
        });
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 190, 30));

        jPanel2.setBackground(new java.awt.Color(229, 239, 248));

        lbl2.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        lbl2.setText("Ver");
        lbl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl2ActionPerformed(evt);
            }
        });

        lblNota3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblNota3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota3.setText("Note 3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 96, Short.MAX_VALUE)
                        .addComponent(lbl2))
                    .addComponent(lblNota3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(lblNota3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl2)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 180, 110));

        jPanel3.setBackground(new java.awt.Color(229, 239, 248));

        lbl1.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        lbl1.setText("Ver");
        lbl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl1ActionPerformed(evt);
            }
        });

        lblNota1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblNota1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota1.setText("Note 1");
        lblNota1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(lbl1)
                .addContainerGap())
            .addComponent(lblNota1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(lblNota1)
                .addGap(18, 18, 18)
                .addComponent(lbl1)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 180, 110));

        jPanel7.setBackground(new java.awt.Color(229, 239, 248));

        lblNota2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblNota2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota2.setText("Note 2");

        lbl3.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        lbl3.setText("Ver");
        lbl3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(lbl3)
                .addContainerGap())
            .addComponent(lblNota2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(lblNota2)
                .addGap(18, 18, 18)
                .addComponent(lbl3)
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 180, 110));

        jPanel6.setBackground(new java.awt.Color(229, 239, 248));

        lbl5.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        lbl5.setText("Ver");
        lbl5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl5ActionPerformed(evt);
            }
        });

        lblNota7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblNota7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota7.setText("Note 7");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 96, Short.MAX_VALUE)
                        .addComponent(lbl5))
                    .addComponent(lblNota7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(lblNota7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl5)
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 180, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\elava\\Documents\\NetBeansProjects\\programacion-proyectofinal\\src\\main\\Others resource\\img\\sort.png")); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 20));

        jPanel8.setBackground(new java.awt.Color(229, 239, 248));

        lbl6.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        lbl6.setText("Ver");
        lbl6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl6ActionPerformed(evt);
            }
        });

        lblNota5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblNota5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota5.setText("Note 5");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(lbl6)
                .addContainerGap())
            .addComponent(lblNota5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(lblNota5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl6)
                .addContainerGap())
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        jPanel9.setBackground(new java.awt.Color(229, 239, 248));

        lbl7.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        lbl7.setText("Ver");
        lbl7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl7ActionPerformed(evt);
            }
        });

        lblNota6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblNota6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota6.setText("Note 6");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 99, Short.MAX_VALUE)
                        .addComponent(lbl7))
                    .addComponent(lblNota6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(lblNota6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl7)
                .addContainerGap())
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        jPanel10.setBackground(new java.awt.Color(229, 239, 248));

        lbl8.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        lbl8.setText("Ver");
        lbl8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl8ActionPerformed(evt);
            }
        });

        lblNota4.setBackground(new java.awt.Color(229, 239, 248));
        lblNota4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblNota4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota4.setText("Note 4");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap(102, Short.MAX_VALUE)
                        .addComponent(lbl8))
                    .addComponent(lblNota4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(lblNota4)
                .addGap(18, 18, 18)
                .addComponent(lbl8)
                .addContainerGap())
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 180, 110));

        jPanel11.setBackground(new java.awt.Color(229, 239, 248));

        lbl9.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        lbl9.setText("Ver");
        lbl9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl9ActionPerformed(evt);
            }
        });

        lblNota8.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblNota8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota8.setText("Note 8");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 99, Short.MAX_VALUE)
                        .addComponent(lbl9))
                    .addComponent(lblNota8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(lblNota8)
                .addGap(18, 18, 18)
                .addComponent(lbl9)
                .addContainerGap())
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, 110));

        jPanel12.setBackground(new java.awt.Color(229, 239, 248));

        lbl10.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        lbl10.setText("Ver");
        lbl10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl10ActionPerformed(evt);
            }
        });

        lblNota9.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblNota9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota9.setText("Note 9");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 99, Short.MAX_VALUE)
                        .addComponent(lbl10))
                    .addComponent(lblNota9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(lblNota9)
                .addGap(18, 18, 18)
                .addComponent(lbl10)
                .addContainerGap())
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        PanelEstado.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelEstadoLayout = new javax.swing.GroupLayout(PanelEstado);
        PanelEstado.setLayout(PanelEstadoLayout);
        PanelEstadoLayout.setHorizontalGroup(
            PanelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        PanelEstadoLayout.setVerticalGroup(
            PanelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(PanelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 180, 10));

        PanelEstado1.setBackground(new java.awt.Color(255, 255, 255));
        PanelEstado1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelEstado1Layout = new javax.swing.GroupLayout(PanelEstado1);
        PanelEstado1.setLayout(PanelEstado1Layout);
        PanelEstado1Layout.setHorizontalGroup(
            PanelEstado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        PanelEstado1Layout.setVerticalGroup(
            PanelEstado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(PanelEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        PanelEstado2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelEstado2Layout = new javax.swing.GroupLayout(PanelEstado2);
        PanelEstado2.setLayout(PanelEstado2Layout);
        PanelEstado2Layout.setHorizontalGroup(
            PanelEstado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        PanelEstado2Layout.setVerticalGroup(
            PanelEstado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(PanelEstado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        PanelEstado3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelEstado3Layout = new javax.swing.GroupLayout(PanelEstado3);
        PanelEstado3.setLayout(PanelEstado3Layout);
        PanelEstado3Layout.setHorizontalGroup(
            PanelEstado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        PanelEstado3Layout.setVerticalGroup(
            PanelEstado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(PanelEstado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        PanelEstado5.setBackground(new java.awt.Color(255, 255, 255));
        PanelEstado5.setPreferredSize(new java.awt.Dimension(187, 10));

        javax.swing.GroupLayout PanelEstado5Layout = new javax.swing.GroupLayout(PanelEstado5);
        PanelEstado5.setLayout(PanelEstado5Layout);
        PanelEstado5Layout.setHorizontalGroup(
            PanelEstado5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );
        PanelEstado5Layout.setVerticalGroup(
            PanelEstado5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(PanelEstado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 186, -1));

        PanelEstado6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelEstado6Layout = new javax.swing.GroupLayout(PanelEstado6);
        PanelEstado6.setLayout(PanelEstado6Layout);
        PanelEstado6Layout.setHorizontalGroup(
            PanelEstado6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        PanelEstado6Layout.setVerticalGroup(
            PanelEstado6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(PanelEstado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 180, 10));

        PanelEstado7.setBackground(new java.awt.Color(255, 255, 255));
        PanelEstado7.setPreferredSize(new java.awt.Dimension(187, 10));

        javax.swing.GroupLayout PanelEstado7Layout = new javax.swing.GroupLayout(PanelEstado7);
        PanelEstado7.setLayout(PanelEstado7Layout);
        PanelEstado7Layout.setHorizontalGroup(
            PanelEstado7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );
        PanelEstado7Layout.setVerticalGroup(
            PanelEstado7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(PanelEstado7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 186, 10));

        PanelEstado9.setBackground(new java.awt.Color(255, 255, 255));
        PanelEstado9.setPreferredSize(new java.awt.Dimension(182, 10));

        javax.swing.GroupLayout PanelEstado9Layout = new javax.swing.GroupLayout(PanelEstado9);
        PanelEstado9.setLayout(PanelEstado9Layout);
        PanelEstado9Layout.setHorizontalGroup(
            PanelEstado9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );
        PanelEstado9Layout.setVerticalGroup(
            PanelEstado9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(PanelEstado9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 186, -1));

        PanelEstado4.setBackground(new java.awt.Color(255, 255, 255));
        PanelEstado4.setPreferredSize(new java.awt.Dimension(182, 10));

        javax.swing.GroupLayout PanelEstado4Layout = new javax.swing.GroupLayout(PanelEstado4);
        PanelEstado4.setLayout(PanelEstado4Layout);
        PanelEstado4Layout.setHorizontalGroup(
            PanelEstado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );
        PanelEstado4Layout.setVerticalGroup(
            PanelEstado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(PanelEstado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 186, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void lbl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl1ActionPerformed

        try {
            int tareaid = 1;
            DAOTareas dao = new DAOTareasImpl();
            NoteApp.ShowJpanels(new editarTarea(dao.getTareaById(tareaid)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_lbl1ActionPerformed

    /*
    private void txt1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt1MousePressed
        if (txt1.getText().equalsIgnoreCase("Buscador")) {
            txt1.setText(" ");}    }//GEN-LAST:event_txt1MousePressed
*/
    private void lbl3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl3ActionPerformed

        try {
            int tareaid = 2;
            DAOTareas dao = new DAOTareasImpl();
            NoteApp.ShowJpanels(new editarTarea(dao.getTareaById(tareaid)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_lbl3ActionPerformed

    private void lbl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl2ActionPerformed

        try {
            int tareaid = 3;
            DAOTareas dao = new DAOTareasImpl();
            NoteApp.ShowJpanels(new editarTarea(dao.getTareaById(tareaid)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_lbl2ActionPerformed

    private void lbl8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl8ActionPerformed

        try {
            int tareaid = 4;
            DAOTareas dao = new DAOTareasImpl();
            NoteApp.ShowJpanels(new editarTarea(dao.getTareaById(tareaid)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_lbl8ActionPerformed

    private void lbl6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl6ActionPerformed

        try {
            int tareaid = 5;
            DAOTareas dao = new DAOTareasImpl();
            NoteApp.ShowJpanels(new editarTarea(dao.getTareaById(tareaid)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_lbl6ActionPerformed

    private void lbl7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl7ActionPerformed

        try {
            int tareaid = 6;
            DAOTareas dao = new DAOTareasImpl();
            NoteApp.ShowJpanels(new editarTarea(dao.getTareaById(tareaid)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_lbl7ActionPerformed

    private void lbl5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl5ActionPerformed

        try {
            int tareaid = 7;
            DAOTareas dao = new DAOTareasImpl();
            NoteApp.ShowJpanels(new editarTarea(dao.getTareaById(tareaid)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_lbl5ActionPerformed

    private void lbl9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl9ActionPerformed

        try {
            int tareaid = 8;
            DAOTareas dao = new DAOTareasImpl();
            NoteApp.ShowJpanels(new editarTarea(dao.getTareaById(tareaid)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_lbl9ActionPerformed

    private void lbl10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl10ActionPerformed

        try {
            int tareaid = 9;
            DAOTareas dao = new DAOTareasImpl();
            NoteApp.ShowJpanels(new editarTarea(dao.getTareaById(tareaid)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_lbl10ActionPerformed

    private void txt1MousePressed(java.awt.event.MouseEvent evt) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelEstado;
    private javax.swing.JPanel PanelEstado1;
    private javax.swing.JPanel PanelEstado2;
    private javax.swing.JPanel PanelEstado3;
    private javax.swing.JPanel PanelEstado4;
    private javax.swing.JPanel PanelEstado5;
    private javax.swing.JPanel PanelEstado6;
    private javax.swing.JPanel PanelEstado7;
    private javax.swing.JPanel PanelEstado9;
    private javax.swing.JComboBox<String> comboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton lbl1;
    private javax.swing.JButton lbl10;
    private javax.swing.JButton lbl2;
    private javax.swing.JButton lbl3;
    private javax.swing.JButton lbl5;
    private javax.swing.JButton lbl6;
    private javax.swing.JButton lbl7;
    private javax.swing.JButton lbl8;
    private javax.swing.JButton lbl9;
    private javax.swing.JLabel lblNota1;
    private javax.swing.JLabel lblNota2;
    private javax.swing.JLabel lblNota3;
    private javax.swing.JLabel lblNota4;
    private javax.swing.JLabel lblNota5;
    private javax.swing.JLabel lblNota6;
    private javax.swing.JLabel lblNota7;
    private javax.swing.JLabel lblNota8;
    private javax.swing.JLabel lblNota9;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
