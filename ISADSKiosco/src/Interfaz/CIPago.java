package Interfaz;
import Negocio.CNAlta;
import Negocio.CnPago;
import VO.CVOCliente;
import VO.CVOPago;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbnombreCliente.setText("Nombredel cliente:");

        txtFnombreCliente.setEditable(false);

        lbMensualidad.setText("Mensualidad");

        lbMultas.setText("Multas");

        txtFmensualidad.setEditable(false);

        txtFmultas.setEditable(false);

        lbTotal.setText("Total          $");

        txtFtotal.setEditable(false);

        lbidCliente.setText("ID de Cliente: ");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnregresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPagar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbnombreCliente)
                            .addComponent(lbidCliente))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtFidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtFnombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbMensualidad)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFmensualidad, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbMultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbTotal))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFmultas)
                                            .addComponent(txtFtotal))))))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbMensualidad, lbMultas});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbidCliente, lbnombreCliente});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbidCliente)
                    .addComponent(txtFidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnombreCliente)
                    .addComponent(txtFnombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMensualidad)
                    .addComponent(txtFmensualidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMultas)
                    .addComponent(txtFmultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagar)
                    .addComponent(btnregresar))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbMensualidad, lbMultas});

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

  
    private CtblACobro tblMCobro = new CtblACobro();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnregresar;
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

