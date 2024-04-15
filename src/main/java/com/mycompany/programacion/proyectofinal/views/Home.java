package com.mycompany.programacion.proyectofinal.views;

import ImplementacionDAO.DAOTareasImpl;
import com.mycompany.programacion.proyectofinal.NoteApp;
import com.mycompany.programacion.proyectofinal.interfaces.DAOTareas;
import com.mycompany.programacion.proyectofinal.moldels.Tareas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.List;

public class Home extends javax.swing.JPanel {

    Tareas tarea;

    public Home() {
        initComponents();
        intComponents();
        //this.setLocationRelativeTo(this);
        actualizarNotas();
        actualizarEstados();

    }

    public void intComponents() {
        //Labels

        btnVer.setForeground(Color.black);
        lbl2.setForeground(Color.black);
        //delete.setForeground(Color.black);
        lbl4.setForeground(Color.black);
        lbl5.setForeground(Color.black);
        lblNota1.setForeground(Color.black);
        lblNota2.setForeground(Color.black);
        lblNota3.setForeground(Color.black);
        lblNota4.setForeground(Color.black);
        //comboBox
        comboBox1.setForeground(Color.BLACK);

        //text
        txt1.putClientProperty("JTextField.placeholderText", "Buscar tarea");
        txt1.setBackground(Color.white);
        txt1.setForeground(Color.black);
    }

 public  void actualizarNotas() {
    try {
        // Obtener la tarea 1
        int tareaId1 = 1;
        DAOTareas dao = new DAOTareasImpl();
        Tareas tarea1 = dao.getTareaById(tareaId1);

        // Actualizar el texto de lblNota1 con el título de la tarea 1
        if (tarea1.getTitulo().isEmpty()) {
            lblNota1.setText("Sin titulo");
        } else {
            lblNota1.setText(tarea1.getTitulo());
        }

        // Obtener la tarea 2
        int tareaId2 = 2;
        Tareas tarea2 = dao.getTareaById(tareaId2);

        // Actualizar el texto de lblNota2 con el título de la tarea 2
        if (tarea2.getTitulo().isEmpty()) {
            lblNota2.setText("Sin titulo");
        } else {
            lblNota2.setText(tarea2.getTitulo());
        }

        // Obtener la tarea 3
        int tareaId3 = 3;
        Tareas tarea3 = dao.getTareaById(tareaId3);

        // Actualizar el texto de lblNota3 con el título de la tarea 3
        if (tarea3.getTitulo().isEmpty()) {
            lblNota3.setText("Sin titulo");
        } else {
            lblNota3.setText(tarea3.getTitulo());
        }

        // Obtener la tarea 4
        int tareaId4 = 4;
        Tareas tarea4 = dao.getTareaById(tareaId4);

        // Actualizar el texto de lblNota4 con el título de la tarea 4
        if (tarea4.getTitulo().isEmpty()) {
            lblNota4.setText("Sin titulo");
        } else {
            lblNota4.setText(tarea4.getTitulo());
        }

    } catch (Exception e) {
        System.out.println("Error al actualizar notas: " + e.getMessage());
    }
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

        } catch (Exception e) {
            System.out.println("Error al actualizar estados: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl11 = new javax.swing.JLabel();
        comboBox1 = new javax.swing.JComboBox<>();
        lbl12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbl2 = new javax.swing.JButton();
        lblNota3 = new javax.swing.JLabel();
        btnSave11 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnVer = new javax.swing.JButton();
        lblNota1 = new javax.swing.JLabel();
        btnSave14 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lbl4 = new javax.swing.JButton();
        lblNota2 = new javax.swing.JLabel();
        btnSave13 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lbl5 = new javax.swing.JButton();
        lblNota4 = new javax.swing.JLabel();
        btnSave12 = new javax.swing.JButton();
        lbl10 = new javax.swing.JLabel();
        PanelEstado = new javax.swing.JPanel();
        PanelEstado1 = new javax.swing.JPanel();
        PanelEstado2 = new javax.swing.JPanel();
        PanelEstado3 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl11.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        lbl11.setText("Filtrar");
        jPanel1.add(lbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 40, 20));

        comboBox1.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        comboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha", "Estado", "Orden Alfabetico" }));
        jPanel1.add(comboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 160, -1));

        lbl12.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        lbl12.setText("Lista de tareas");
        jPanel1.add(lbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        lbl13.setIcon(new javax.swing.ImageIcon("C:\\Users\\elava\\Documents\\NetBeansProjects\\programacion-proyectofinal\\src\\main\\Others resource\\img\\magnifying-glass.png")); // NOI18N
        jPanel1.add(lbl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 30, 30));

        txt1.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        txt1.setText(" ");
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

        lblNota3.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        lblNota3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota3.setText("Nota3");

