package Interfaz;
import Negocio.CNAlta;
import Negocio.CnPago;
import VO.CVOCliente;
import VO.CVOPago;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Elementary
 */
public class CIPago extends javax.swing.JFrame {

    /**
     * Creates new form CICobro
     */
    public CIPago() {
        initComponents();
          setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.jpg")).getIm­age());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbnombreCliente = new javax.swing.JLabel();
        txtFnombreCliente = new javax.swing.JTextField();
        lbMensualidad = new javax.swing.JLabel();
        lbMultas = new javax.swing.JLabel();
        txtFmensualidad = new javax.swing.JTextField();
        txtFmultas = new javax.swing.JTextField();
        lbTotal = new javax.swing.JLabel();
        txtFtotal = new javax.swing.JTextField();
        lbidCliente = new javax.swing.JLabel();
        txtFidCliente = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbnombreCliente.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        lbnombreCliente.setText("Nombre del cliente:");
        jPanel2.add(lbnombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtFnombreCliente.setEditable(false);
        jPanel2.add(txtFnombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 200, 30));

        lbMensualidad.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        lbMensualidad.setText("Mensualidad:");
        jPanel2.add(lbMensualidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        lbMultas.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        lbMultas.setText("Multas:");
        jPanel2.add(lbMultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 90, -1));

        txtFmensualidad.setEditable(false);
        jPanel2.add(txtFmensualidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 91, 30));

        txtFmultas.setEditable(false);
        txtFmultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFmultasActionPerformed(evt);
            }
        });
        jPanel2.add(txtFmultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 90, 30));

        lbTotal.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        lbTotal.setText("Total          $");
        jPanel2.add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, 20));

        txtFtotal.setEditable(false);
        jPanel2.add(txtFtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 90, 30));

        lbidCliente.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        lbidCliente.setText("ID de Cliente: ");
        jPanel2.add(lbidCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, -1));

        txtFidCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFidClienteActionPerformed(evt);
            }
        });
        jPanel2.add(txtFidCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 57, 30));

        btnBuscar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        btnPagar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        jPanel2.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        btnregresar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menua.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        new CIMenuP().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        CVOCliente oVAlta = new CVOCliente();
        CNAlta oNCliente = new CNAlta();
        try {
            oVAlta=oNCliente.buscaCliente(Long.parseLong(txtFidCliente.getText()));
            txtFnombreCliente.setText(oVAlta.getNombreCliente());
            txtFmensualidad.setText("200");
            txtFmultas.setText("0.0");
            txtFtotal.setText("200");
        } catch (SQLException ex) {
            Logger.getLogger(CIPago.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Intrudusca un número","Error",JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException npe){
            JOptionPane.showMessageDialog(this, "El cliente no existe","Error",JOptionPane.ERROR_MESSAGE);
            limpiaCampos();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        CVOPago oVPago = new CVOPago(1L,Long.parseLong(txtFtotal.getText()),Long.parseLong(txtFidCliente.getText()),txtFnombreCliente.getText());
        CnPago oNPago = new CnPago();
        try {
            if(JOptionPane.showConfirmDialog(this, "Esta seguro de agregar el pago","Confirmar",JOptionPane.YES_NO_OPTION)==0){
                oNPago.setAgregaPago(oVPago);
                limpiaCampos();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error en datos","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void txtFidClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFidClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFidClienteActionPerformed

    private void txtFmultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFmultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFmultasActionPerformed

  
    private CtblACobro tblMCobro = new CtblACobro();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbMensualidad;
    private javax.swing.JLabel lbMultas;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbidCliente;
    private javax.swing.JLabel lbnombreCliente;
    private javax.swing.JTextField txtFidCliente;
    private javax.swing.JTextField txtFmensualidad;
    private javax.swing.JTextField txtFmultas;
    private javax.swing.JTextField txtFnombreCliente;
    private javax.swing.JTextField txtFtotal;
    // End of variables declaration//GEN-END:variables

    private void Actualiza(int i, long parseLong) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void limpiaCampos() {
        txtFidCliente.setText("");
        txtFnombreCliente.setText("");
        txtFtotal.setText("");
        txtFmensualidad.setText("");
        txtFmultas.setText("");
    }
}

