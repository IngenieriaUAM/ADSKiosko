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
          setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.jpg")).getIm­age());
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

        btnGestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gestion.jpg"))); // NOI18N
        btnGestion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gestion.jpg"))); // NOI18N
        btnGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionActionPerformed(evt);
            }
        });

        btnDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Devolucion.jpg"))); // NOI18N
        btnDev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevActionPerformed(evt);
            }
        });

        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.jpg"))); // NOI18N
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        btnRenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/renta.jpg"))); // NOI18N
        btnRenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentaActionPerformed(evt);
            }
        });

        btnPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pago.jpg"))); // NOI18N
        btnPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoActionPerformed(evt);
            }
        });

        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultas.jpg"))); // NOI18N
        btnConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.jpg"))); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/kioscomenu1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnDev, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(btnPago, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(btnRenta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btnDev, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btnPago, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnRenta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
