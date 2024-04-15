/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.Color;

/**
 *
 * @author elava
 */
public final class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    int xMouse, yMouse;

    public login() {
        initComponents();
        setResizable(false);
        setTitle("Login");
        intcomponent();
    }

    public void intcomponent() {
        lbl0.setForeground(Color.black);
        lbl1.setForeground(Color.black);
        lbl2.setForeground(Color.black);
        lbl4.setForeground(Color.black);
        
         usertexto.putClientProperty("JTextField.placeholderText", "Ingresa tu Username");
         passtxt.putClientProperty("JTextField.placeholderText", "Ingresa tu contraseña");
         
         usertexto.setBackground(Color.white);
         passtxt.setBackground(Color.white);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl0 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        usertexto = new javax.swing.JTextField();
        passtxt = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JPanel();
        logintxt = new javax.swing.JLabel();
        headermouse = new javax.swing.JPanel();
        exitbtn = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\elava\\Documents\\NetBeansProjects\\programacion-proyectofinal\\src\\main\\Others resource\\img\\hoja.jpg")); // NOI18N
        bg.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 0, 370, 570));

        lbl4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl4.setText("LOGO");
        bg.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        lbl0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl0.setText("INICIAR SESION");
        bg.add(lbl0, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 330, -1));

        lbl1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl1.setText("USUARIO");
        bg.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        lbl2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl2.setText("PASSWORD");
        bg.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 390, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 390, 10));

        usertexto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usertexto.setForeground(new java.awt.Color(51, 51, 51));
        usertexto.setBorder(null);
        usertexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usertextoMousePressed(evt);
            }
        });
        usertexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertextoActionPerformed(evt);
            }
        });
        bg.add(usertexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 390, -1));

        passtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passtxt.setForeground(new java.awt.Color(51, 51, 51));
        passtxt.setBorder(null);
        passtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passtxtMousePressed(evt);
            }
        });
        bg.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 355, 390, 20));

        loginbtn.setBackground(new java.awt.Color(0, 0, 0));
        loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginbtnMouseEntered(evt);
            }
        });

        logintxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logintxt.setForeground(new java.awt.Color(255, 255, 255));
        logintxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logintxt.setText("Entrar");
        logintxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logintxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logintxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logintxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginbtnLayout = new javax.swing.GroupLayout(loginbtn);
        loginbtn.setLayout(loginbtnLayout);
        loginbtnLayout.setHorizontalGroup(
            loginbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginbtnLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(logintxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        loginbtnLayout.setVerticalGroup(
            loginbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logintxt, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 190, 60));

        headermouse.setBackground(new java.awt.Color(255, 255, 255));
        headermouse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        headermouse.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headermouseMouseDragged(evt);
            }
        });
        headermouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headermouseMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headermouseLayout = new javax.swing.GroupLayout(headermouse);
        headermouse.setLayout(headermouseLayout);
        headermouseLayout.setHorizontalGroup(
            headermouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        headermouseLayout.setVerticalGroup(
            headermouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bg.add(headermouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 520, 40));

        exitbtn.setBackground(new java.awt.Color(255, 255, 255));
        exitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbtnMouseClicked(evt);
            }
        });

        exit.setFont(new java.awt.Font("Book Antiqua", 1, 48)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setToolTipText("");
        exit.setPreferredSize(new java.awt.Dimension(40, 40));
        exit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                exitMouseDragged(evt);
            }
        });
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout exitbtnLayout = new javax.swing.GroupLayout(exitbtn);
        exitbtn.setLayout(exitbtnLayout);
        exitbtnLayout.setHorizontalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitbtnLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        exitbtnLayout.setVerticalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitbtnLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usertextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertextoActionPerformed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed

    }//GEN-LAST:event_exitMousePressed

    private void exitMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseDragged

    }//GEN-LAST:event_exitMouseDragged

    private void headermouseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headermouseMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headermouseMousePressed

    private void headermouseMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headermouseMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headermouseMouseDragged

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseClicked
    }//GEN-LAST:event_exitbtnMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exitbtn.setBackground(Color.red);
        exitbtn.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exitbtn.setBackground(Color.white);
        exitbtn.setForeground(Color.black);

    }//GEN-LAST:event_exitMouseExited

    private void loginbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_loginbtnMouseEntered

    private void logintxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logintxtMouseEntered
        loginbtn.setBackground(Color.gray);
    }//GEN-LAST:event_logintxtMouseEntered

    private void logintxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logintxtMouseExited
        loginbtn.setBackground(Color.black);
    }//GEN-LAST:event_logintxtMouseExited

    private void usertextoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertextoMousePressed
/*
      if (usertexto.getText().equals("Ingrese su nombre de usuario")) {
          usertexto.setText("");
           usertexto.setForeground(Color.black);
        }
       if (String.valueOf(passtxt.getPassword()).isEmpty()) {
          passtxt.setText("********");
          passtxt.setForeground(Color.gray);
        }*/
    }//GEN-LAST:event_usertextoMousePressed

    private void passtxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passtxtMousePressed
     /*  if (String.valueOf(passtxt.getPassword()).equals("Ingrese su contraseña")) {
          passtxt.setText("");
          passtxt.setForeground(Color.black);
        }
       if (usertexto.getText().isEmpty()) {
           usertexto.setText("Ingrese su nombre de usuario");
           usertexto.setForeground(Color.gray);
        }*/
    }//GEN-LAST:event_passtxtMousePressed

    private void logintxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logintxtMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Intento de login con los datos:\nUsuario: " + usertexto.getText() + "\nContraseña: " + String.valueOf(passtxt.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
     }//GEN-LAST:event_logintxtMouseClicked

    private void loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseClicked
    }//GEN-LAST:event_loginbtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMaterialLighterIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JPanel headermouse;
    private javax.swing.JLabel icon;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl0;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl4;
    private javax.swing.JPanel loginbtn;
    private javax.swing.JLabel logintxt;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JTextField usertexto;
    // End of variables declaration//GEN-END:variables
}
