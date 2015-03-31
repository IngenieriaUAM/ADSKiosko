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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CIDevolucion extends javax.swing.JFrame {
    CDDAOFactory bd;
    DefaultTableModel modelo;

    public CIDevolucion() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/bicycle_icon.jpg")).getIm­age());
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 99, 30));

        idBicicleta.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        idBicicleta.setText("IDBicicleta:");
        getContentPane().add(idBicicleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 24, -1, -1));

        buscar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        registrar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        registrar.setText("Registrar Devolucion");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        imprimir.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        imprimir.setText("Imprimir Ticket");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });
        getContentPane().add(imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

        regresar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel2.setText("IDRenta:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 78, 110, -1));

        txtFidRenta.setEditable(false);
        txtFidRenta.setText(" ");
        txtFidRenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFidRentaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFidRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 99, 30));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel3.setText("IDCliente:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, -1));

        txtFmulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFmultaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFmulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 99, 30));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, -1));

        txtFnombreCliente.setEditable(false);
        getContentPane().add(txtFnombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 306, 30));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel5.setText("IDBicicleta:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        txtFidBicicleta.setEditable(false);
        getContentPane().add(txtFidBicicleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 70, 30));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel6.setText("Multa:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, -1));

        txtFidCliente.setEditable(false);
        getContentPane().add(txtFidCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 99, 30));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel7.setText("Tipo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 55, -1));

        txtFtipoBicicleta.setEditable(false);
        getContentPane().add(txtFtipoBicicleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 159, 30));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menua.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 360));

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
            System.out.println(oVBicicleta.getStatBicicleta().equals("Rentada"));
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
            new CIMenuP().setVisible(true);
            dispose();
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

    private void txtFmultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFmultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFmultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField id;
    private javax.swing.JLabel idBicicleta;
    private javax.swing.JButton imprimir;
    private javax.swing.JLabel jLabel1;
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
