
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
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reporte");

        lbselecciontipoReporte.setText("Tipo de Reporte:");

        cbtipoReporte.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "Robo", "Extravío", "Accidente" }));
        cbtipoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipoReporteActionPerformed(evt);
            }
        });

        lbidRenta.setText("Numero de renta: ");

        txtFidRenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFidRentaActionPerformed(evt);
            }
        });

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbtiporeporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbidBicicleta.setText("ID Bicicleta");

        txtFidBicicleta.setEditable(false);
        txtFidBicicleta.setFocusable(false);

        lbidCliente.setText("ID Cliente");

        txtFidCliente.setEditable(false);
        txtFidCliente.setFocusable(false);

        lbtipoBicicleta.setText("Tipo");

        txtFtipoBicicleta.setEditable(false);
        txtFtipoBicicleta.setFocusable(false);

        txtFnombreCliente.setEditable(false);
        txtFnombreCliente.setFocusable(false);

        lbnombreCliente.setText("Nombre");

        lbDescripcion.setText("Descripción:");

        txtAdescripcion.setColumns(20);
        txtAdescripcion.setRows(5);
        jScrollPane1.setViewportView(txtAdescripcion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(lbtiporeporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbidCliente)
                                .addGap(18, 18, 18)
                                .addComponent(txtFidCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbidBicicleta)
                                .addGap(18, 18, 18)
                                .addComponent(txtFidBicicleta)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbtipoBicicleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbnombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFnombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFtipoBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbDescripcion))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbidBicicleta, lbidCliente, lbnombreCliente, lbtipoBicicleta});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtFnombreCliente, txtFtipoBicicleta});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbtiporeporte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbidBicicleta)
                    .addComponent(txtFidBicicleta)
                    .addComponent(lbtipoBicicleta)
                    .addComponent(txtFtipoBicicleta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbidCliente)
                    .addComponent(txtFidCliente)
                    .addComponent(txtFnombreCliente)
                    .addComponent(lbnombreCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbidBicicleta, lbidCliente, lbnombreCliente, lbtipoBicicleta});

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Limpiar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.setEnabled(false);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbselecciontipoReporte)
                        .addGap(18, 18, 18)
                        .addComponent(cbtipoReporte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lbidRenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFidRenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnImprimir)
                        .addGap(11, 11, 11)
                        .addComponent(btnGuardar)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnGuardar, btnImprimir, btnRegresar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbselecciontipoReporte)
                    .addComponent(cbtipoReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbidRenta)
                    .addComponent(txtFidRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnImprimir)
                    .addComponent(btnRegresar)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnGuardar, btnImprimir, btnRegresar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox cbtipoReporte;
    private javax.swing.JButton jButton1;
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
