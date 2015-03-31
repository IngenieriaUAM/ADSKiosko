
package Interfaz;

import Negocio.CNAlta;
import Negocio.CNBicicleta;
import Negocio.CNRenta;
import Negocio.CNReporte;
import VO.CVOBicicleta;
import VO.CVOCliente;
import VO.CVORenta;
import VO.CVOReporte;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author jonathan
 */
public class CIReportes extends javax.swing.JFrame {

    /**
     * Creates new form CIReportes
     */
    public CIReportes() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/bicycle_icon.jpg")).getIm­age());

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbselecciontipoReporte = new javax.swing.JLabel();
        cbtipoReporte = new javax.swing.JComboBox();
        lbidRenta = new javax.swing.JLabel();
        txtFidRenta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbtiporeporte = new javax.swing.JLabel();
        lbidBicicleta = new javax.swing.JLabel();
        txtFidBicicleta = new javax.swing.JTextField();
        lbidCliente = new javax.swing.JLabel();
        txtFidCliente = new javax.swing.JTextField();
        lbtipoBicicleta = new javax.swing.JLabel();
        txtFtipoBicicleta = new javax.swing.JTextField();
        txtFnombreCliente = new javax.swing.JTextField();
        lbnombreCliente = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdescripcion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reporte");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbselecciontipoReporte.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        lbselecciontipoReporte.setText("Tipo de Reporte:");
        jPanel1.add(lbselecciontipoReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 24, -1, -1));

        cbtipoReporte.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "Robo", "Extravío", "Accidente" }));
        cbtipoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipoReporteActionPerformed(evt);
            }
        });
        jPanel1.add(cbtipoReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 130, -1));

        lbidRenta.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        lbidRenta.setText("Numero de renta: ");
        jPanel1.add(lbidRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, 40));

        txtFidRenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFidRentaActionPerformed(evt);
            }
        });
        jPanel1.add(txtFidRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 50, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 130, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbtiporeporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbtiporeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 21, 587, 30));

        lbidBicicleta.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        lbidBicicleta.setText("ID Bicicleta:");
        jPanel2.add(lbidBicicleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, -1));

        txtFidBicicleta.setEditable(false);
        txtFidBicicleta.setFocusable(false);
        jPanel2.add(txtFidBicicleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 80, 30));

        lbidCliente.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        lbidCliente.setText("ID Cliente:");
        jPanel2.add(lbidCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, -1));

        txtFidCliente.setEditable(false);
        txtFidCliente.setFocusable(false);
        txtFidCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFidClienteActionPerformed(evt);
            }
        });
        jPanel2.add(txtFidCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 80, 30));

        lbtipoBicicleta.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        lbtipoBicicleta.setText("Tipo:");
        jPanel2.add(lbtipoBicicleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 70, -1));

        txtFtipoBicicleta.setEditable(false);
        txtFtipoBicicleta.setFocusable(false);
        jPanel2.add(txtFtipoBicicleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 249, 30));

        txtFnombreCliente.setEditable(false);
        txtFnombreCliente.setFocusable(false);
        txtFnombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnombreClienteActionPerformed(evt);
            }
        });
        jPanel2.add(txtFnombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 249, 30));

        lbnombreCliente.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        lbnombreCliente.setText("Nombre:");
        jPanel2.add(lbnombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 100, -1));

        lbDescripcion.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        lbDescripcion.setText("Descripción:");
        jPanel2.add(lbDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        txtAdescripcion.setColumns(20);
        txtAdescripcion.setRows(5);
        jScrollPane1.setViewportView(txtAdescripcion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 510, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menua.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, -9, 680, 340));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 49, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 130, -1));

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Limpiar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 120, -1));

        btnImprimir.setBackground(new java.awt.Color(0, 0, 0));
        btnImprimir.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setText("Imprimir");
        btnImprimir.setEnabled(false);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel1.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 130, -1));

        btnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menua.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFidRentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFidRentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFidRentaActionPerformed

    private void cbtipoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipoReporteActionPerformed
        // TODO add your handling code here:
        lbtiporeporte.setText("Reporte de "+cbtipoReporte.getSelectedItem().toString());
    }//GEN-LAST:event_cbtipoReporteActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        Interfaz.CIMenuP mp = new CIMenuP();
        mp.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Long idRenta;
        CNRenta oNRenta=new CNRenta();
        CNAlta oNCliente = new CNAlta();
        CNBicicleta oNBici = new CNBicicleta();
        CVOCliente voCliente = new CVOCliente();
        CVOBicicleta voBicicleta = new CVOBicicleta();
        CVORenta vORenta = new CVORenta();
        
        try {
            if(cbtipoReporte.getSelectedItem().equals(""))
                throw new Error();
            idRenta = Long.parseLong(txtFidRenta.getText());
            vORenta=oNRenta.buscaRenta(idRenta);
            voBicicleta=oNBici.buscaBicicleta(vORenta.getIdBicicleta());
            voCliente=oNCliente.buscaCliente(vORenta.getIdCliente());
            txtFidBicicleta.setText(""+voBicicleta.getIdBicicleta());
            txtFidCliente.setText(""+vORenta.getIdCliente());
            txtFtipoBicicleta.setText(""+voBicicleta.getTipoBicicleta());
            txtFnombreCliente.setText(""+voCliente.getNombreCliente());
        } catch (SQLException ex) {
            Logger.getLogger(CIReportes.class.getName()).log(Level.SEVERE, null, ex);
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Inserte un número en el campo", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(Error e){
            JOptionPane.showMessageDialog(this, "Seleccione el tipo de reporte", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(NullPointerException nullpe){
            JOptionPane.showMessageDialog(this, "No existe la renta", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        CVOReporte oVReporte;
        CNReporte oNReporte=new CNReporte();
        int idReporte = 0;
        try {
            idReporte=oNReporte.getIdReporte();
            System.out.println(idReporte);
            oVReporte = new CVOReporte(idReporte,lbtiporeporte.getText(),Long.parseLong(txtFidBicicleta.getText()),txtFtipoBicicleta.getText(),Long.parseLong(txtFidCliente.getText()),txtFnombreCliente.getText(),txtAdescripcion.getText(),"now()",Long.parseLong(txtFidRenta.getText()));
            oNReporte.setAgregaReporte(oVReporte);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Error con la base de datos", "Error",JOptionPane.ERROR_MESSAGE);
        }catch(NumberFormatException nmfe){
            JOptionPane.showMessageDialog(this,"Error en los datos", "Error",JOptionPane.ERROR_MESSAGE);
        }
        limpiarCampos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtFidClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFidClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFidClienteActionPerformed

    private void txtFnombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnombreClienteActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox cbtipoReporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbidBicicleta;
    private javax.swing.JLabel lbidCliente;
    private javax.swing.JLabel lbidRenta;
    private javax.swing.JLabel lbnombreCliente;
    private javax.swing.JLabel lbselecciontipoReporte;
    private javax.swing.JLabel lbtipoBicicleta;
    private javax.swing.JLabel lbtiporeporte;
    private javax.swing.JTextArea txtAdescripcion;
    private javax.swing.JTextField txtFidBicicleta;
    private javax.swing.JTextField txtFidCliente;
    private javax.swing.JTextField txtFidRenta;
    private javax.swing.JTextField txtFnombreCliente;
    private javax.swing.JTextField txtFtipoBicicleta;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        txtFidRenta.setText("");
        txtFidCliente.setText("");
        txtFtipoBicicleta.setText("");
        txtFnombreCliente.setText("");
        txtFidBicicleta.setText("");
        txtAdescripcion.setText("");
        cbtipoReporte.setSelectedIndex(0);
        lbtiporeporte.setText("");
    }
}