        btnSave11.setBackground(new java.awt.Color(255, 204, 204));
        btnSave11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSave11.setBorderPainted(false);
        btnSave11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSave11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(lbl2)
                .addContainerGap())
            .addComponent(lblNota3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(lblNota3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSave11)
                    .addComponent(lbl2))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 230, 110));

        jPanel3.setBackground(new java.awt.Color(229, 239, 248));

        btnVer.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnVer.setText("Ver");
        btnVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        lblNota1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        lblNota1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota1.setText("Nota1");

        btnSave14.setBackground(new java.awt.Color(255, 204, 204));
        btnSave14.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSave14.setBorderPainted(false);
        btnSave14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSave14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(btnVer))
                    .addComponent(lblNota1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(lblNota1)
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSave14)
                    .addComponent(btnVer))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 230, 110));

        jPanel7.setBackground(new java.awt.Color(229, 239, 248));

        lbl4.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        lbl4.setText("Ver");
        lbl4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl4ActionPerformed(evt);
            }
        });

        lblNota2.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        lblNota2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota2.setText("Nota2");

        btnSave13.setBackground(new java.awt.Color(255, 204, 204));
        btnSave13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSave13.setBorderPainted(false);
        btnSave13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNota2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnSave13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(lbl4)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(lblNota2)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl4)
                    .addComponent(btnSave13))
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 230, 110));

        jPanel6.setBackground(new java.awt.Color(229, 239, 248));

        lbl5.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        lbl5.setText("Ver");
        lbl5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl5ActionPerformed(evt);
            }
        });

        lblNota4.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        lblNota4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNota4.setText("Nota4");
        lblNota4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnSave12.setBackground(new java.awt.Color(255, 204, 204));
        btnSave12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSave12.setBorderPainted(false);
        btnSave12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNota4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnSave12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(lbl5)
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(lblNota4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl5)
                    .addComponent(btnSave12))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 230, 110));

        lbl10.setIcon(new javax.swing.ImageIcon("C:\\Users\\elava\\Documents\\NetBeansProjects\\programacion-proyectofinal\\src\\main\\Others resource\\img\\sort.png")); // NOI18N
        lbl10.setToolTipText("");
        jPanel1.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 20));

        PanelEstado.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelEstadoLayout = new javax.swing.GroupLayout(PanelEstado);
        PanelEstado.setLayout(PanelEstadoLayout);
        PanelEstadoLayout.setHorizontalGroup(
            PanelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        PanelEstadoLayout.setVerticalGroup(
            PanelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(PanelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 230, 10));

        PanelEstado1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelEstado1Layout = new javax.swing.GroupLayout(PanelEstado1);
        PanelEstado1.setLayout(PanelEstado1Layout);
        PanelEstado1Layout.setHorizontalGroup(
            PanelEstado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        PanelEstado1Layout.setVerticalGroup(
            PanelEstado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(PanelEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        PanelEstado2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelEstado2Layout = new javax.swing.GroupLayout(PanelEstado2);
        PanelEstado2.setLayout(PanelEstado2Layout);
        PanelEstado2Layout.setHorizontalGroup(
            PanelEstado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        PanelEstado2Layout.setVerticalGroup(
            PanelEstado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(PanelEstado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        PanelEstado3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelEstado3Layout = new javax.swing.GroupLayout(PanelEstado3);
        PanelEstado3.setLayout(PanelEstado3Layout);
        PanelEstado3Layout.setHorizontalGroup(
            PanelEstado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        PanelEstado3Layout.setVerticalGroup(
            PanelEstado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(PanelEstado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

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

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed

        try {
            int tareaid = 1;
            DAOTareas dao = new DAOTareasImpl();
            NoteApp.ShowJpanels(new editarTarea(dao.getTareaById(tareaid)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_btnVerActionPerformed

    private void lbl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl2ActionPerformed
        try {
            int tareaid = 3;
            DAOTareas dao = new DAOTareasImpl();
            NoteApp.ShowJpanels(new editarTarea(dao.getTareaById(tareaid)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_lbl2ActionPerformed

    private void lbl4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl4ActionPerformed
        try {
            int tareaid = 2;
            DAOTareas dao = new DAOTareasImpl();
            NoteApp.ShowJpanels(new editarTarea(dao.getTareaById(tareaid)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_lbl4ActionPerformed

    private void lbl5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl5ActionPerformed
        try {
            int tareaid = 4;
            DAOTareas dao = new DAOTareasImpl();
            NoteApp.ShowJpanels(new editarTarea(dao.getTareaById(tareaid)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_lbl5ActionPerformed

    private void btnSave12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSave12ActionPerformed

    private void btnSave13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSave13ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt1MousePressed
        if (txt1.getText().equalsIgnoreCase("Buscador")) {

        }
    }//GEN-LAST:event_txt1MousePressed

    private void btnSave11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSave11ActionPerformed

    private void btnSave14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSave14ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelEstado;
    private javax.swing.JPanel PanelEstado1;
    private javax.swing.JPanel PanelEstado2;
    private javax.swing.JPanel PanelEstado3;
    private javax.swing.JButton btnSave11;
    private javax.swing.JButton btnSave12;
    private javax.swing.JButton btnSave13;
    private javax.swing.JButton btnSave14;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> comboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JButton lbl2;
    private javax.swing.JButton lbl4;
    private javax.swing.JButton lbl5;
    private javax.swing.JLabel lblNota1;
    private javax.swing.JLabel lblNota2;
    private javax.swing.JLabel lblNota3;
    private javax.swing.JLabel lblNota4;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setLocationRelativeTo(Home aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
