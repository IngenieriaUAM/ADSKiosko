/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.ImageIcon;

/**
 *
 * @author neto
 */
public class CIConsultasPorKiosco extends javax.swing.JFrame {

    /**
     * Creates new form CIConsultasPorKiosco
     */
    public CIConsultasPorKiosco() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/bicycle_icon.jpg")).getIm­age());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jBRegresar = new javax.swing.JButton();
        jBConsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultas: rentas por Kiosco");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 385, 207));

        jBRegresar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jBRegresar.setText("Regresar");
        getContentPane().add(jBRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 140, -1));

        jBConsultar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jBConsultar.setText("Consultar");
        getContentPane().add(jBConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menua.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
