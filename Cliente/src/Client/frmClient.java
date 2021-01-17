package Client;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class frmClient extends javax.swing.JFrame implements Runnable{

    static Socket sc;
    static DataInputStream in;
    static DataOutputStream out;

    //Puerto y Host del servidor
    static final String HOST = "127.0.0.1";
    static final int PUERTO = 5000;
    
    static boolean Bus1 = false;
    static boolean Bus2 = false;
    static boolean Bus3 = false;
    static boolean Bus4 = false;
    static boolean Bus5 = false;
    
    public frmClient() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        lbBus1.setVisible(false);
        lbBus2.setVisible(false);
        lbBus3.setVisible(false);
        lbBus4.setVisible(false);
        lbBus5.setVisible(false);
        
        Thread Cliente = new Thread(this);
        Cliente.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbImage = new javax.swing.JLabel();
        lbTittle = new javax.swing.JLabel();
        lbP1 = new javax.swing.JLabel();
        lbP2 = new javax.swing.JLabel();
        lbP3 = new javax.swing.JLabel();
        lbP4 = new javax.swing.JLabel();
        lbP5 = new javax.swing.JLabel();
        lbP6 = new javax.swing.JLabel();
        lbP7 = new javax.swing.JLabel();
        lbP8 = new javax.swing.JLabel();
        lbP9 = new javax.swing.JLabel();
        lbP10 = new javax.swing.JLabel();
        btnBus1 = new javax.swing.JButton();
        btnBus2 = new javax.swing.JButton();
        btnBus3 = new javax.swing.JButton();
        btnBus4 = new javax.swing.JButton();
        btnBus5 = new javax.swing.JButton();
        lbBus1 = new javax.swing.JLabel();
        lbBus2 = new javax.swing.JLabel();
        lbBus3 = new javax.swing.JLabel();
        lbBus4 = new javax.swing.JLabel();
        lbBus5 = new javax.swing.JLabel();
        btnAllInformation = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(28, 32, 67));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Proyecto Peri_2.png"))); // NOI18N
        lbImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbImage.setFocusable(false);
        jPanel1.add(lbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 380));

        lbTittle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbTittle.setForeground(new java.awt.Color(253, 189, 91));
        lbTittle.setText("Recorrido de Buses");
        jPanel1.add(lbTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        lbP1.setBackground(java.awt.Color.white);
        lbP1.setOpaque(true);
        jPanel1.add(lbP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 20, 20));

        lbP2.setBackground(java.awt.Color.white);
        lbP2.setOpaque(true);
        jPanel1.add(lbP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 30, 30));

        lbP3.setBackground(java.awt.Color.white);
        lbP3.setOpaque(true);
        jPanel1.add(lbP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 30, 20));

        lbP4.setBackground(java.awt.Color.white);
        lbP4.setOpaque(true);
        jPanel1.add(lbP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 30, 20));

        lbP5.setBackground(java.awt.Color.white);
        lbP5.setOpaque(true);
        jPanel1.add(lbP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 30, 20));

        lbP6.setBackground(java.awt.Color.white);
        lbP6.setOpaque(true);
        jPanel1.add(lbP6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 30, 20));

        lbP7.setBackground(java.awt.Color.white);
        lbP7.setOpaque(true);
        jPanel1.add(lbP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 40, 30));

        lbP8.setBackground(java.awt.Color.white);
        lbP8.setOpaque(true);
        jPanel1.add(lbP8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 40, 30));

        lbP9.setBackground(java.awt.Color.white);
        lbP9.setOpaque(true);
        jPanel1.add(lbP9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 30, 30));

        lbP10.setBackground(java.awt.Color.white);
        lbP10.setOpaque(true);
        jPanel1.add(lbP10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 30, 20));

        btnBus1.setBackground(new java.awt.Color(0, 0, 0));
        btnBus1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBus1.setForeground(new java.awt.Color(255, 255, 255));
        btnBus1.setText("Bus 1");
        btnBus1.setBorderPainted(false);
        btnBus1.setFocusable(false);
        btnBus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBus1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, -1, -1));

        btnBus2.setBackground(new java.awt.Color(255, 153, 0));
        btnBus2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBus2.setForeground(new java.awt.Color(255, 255, 255));
        btnBus2.setText("Bus 2");
        btnBus2.setBorderPainted(false);
        btnBus2.setFocusable(false);
        btnBus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBus2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, -1, -1));

        btnBus3.setBackground(new java.awt.Color(0, 0, 204));
        btnBus3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBus3.setForeground(new java.awt.Color(255, 255, 255));
        btnBus3.setText("Bus 3");
        btnBus3.setBorderPainted(false);
        btnBus3.setFocusable(false);
        btnBus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBus3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        btnBus4.setBackground(new java.awt.Color(255, 255, 0));
        btnBus4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBus4.setText("Bus 4");
        btnBus4.setBorderPainted(false);
        btnBus4.setFocusable(false);
        btnBus4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBus4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBus4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, -1, -1));

        btnBus5.setBackground(new java.awt.Color(0, 153, 51));
        btnBus5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBus5.setForeground(new java.awt.Color(255, 255, 255));
        btnBus5.setText("Bus 5");
        btnBus5.setBorderPainted(false);
        btnBus5.setFocusable(false);
        btnBus5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBus5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBus5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, -1, -1));

        lbBus1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbBus1.setForeground(new java.awt.Color(253, 189, 91));
        lbBus1.setText("Bus 1: Cargando informacion...");
        jPanel1.add(lbBus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, 20));

        lbBus2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbBus2.setForeground(new java.awt.Color(253, 189, 91));
        lbBus2.setText("Bus 2: Cargando informacion...");
        jPanel1.add(lbBus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, 20));

        lbBus3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbBus3.setForeground(new java.awt.Color(253, 189, 91));
        lbBus3.setText("Bus 3: Cargando informacion...");
        jPanel1.add(lbBus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, -1, 20));

        lbBus4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbBus4.setForeground(new java.awt.Color(253, 189, 91));
        lbBus4.setText("Bus 4: Cargando informacion...");
        jPanel1.add(lbBus4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, -1, 20));

        lbBus5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbBus5.setForeground(new java.awt.Color(253, 189, 91));
        lbBus5.setText("Bus 5: Cargando informacion...");
        jPanel1.add(lbBus5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, -1, 20));

        btnAllInformation.setBackground(new java.awt.Color(0, 153, 102));
        btnAllInformation.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAllInformation.setForeground(new java.awt.Color(255, 255, 255));
        btnAllInformation.setText("Mostrar Toda la Informacion");
        btnAllInformation.setBorderPainted(false);
        btnAllInformation.setFocusable(false);
        btnAllInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllInformationActionPerformed(evt);
            }
        });
        jPanel1.add(btnAllInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Anotación 2019-12-18 230200.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Anotación 2019-12-18 230200.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Anotación 2019-12-18 230200.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Anotación 2019-12-18 230200.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Anotación 2019-12-18 230200.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Anotación 2019-12-18 230200.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/a_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 0, 370, 340));

        btnSalir.setBackground(new java.awt.Color(0, 102, 102));
        btnSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.setFocusable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 400, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBus1ActionPerformed
        Bus1 = true;  lbBus1.setVisible(true);
        Bus2 = false; lbBus2.setVisible(false);
        Bus3 = false; lbBus3.setVisible(false);
        Bus4 = false; lbBus4.setVisible(false);
        Bus5 = false; lbBus5.setVisible(false);
    }//GEN-LAST:event_btnBus1ActionPerformed

    private void btnBus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBus2ActionPerformed
        Bus2 = true;  lbBus2.setVisible(true);
        Bus1 = false; lbBus1.setVisible(false);
        Bus3 = false; lbBus3.setVisible(false);
        Bus4 = false; lbBus4.setVisible(false);
        Bus5 = false; lbBus5.setVisible(false);
    }//GEN-LAST:event_btnBus2ActionPerformed

    private void btnBus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBus3ActionPerformed
        Bus3 = true;  lbBus3.setVisible(true);
        Bus1 = false; lbBus1.setVisible(false);
        Bus2 = false; lbBus2.setVisible(false);
        Bus4 = false; lbBus4.setVisible(false);
        Bus5 = false; lbBus5.setVisible(false);
    }//GEN-LAST:event_btnBus3ActionPerformed

    private void btnBus4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBus4ActionPerformed
        Bus4 = true;  lbBus4.setVisible(true);
        Bus1 = false; lbBus1.setVisible(false);
        Bus2 = false; lbBus2.setVisible(false);
        Bus3 = false; lbBus3.setVisible(false);
        Bus5 = false; lbBus5.setVisible(false);
    }//GEN-LAST:event_btnBus4ActionPerformed

    private void btnBus5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBus5ActionPerformed
        Bus5 = true;  lbBus5.setVisible(true);
        Bus1 = false; lbBus1.setVisible(false);
        Bus2 = false; lbBus2.setVisible(false);
        Bus3 = false; lbBus3.setVisible(false);
        Bus4 = false; lbBus4.setVisible(false);
    }//GEN-LAST:event_btnBus5ActionPerformed

    private void btnAllInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllInformationActionPerformed
        if (btnAllInformation.getText().equals("Mostrar Toda la Informacion")) {
            Bus1 = true;  lbBus1.setVisible(true);
            Bus2 = true; lbBus2.setVisible(true);
            Bus3 = true; lbBus3.setVisible(true);
            Bus4 = true; lbBus4.setVisible(true);
            Bus5 = true; lbBus5.setVisible(true);
            
            btnAllInformation.setText("Ocultar Toda la Informacion");
            
        }else if (btnAllInformation.getText().equals("Ocultar Toda la Informacion")) {
            Bus1 = false;  lbBus1.setVisible(false);
            Bus2 = false; lbBus2.setVisible(false);
            Bus3 = false; lbBus3.setVisible(false);
            Bus4 = false; lbBus4.setVisible(false);
            Bus5 = false; lbBus5.setVisible(false);
            
            btnAllInformation.setText("Mostrar Toda la Informacion");
        }
    }//GEN-LAST:event_btnAllInformationActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Bus1 = false; lbBus1.setVisible(false);
        Bus2 = false; lbBus2.setVisible(false);
        Bus3 = false; lbBus3.setVisible(false);
        Bus4 = false; lbBus4.setVisible(false);
        Bus5 = false; lbBus5.setVisible(false);
        
        frmMenu fm = new frmMenu();
        fm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void Filter(String msg, boolean Bus1, boolean Bus2, boolean Bus3, boolean Bus4, boolean Bus5) {
        if (msg.startsWith("Bus 1") && Bus1 == true) {
            lbBus1.setText("");
            lbBus1.setText(msg);
        }
        if (msg.startsWith("Bus 2") && Bus2 == true) {
            lbBus2.setText("");
            lbBus2.setText(msg);
        }
        if (msg.startsWith("Bus 3") && Bus3 == true) {
            lbBus3.setText("");
            lbBus3.setText(msg);
        }
        if (msg.startsWith("Bus 4") && Bus4 == true) {
            lbBus4.setText("");
            lbBus4.setText(msg);
        }
        if (msg.startsWith("Bus 5") && Bus5 == true) {
            lbBus5.setText("");
            lbBus5.setText(msg);
        }
    }

    public static void ChangeColorLabels(String label) {

        if (label.startsWith("Bus") && label.endsWith("Obrero")) {
            lbP10.setBackground(Color.WHITE);
            if (label.startsWith("Bus 1")  && Bus1 == true) {
                lbP1.setBackground(Color.BLACK);
            }
            if (label.startsWith("Bus 2") && Bus2 == true) {
                lbP1.setBackground(Color.ORANGE);
            }
            if (label.startsWith("Bus 3") && Bus3 == true) {
                lbP1.setBackground(Color.BLUE);
            }
            if (label.startsWith("Bus 4") && Bus4 == true) {
                lbP1.setBackground(Color.YELLOW);
            }
            if (label.startsWith("Bus 5") && Bus5 == true) {
                lbP1.setBackground(Color.GREEN);
            }
        }
        if (label.startsWith("Bus") && label.endsWith("Hacienda")) {
            lbP1.setBackground(Color.WHITE);
            if (label.startsWith("Bus 1" ) && Bus1 == true) {
                lbP2.setBackground(Color.BLACK);
            }
            if (label.startsWith("Bus 2") && Bus2 == true) {
                lbP2.setBackground(Color.ORANGE);
            }
            if (label.startsWith("Bus 3") && Bus3 == true) {
                lbP2.setBackground(Color.BLUE);
            }
            if (label.startsWith("Bus 4") && Bus4 == true) {
                lbP2.setBackground(Color.YELLOW);
            }
            if (label.startsWith("Bus 5") && Bus5 == true) {
                lbP2.setBackground(Color.GREEN);
            }
        }
        if (label.startsWith("Bus") && label.endsWith("Mora")) {
            lbP2.setBackground(Color.WHITE);
            if (label.startsWith("Bus 1") && Bus1 == true) {
                lbP3.setBackground(Color.BLACK);
            }
            if (label.startsWith("Bus 2") && Bus2 == true) {
                lbP3.setBackground(Color.ORANGE);
            }
            if (label.startsWith("Bus 3") && Bus3 == true) {
                lbP3.setBackground(Color.BLUE);
            }
            if (label.startsWith("Bus 4") && Bus4 == true) {
                lbP3.setBackground(Color.YELLOW);
            }
            if (label.startsWith("Bus 5") && Bus5 == true) {
                lbP3.setBackground(Color.GREEN);
            }
        }
        if (label.startsWith("Bus") && label.endsWith("ULACIT")) {
            lbP3.setBackground(Color.WHITE);
            if (label.startsWith("Bus 1") && Bus1 == true) {
                lbP4.setBackground(Color.BLACK);
            }
            if (label.startsWith("Bus 2") && Bus2 == true) {
                lbP4.setBackground(Color.ORANGE);
            }
            if (label.startsWith("Bus 3") && Bus3 == true) {
                lbP4.setBackground(Color.BLUE);
            }
            if (label.startsWith("Bus 4") && Bus4 == true) {
                lbP4.setBackground(Color.YELLOW);
            }
            if (label.startsWith("Bus 5") && Bus5 == true) {
                lbP4.setBackground(Color.GREEN);
            }
        }
        if (label.startsWith("Bus") && label.endsWith("Betania")) {
            lbP4.setBackground(Color.WHITE);
            if (label.startsWith("Bus 1") && Bus1 == true) {
                lbP5.setBackground(Color.BLACK);
            }
            if (label.startsWith("Bus 2") && Bus2 == true) {
                lbP5.setBackground(Color.ORANGE);
            }
            if (label.startsWith("Bus 3") && Bus3 == true) {
                lbP5.setBackground(Color.BLUE);
            }
            if (label.startsWith("Bus 4") && Bus4 == true) {
                lbP5.setBackground(Color.YELLOW);
            }
            if (label.startsWith("Bus 5") && Bus5 == true) {
                lbP5.setBackground(Color.GREEN);
            }
        }
        if (label.startsWith("Bus") && label.endsWith("Pedro")) {
            lbP5.setBackground(Color.WHITE);
            if (label.startsWith("Bus 1") && Bus1 == true) {
                lbP6.setBackground(Color.BLACK);
            }
            if (label.startsWith("Bus 2") && Bus2 == true) {
                lbP6.setBackground(Color.ORANGE);
            }
            if (label.startsWith("Bus 3") && Bus3 == true) {
                lbP6.setBackground(Color.BLUE);
            }
            if (label.startsWith("Bus 4") && Bus4 == true) {
                lbP6.setBackground(Color.YELLOW);
            }
            if (label.startsWith("Bus 5") && Bus5 == true) {
                lbP6.setBackground(Color.GREEN);
            }
        }
        if (label.startsWith("Bus") && label.endsWith("Cascajal")) {
            lbP6.setBackground(Color.WHITE);
            if (label.startsWith("Bus 1") && Bus1 == true) {
                lbP7.setBackground(Color.BLACK);
            }
            if (label.startsWith("Bus 2") && Bus2 == true) {
                lbP7.setBackground(Color.ORANGE);
            }
            if (label.startsWith("Bus 3") && Bus3 == true) {
                lbP7.setBackground(Color.BLUE);
            }
            if (label.startsWith("Bus 4") && Bus4 == true) {
                lbP7.setBackground(Color.YELLOW);
            }
            if (label.startsWith("Bus 5") && Bus5 == true) {
                lbP7.setBackground(Color.GREEN);
            }
        }
        if (label.startsWith("Bus") && label.endsWith("Outlet")) {
            lbP7.setBackground(Color.WHITE);
            if (label.startsWith("Bus 1") && Bus1 == true) {
                lbP8.setBackground(Color.BLACK);
            }
            if (label.startsWith("Bus 2") && Bus2 == true) {
                lbP8.setBackground(Color.ORANGE);
            }
            if (label.startsWith("Bus 3") && Bus3 == true) {
                lbP8.setBackground(Color.BLUE);
            }
            if (label.startsWith("Bus 4") && Bus4 == true) {
                lbP8.setBackground(Color.YELLOW);
            }
            if (label.startsWith("Bus 5") && Bus5 == true) {
                lbP8.setBackground(Color.GREEN);
            }
        }
        if (label.startsWith("Bus") && label.endsWith("Cervantes")) {
            lbP8.setBackground(Color.WHITE);
            if (label.startsWith("Bus 1") && Bus1 == true) {
                lbP9.setBackground(Color.BLACK);
            }
            if (label.startsWith("Bus 2") && Bus2 == true) {
                lbP9.setBackground(Color.ORANGE);
            }
            if (label.startsWith("Bus 3") && Bus3 == true) {
                lbP9.setBackground(Color.BLUE);
            }
            if (label.startsWith("Bus 4") && Bus4 == true) {
                lbP9.setBackground(Color.YELLOW);
            }
            if (label.startsWith("Bus 5") && Bus5 == true) {
                lbP9.setBackground(Color.GREEN);
            }
        }
        if (label.startsWith("Bus") && label.endsWith("Hatillo")) {
            lbP9.setBackground(Color.WHITE);
            if (label.startsWith("Bus 1") && Bus1 == true) {
                lbP10.setBackground(Color.BLACK);
            }
            if (label.startsWith("Bus 2") && Bus2 == true) {
                lbP10.setBackground(Color.ORANGE);
            }
            if (label.startsWith("Bus 3") && Bus3 == true) {
                lbP10.setBackground(Color.BLUE);
            }
            if (label.startsWith("Bus 4") && Bus4 == true) {
                lbP10.setBackground(Color.YELLOW);
            }
            if (label.startsWith("Bus 5") && Bus5 == true) {
                lbP10.setBackground(Color.GREEN);
            }
        }
        lbImage.hide();
        lbImage.show();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllInformation;
    private javax.swing.JButton btnBus1;
    private javax.swing.JButton btnBus2;
    private javax.swing.JButton btnBus3;
    private javax.swing.JButton btnBus4;
    private javax.swing.JButton btnBus5;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JLabel lbBus1;
    private static javax.swing.JLabel lbBus2;
    private static javax.swing.JLabel lbBus3;
    private static javax.swing.JLabel lbBus4;
    private static javax.swing.JLabel lbBus5;
    private static javax.swing.JLabel lbImage;
    private static javax.swing.JLabel lbP1;
    private static javax.swing.JLabel lbP10;
    private static javax.swing.JLabel lbP2;
    private static javax.swing.JLabel lbP3;
    private static javax.swing.JLabel lbP4;
    private static javax.swing.JLabel lbP5;
    private static javax.swing.JLabel lbP6;
    private static javax.swing.JLabel lbP7;
    private static javax.swing.JLabel lbP8;
    private static javax.swing.JLabel lbP9;
    private javax.swing.JLabel lbTittle;
    // End of variables declaration//GEN-END:variables

    @Override
    
    public void run() {
        try {
            sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            
            String msg = "";
            String reply = "True";
            
            do {
                out.writeUTF(reply);
                
                msg = in.readUTF();
                if (msg.startsWith("Bus")) {
                    Filter(msg,Bus1,Bus2,Bus3,Bus4,Bus5);
                    ChangeColorLabels(msg);
                }
            } while (!msg.equals("False"));

            if (msg.equals("False")) {
                reply = "False";
                out.writeUTF(reply);
                sc.close();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

}
