package Interfaz;

import Negocio.CNAlta;
import Negocio.CNBicicleta;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import VO.CVOCliente;
import VO.CVORenta;
import Negocio.CNRenta;
import VO.CVOBicicleta;
import java.awt.event.ActionEvent;
import java.sql.Date;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class CIRenta extends javax.swing.JFrame {
    
    final int AGREGAR   = 1;
    final int MODIFICAR = 2;
    final int ELIMINAR  = 3;
    ArrayList mListaRenta; //
    CVOCliente mVOCliente;
    CVORenta mVORenta;// 
    int       mOp;           // Operación que se realiza: 1 Agregar, 2 Modificar, 3 Eliminar
    int       mRegSel;       // Renglon seleccionado de la lista
    

    public CIRenta() {
        CVORenta VORenta;
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/bicycle_icon.jpg")).getIm­age());
        java.sql.Date max= new java.sql.Date(Fech().getTime()+63113800000L);
        java.sql.Date min= new java.sql.Date(Fech().getTime()-1262276000000L);
        

    }
     public final Date Fecha(){
      java.util.Date Date=new java.util.Date();
      java.sql.Date resta=new java.sql.Date(Date.getTime());
      return resta; // Devuelve el objeto Date con los nuevos días añadidos
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtIdCliente = new javax.swing.JTextField();
        jTxtNomCliente = new javax.swing.JTextField();
        jLTarjeta = new javax.swing.JLabel();
        jTxtIdBicicleta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jBtnRealizar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RENTA");
        setBounds(new java.awt.Rectangle(300, 300, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel1.setText("IDCliente:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 120, -1));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, -1));

        jTxtIdCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtIdClienteFocusLost(evt);
            }
        });
        jTxtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIdClienteActionPerformed(evt);
            }
        });
        jTxtIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtIdClienteKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtIdClienteKeyPressed(evt);
            }
        });
        jPanel1.add(jTxtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 80, 30));

        jTxtNomCliente.setFocusable(false);
        jTxtNomCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNomClienteKeyTyped(evt);
            }
        });
        jPanel1.add(jTxtNomCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 286, 30));

        jLTarjeta.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLTarjeta.setText("IDBicicleta:");
        jPanel1.add(jLTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, -1));

        jTxtIdBicicleta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtIdBicicletaFocusLost(evt);
            }
        });
        jTxtIdBicicleta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtIdBicicletaKeyTyped(evt);
            }
        });
        jPanel1.add(jTxtIdBicicleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 286, 30));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 75, 110, -1));

        jBtnRealizar.setBackground(new java.awt.Color(0, 0, 0));
        jBtnRealizar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jBtnRealizar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnRealizar.setText("Realizar");
        jBtnRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRealizarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnRealizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        jBtnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        jBtnCancelar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jBtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCancelar.setText("Regresar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel3.setText("Tipo de bicicleta:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 286, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menua.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, -8, 510, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 490, 310));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menua.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    private void jTxtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdClienteActionPerformed
