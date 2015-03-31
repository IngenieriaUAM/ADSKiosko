package Interfaz;

import Interfaz.CIMenuP;
import Negocio.CNinicioSesion;
import VO.CVOUsuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CIinicioSesion extends javax.swing.JFrame {
    CIMenuP ventPr;

    /**
     * Creates new form CIinicioSesion
     */
    public CIinicioSesion() {
        initComponents();
                setIconImage(new ImageIcon(getClass().getResource("/imagenes/bicycle_icon.jpg")).getIm­age());

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLTitulo = new javax.swing.JLabel();
        jLUsuario = new javax.swing.JLabel();
        jLContrasena = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jBSalir = new javax.swing.JButton();
        jBAceptar = new javax.swing.JButton();
        jPFContrasena = new javax.swing.JPasswordField();
        this.setResizable(false);
        this.setLocation(400,200);
        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIO DE SESION");

        jLTitulo.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(0, 102, 102));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Kiosko de Bicicletas");

        jLUsuario.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLUsuario.setText("Usuario:");

        jLContrasena.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLContrasena.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLContrasena.setText("Contraseña:");

        jTFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUsuarioActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBAceptar.setText("Aceptar");
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jBAceptarActionPerformed(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(CIinicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jPFContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFContrasenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(68, 68, 68)
                            .addComponent(jBAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPFContrasena))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPFContrasena)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_jBAceptarActionPerformed
        String usuario, contrasena;
        usuario = jTFUsuario.getText();
        contrasena = jPFContrasena.getText();
        CVOUsuario oCVOUsuario;
        CNinicioSesion oNis = new CNinicioSesion();
        if(usuario.trim().length() == 0 || contrasena.trim().length() ==0)
            JOptionPane.showMessageDialog(this, "Falta usuario o contraseña"
                    + "\nen el campo Usuario", "FALTAN DATOS", JOptionPane.ERROR_MESSAGE);
        else{
            oCVOUsuario=new CVOUsuario(usuario,contrasena);
            
            try{
                if(oNis.hayUsuario(oCVOUsuario)){
                    ventPr=new CIMenuP();
                    ventPr.setVisible(true);
                    dispose();
                }     
                else{
                    JOptionPane.showMessageDialog(this, "Usuario o \ncontraseña invalida", "Error", JOptionPane.ERROR_MESSAGE);
                    jTFUsuario.setText("");
                    jPFContrasena.setText("");
                }
            }catch(NullPointerException npe){
                
            }
            
        }
    }

    
    
    
    private void jPFContrasenaActionPerformed(java.awt.event.ActionEvent evt) {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CIinicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CIinicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CIinicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CIinicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CIinicioSesion().setVisible(true);
            }
        });
    }
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLContrasena;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JPasswordField jPFContrasena;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTFUsuario;

}
