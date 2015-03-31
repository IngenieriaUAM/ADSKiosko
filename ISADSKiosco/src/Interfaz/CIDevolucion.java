package Interfaz;

import Datos.CDDAOFactory;
import Datos.CDDevolucion;
import Interfaz.CIMenuP;
import Negocio.CNAlta;
import Negocio.CNBicicleta;
import Negocio.CNDevolucion;
import Negocio.CNRenta;
import VO.CVOBicicleta;
import VO.CVOCliente;
import VO.CVODevolucion;
import VO.CVORenta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CIDevolucion extends javax.swing.JFrame {
    CDDAOFactory bd;
    DefaultTableModel modelo;

    public CIDevolucion() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id = new javax.swing.JTextField();
        idBicicleta = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        imprimir = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFidRenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFmulta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFnombreCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFidBicicleta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFidCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFtipoBicicleta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idBicicleta.setText("ID Bicicleta:");

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        registrar.setText("Registrar Devolucion");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        imprimir.setText("Imprimir Ticket");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jLabel2.setText("Id Renta:");

        txtFidRenta.setEditable(false);
        txtFidRenta.setText(" ");
        txtFidRenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFidRentaActionPerformed(evt);
            }
        });

        jLabel3.setText("Id Cliente:");

        jLabel4.setText("Nombre:");

        txtFnombreCliente.setEditable(false);

        jLabel5.setText("Id Bicicleta:");

        txtFidBicicleta.setEditable(false);

        jLabel6.setText("Multa:");

        txtFidCliente.setEditable(false);

        jLabel7.setText("Tipo:");

        txtFtipoBicicleta.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(registrar)
                        .addGap(67, 67, 67)
                        .addComponent(imprimir)
                        .addGap(97, 97, 97)
                        .addComponent(regresar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(idBicicleta))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(buscar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(id)
                                            .addComponent(txtFidRenta, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFidCliente)
                                            .addComponent(txtFmulta))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFidBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFtipoBicicleta))
                                    .addComponent(txtFnombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idBicicleta)
                    .addComponent(buscar))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtFidRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFidBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtFtipoBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtFnombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFmulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar)
                    .addComponent(imprimir)
                    .addComponent(regresar))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtFidBicicleta, txtFidCliente, txtFidRenta, txtFmulta, txtFnombreCliente, txtFtipoBicicleta});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        CNAlta oNAlta = new CNAlta();
        CNBicicleta oNBicicleta = new CNBicicleta();
        CNRenta oNRenta = new CNRenta();
        CVOCliente oVCliente = new CVOCliente();
        CVOBicicleta oVBicicleta = new CVOBicicleta();
        CVORenta oVRenta = new CVORenta();
        try {
            oVBicicleta = oNBicicleta.buscaBicicleta(Long.parseLong(id.getText()));
            System.out.println(oVBicicleta.getIdBicicleta());
            oVRenta = oNRenta.buscaRenta(oVBicicleta.getIdBicicleta());
            if(!oVBicicleta.getStatBicicleta().equals("Rentada"))
                throw new Error();
            oVCliente = oNAlta.buscaCliente(oVRenta.getIdCliente());
            txtFidRenta.setText(""+oVRenta.getIdRenta());
            txtFidBicicleta.setText(oVBicicleta.getIdBicicleta()+"");
            txtFidCliente.setText(oVCliente.getidCliente()+"");
            txtFnombreCliente.setText(oVCliente.getNombreCliente());
            txtFtipoBicicleta.setText(oVBicicleta.getTipoBicicleta());
            txtFmulta.setText("0");
        } catch (SQLException ex) {
            Logger.getLogger(CIDevolucion.class.getName()).log(Level.SEVERE, null, ex);
        } catch(NullPointerException npe){
            id.setText("");
            JOptionPane.showMessageDialog(this, "Bicicleta no rentada", "Error", JOptionPane.ERROR_MESSAGE);
        }catch (Error e){
            id.setText("");
            JOptionPane.showMessageDialog(this, "Ya se registro esa renta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        CVODevolucion oVDevolucion = new CVODevolucion(0L,Long.parseLong(txtFidRenta.getText()),Long.parseLong(txtFidCliente.getText()),Long.parseLong(txtFidBicicleta.getText()),txtFnombreCliente.getText(),"now()","now",0L);
        CNDevolucion oNDevolucion = new CNDevolucion();
        try {
            oNDevolucion.setAgregaDevolucion(oVDevolucion);
        } catch (SQLException ex) {
            Logger.getLogger(CIDevolucion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
    }//GEN-LAST:event_imprimirActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        new CIMenuP().setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void txtFidRentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFidRentaActionPerformed
    }//GEN-LAST:event_txtFidRentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField id;
    private javax.swing.JLabel idBicicleta;
    private javax.swing.JButton imprimir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton registrar;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField txtFidBicicleta;
    private javax.swing.JTextField txtFidCliente;
    private javax.swing.JTextField txtFidRenta;
    private javax.swing.JTextField txtFmulta;
    private javax.swing.JTextField txtFnombreCliente;
    private javax.swing.JTextField txtFtipoBicicleta;
    // End of variables declaration//GEN-END:variables
}
