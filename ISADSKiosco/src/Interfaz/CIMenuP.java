package Interfaz;

import javax.swing.ImageIcon;

public class CIMenuP extends javax.swing.JFrame {
    CIGestionClientes ventClien;
    CIRenta ventRenta;
    CIPago ventPago;
    CIReportes ventReportes;
    CIDevolucion ventDevol;
    CIConsultas ventConsultas;

    CIMenuP() {
        initComponents();
        this.setLocationRelativeTo(null);
          setIconImage(new ImageIcon(getClass().getResource("/imagenes/bicycle_icon.jpg")).getIm­age());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        btnGestion = new javax.swing.JButton();
        btnDev = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnRenta = new javax.swing.JButton();
        btnPago = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mitGestor = new javax.swing.JMenuItem();
        mitRenta = new javax.swing.JMenuItem();
        mitDev = new javax.swing.JMenuItem();
        mitPago = new javax.swing.JMenuItem();
        mitReportes = new javax.swing.JMenuItem();
        mitSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGestion.setBackground(new java.awt.Color(0, 0, 0));
        btnGestion.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        btnGestion.setForeground(new java.awt.Color(255, 255, 255));
        btnGestion.setText("Gestión de clientes");
        btnGestion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionActionPerformed(evt);
            }
        });
        jPanel1.add(btnGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 320, 80));

        btnDev.setBackground(new java.awt.Color(0, 0, 0));
        btnDev.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        btnDev.setForeground(new java.awt.Color(255, 255, 255));
        btnDev.setText("Devolución de Bicicletas");
        btnDev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevActionPerformed(evt);
            }
        });
        jPanel1.add(btnDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 320, 80));

        btnReportes.setBackground(new java.awt.Color(0, 0, 0));
        btnReportes.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("Reportes");
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        jPanel1.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 310, 80));

        btnRenta.setBackground(new java.awt.Color(0, 0, 0));
        btnRenta.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        btnRenta.setForeground(new java.awt.Color(255, 255, 255));
        btnRenta.setText("Renta de Bicicletas");
        btnRenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 320, 80));

        btnPago.setBackground(new java.awt.Color(0, 0, 0));
        btnPago.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        btnPago.setForeground(new java.awt.Color(255, 255, 255));
        btnPago.setText("Pagos");
        btnPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 310, 80));

        btnConsultas.setBackground(new java.awt.Color(0, 0, 0));
        btnConsultas.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        btnConsultas.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultas.setText("Consultas");
        btnConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 320, 80));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menua.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 590));

        jMenu1.setText("Operaciones");

        mitGestor.setText("Editor de clientes");
        mitGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitGestorActionPerformed(evt);
            }
        });
        jMenu1.add(mitGestor);

        mitRenta.setText("Renta");
        mitRenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitRentaActionPerformed(evt);
            }
        });
        jMenu1.add(mitRenta);

        mitDev.setText("Devolucion");
        mitDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitDevActionPerformed(evt);
            }
        });
        jMenu1.add(mitDev);

        mitPago.setText("Pago");
        mitPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitPagoActionPerformed(evt);
            }
        });
        jMenu1.add(mitPago);

        mitReportes.setText("Reportes");
        mitReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitReportesActionPerformed(evt);
            }
        });
        jMenu1.add(mitReportes);

        mitSalir.setText("Salir");
        mitSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mitSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acerca de");

        jMenuItem1.setText("Informacion");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        ventReportes=new CIReportes();
        ventReportes.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionActionPerformed
        ventClien=new CIGestionClientes();
        ventClien.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGestionActionPerformed

    private void mitGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitGestorActionPerformed
        ventClien=new CIGestionClientes();
        ventClien.setVisible(true);
        dispose();
    }//GEN-LAST:event_mitGestorActionPerformed

    private void btnRentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentaActionPerformed
        ventRenta=new CIRenta();
        ventRenta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRentaActionPerformed

    private void mitRentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitRentaActionPerformed
        ventRenta=new CIRenta();
        ventRenta.setVisible(true);
        dispose();
    }//GEN-LAST:event_mitRentaActionPerformed

    private void btnDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevActionPerformed
        ventDevol = new CIDevolucion();
        //ventDevol=new CIDevolucion();
        ventDevol.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDevActionPerformed

    private void mitDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitDevActionPerformed
       
        ventDevol = new CIDevolucion();
        ventDevol.setVisible(true);
        dispose();
    }//GEN-LAST:event_mitDevActionPerformed

    private void btnPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoActionPerformed
        ventPago=new CIPago();
        ventPago.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPagoActionPerformed

    private void mitPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitPagoActionPerformed
        ventPago=new CIPago();
        ventPago.setVisible(true);
        dispose();
    }//GEN-LAST:event_mitPagoActionPerformed

    private void mitReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitReportesActionPerformed
        ventReportes=new CIReportes();
        ventReportes.setVisible(true);
        dispose();
    }//GEN-LAST:event_mitReportesActionPerformed

    private void mitSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mitSalirActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        ventConsultas = new CIConsultas();
        ventConsultas.setVisible(true);
    }//GEN-LAST:event_btnConsultasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnDev;
    private javax.swing.JButton btnGestion;
    private javax.swing.JButton btnPago;
    private javax.swing.JButton btnRenta;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mitDev;
    private javax.swing.JMenuItem mitGestor;
    private javax.swing.JMenuItem mitPago;
    private javax.swing.JMenuItem mitRenta;
    private javax.swing.JMenuItem mitReportes;
    private javax.swing.JMenuItem mitSalir;
    // End of variables declaration//GEN-END:variables
}
