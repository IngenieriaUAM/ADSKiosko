package Interfaz;

import Negocio.CNConsultaMembresia;
import VO.CVOConsultaMembresia;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author J o C e L y N
 */
public class CIConsultaMembresia extends javax.swing.JFrame {

    /**
     * Creates new form CIConsultaMembresia
     */
    public CIConsultaMembresia() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/bicycle_icon.jpg")).getIm­age());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIdUsuario = new javax.swing.JLabel();
        txtFidUsuario = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lbNombre = new javax.swing.JLabel();
        txtFnombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        lbRentas = new javax.swing.JLabel();
        txtFnumRentas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Consulta de Uso de Membresía"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbIdUsuario.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        lbIdUsuario.setText("IDUsuario: ");
        getContentPane().add(lbIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 23));
        getContentPane().add(txtFidUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 46, 30));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 20)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));

        lbNombre.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        lbNombre.setText("Nombre:");
        getContentPane().add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 23));

        txtFnombre.setEditable(false);
        txtFnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtFnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 550, 30));

        jTable1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Bicicleta", "Tipo de Bicicleta", "Fecha de Renta", "Fecha de Devolución"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 567, 162));

        btnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 20)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, -1));

        lbRentas.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        lbRentas.setText("Total de Rentas:");
        getContentPane().add(lbRentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        txtFnumRentas.setEditable(false);
        txtFnumRentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnumRentasActionPerformed(evt);
            }
        });
        getContentPane().add(txtFnumRentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 78, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menua.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            CNConsultaMembresia oNCm = new CNConsultaMembresia();
            ArrayList<CVOConsultaMembresia> oVCm;
            oVCm=oNCm.getListaConsultaMembresia(Long.parseLong(txtFidUsuario.getText()));
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            Object [] kiosco = new Object[4]; 
            txtFnombre.setText(oVCm.get(0).getNombreCliente());
                for(int i=0;i<oVCm.size();i++){
                kiosco[0]=oVCm.get(i).getIdBicicleta();
                kiosco[1]=oVCm.get(i).getTipoBicicleta();
                kiosco[2]=oVCm.get(i).getFechaInicio();
                kiosco[3]=oVCm.get(i).getFechaDev();
                model.addRow(kiosco);
                }
            txtFnumRentas.setText(oVCm.size()+"");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No existe el cliente", "", JOptionPane.INFORMATION_MESSAGE);
            txtFidUsuario.setText("");
            txtFidUsuario.requestFocus();
        }catch (IndexOutOfBoundsException iobe){
            JOptionPane.showMessageDialog(this, "El cliente no tiene rentas aun", "", JOptionPane.INFORMATION_MESSAGE);
            txtFidUsuario.setText("");
            txtFidUsuario.requestFocus();
        }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Id no valido", "Error", JOptionPane.ERROR_MESSAGE);
            txtFidUsuario.setText("");
            txtFidUsuario.requestFocus();
        }
                
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtFnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnombreActionPerformed

    private void txtFnumRentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnumRentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnumRentasActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
         Interfaz.CIConsultas mp;
        mp = new CIConsultas();
        this.dispose();
        mp.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbIdUsuario;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbRentas;
    private javax.swing.JTextField txtFidUsuario;
    private javax.swing.JTextField txtFnombre;
    private javax.swing.JTextField txtFnumRentas;
    // End of variables declaration//GEN-END:variables
}
