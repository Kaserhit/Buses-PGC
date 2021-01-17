package Client;

public class frmMenu extends javax.swing.JFrame {

    public frmMenu() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }
    
    static frmClient frmC = new frmClient();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnView = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Terminal de Buses"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnView.setBackground(new java.awt.Color(0, 102, 102));
        btnView.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("Visualizar Buses");
        btnView.setBorderPainted(false);
        btnView.setFocusable(false);
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        getContentPane().add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 330, 170, 40));

        btnSalir.setBackground(new java.awt.Color(0, 153, 51));
        btnSalir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.setFocusable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 405, 154, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        frmC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        frmLogin m = new frmLogin();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
