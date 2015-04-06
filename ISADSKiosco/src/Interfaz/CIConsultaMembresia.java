package Interfaz;

import Negocio.CNConsultaMembresia;
import VO.CVOConsultaMembresia;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Consulta de Uso de Membresía"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel1.setText("IDUsuario: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 23));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 46, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 23));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 550, 30));

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

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel5.setText("Total de Rentas:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 78, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menua.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            CNConsultaMembresia oNCm = new CNConsultaMembresia();
            ArrayList<CVOConsultaMembresia> oVCm;
            oVCm=oNCm.getListaConsultaMembresia(Long.parseLong(jTextField1.getText()));
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            Object [] kiosco = new Object[4]; 
            jTextField2.setText(oVCm.get(1).getNombreCliente());
                for(int i=0;i<oVCm.size();i++){
                kiosco[0]=oVCm.get(i).getIdBicicleta();
                kiosco[1]=oVCm.get(i).getTipoBicicleta();
                kiosco[2]=oVCm.get(i).getFechaInicio();
                kiosco[3]=oVCm.get(i).getFechaDev();
                model.addRow(kiosco);
                }
            jTextField3.setText(model.getRowCount()+"");
            
        } catch (SQLException ex) {
            Logger.getLogger(CIConsultaMembresia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Interfaz.CIConsultas mp;
        mp = new CIConsultas();
        this.dispose();
        mp.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