*/
    private void jBtnRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRealizarActionPerformed
        CNRenta oNRenta;
        CVORenta oVORenta;
        CNBicicleta oNBicicleta = new CNBicicleta();
        CVOBicicleta oVBicicleta = new CVOBicicleta();
        oNRenta= new CNRenta();
        try {
            oVORenta = new CVORenta(0L,"now()","",Long.parseLong(jTxtIdCliente.getText()),Long.parseLong(jTxtIdBicicleta.getText()),"Rent",1L);
            oVBicicleta = oNBicicleta.buscaBicicleta(oVORenta.getIdBicicleta());
            if(jTxtIdCliente.getText().equals("")||jTxtNomCliente.getText().equals("")||jTxtIdBicicleta.getText().equals(""))
                throw new NumberFormatException();
            if(!oVBicicleta.getStatBicicleta().equals("Disponible"))
                throw new Error();
            oNRenta.setAgregaRenta(oVORenta);
            new CIMenuP().setVisible(true);
            dispose();
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(this,"Error de fecha, el formado debe ser dd/mm/aaaa","Error en Datos", JOptionPane.ERROR_MESSAGE); 
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Se deben de llenar todos los campos","Error en Datos", JOptionPane.ERROR_MESSAGE);           
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this,e.getMessage(),"Error en Datos", JOptionPane.ERROR_MESSAGE);
        }catch (Error e){
            JOptionPane.showMessageDialog(this,"Error, Bicicleta no disponible" ,"Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jBtnRealizarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        Interfaz.CIMenuP mp;
        mp = new CIMenuP();
        this.dispose();
        mp.setVisible(true);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jTxtIdClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtIdClienteKeyTyped
        try{
            if(!Character.isDigit(evt.getKeyChar())&&!Character.isISOControl(evt.getKeyChar())){
                evt.consume();
                throw new Exception("El Identificador es numerico");
        }
        }
        catch(Exception E){
                JOptionPane.showMessageDialog(this,E.getMessage(),null,JOptionPane.ERROR_MESSAGE, null);
                }
        
    }//GEN-LAST:event_jTxtIdClienteKeyTyped

    private void jTxtIdClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtIdClienteKeyPressed
  
    }//GEN-LAST:event_jTxtIdClienteKeyPressed

    private void jTxtNomClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNomClienteKeyTyped
        try{
            if(Character.isDigit(evt.getKeyChar())){
                evt.consume();
             throw new Exception("Solo se permite el ingreso de letras en este campo");
             }
            if(jTxtNomCliente.getText().length()>=45){
                evt.consume();
                throw new Exception("Nombre demasiado largo");
        }
        }
        catch(Exception E){
                JOptionPane.showMessageDialog(this,E.getMessage(),null,JOptionPane.ERROR_MESSAGE, null);
                }    
    }//GEN-LAST:event_jTxtNomClienteKeyTyped

    private void jTxtIdClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtIdClienteFocusLost
        
        CNAlta oNAlta = new CNAlta();
        CVOCliente oVCliente = new CVOCliente();
        try {
            oVCliente = oNAlta.buscaCliente(Long.parseLong(jTxtIdCliente.getText()));
            jTxtNomCliente.setText(oVCliente.getNombreCliente());
            
        } catch (SQLException ex) {
            Logger.getLogger(CIRenta.class.getName()).log(Level.SEVERE, null, ex);
        } catch(NullPointerException npe){
            JOptionPane.showMessageDialog(this, "No existe el cliente","Error",JOptionPane.ERROR_MESSAGE);
        } catch(NumberFormatException nfe){
            
        }
    }//GEN-LAST:event_jTxtIdClienteFocusLost

    private void jTxtIdBicicletaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtIdBicicletaFocusLost
        CNBicicleta oNBicicleta= new CNBicicleta();
        CVOBicicleta oVBicicleta = new CVOBicicleta();
        try {
            oVBicicleta = oNBicicleta.buscaBicicleta(Long.parseLong(jTxtIdBicicleta.getText()));
            jTextField1.setText(oVBicicleta.getTipoBicicleta());
        } catch (SQLException ex) {
            Logger.getLogger(CIRenta.class.getName()).log(Level.SEVERE, null, ex);
        } catch(NullPointerException npe){
            JOptionPane.showMessageDialog(this, "No existe la bicicleta","Error",JOptionPane.ERROR_MESSAGE);
        } catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Error de identificador","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTxtIdBicicletaFocusLost

    private void jTxtIdBicicletaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtIdBicicletaKeyTyped
        
    }//GEN-LAST:event_jTxtIdBicicletaKeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public final Date Fech(){
      java.util.Date Date=new java.util.Date();
      java.sql.Date resta=new java.sql.Date(Date.getTime()-631138000000L);
      return resta; // Devuelve el objeto Date con los nuevos días añadidos
 }
    private void jTxtIdClienteActionPerformed(java.awt.event.ActionEvent evt){
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnRealizar;
    private javax.swing.JLabel jLTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTxtIdBicicleta;
    private javax.swing.JTextField jTxtIdCliente;
    private javax.swing.JTextField jTxtNomCliente;
    // End of variables declaration//GEN-END:variables

}
