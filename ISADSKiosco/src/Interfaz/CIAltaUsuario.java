/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;


import Negocio.CNAlta;
import VO.CVOCliente;
import java.awt.Color;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class CIAltaUsuario extends javax.swing.JFrame {
    
    final int AGREGAR   = 1;
    final int MODIFICAR = 2;
    final int ELIMINAR  = 3;
    ArrayList mListaCliente; // Lista con los datos de los alumnos
    CVOCliente mVOCliente;     // VO con el registro seleccionado antes de modificarse o eliminarse
    int       mOp;           // Operación que se realiza: 1 Agregar, 2 Modificar, 3 Eliminar
    int       mRegSel;       // Renglon seleccionado de la lista
    int numClte;
    

    /**
     * 
     */
    public CIAltaUsuario(ArrayList pListaClientes, int pRegSel, int pOp,long pNc) {
        CVOCliente VOAlta;
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/bicycle_icon.jpg")).getIm­age());
        java.sql.Date max= new java.sql.Date(Fecha().getTime()+63113800000L);
        java.sql.Date min= new java.sql.Date(Fecha().getTime()-1262276000000L);
        jDate.setSelectableDateRange(min, max);
        mListaCliente = pListaClientes;
        mOp = pOp;
        mRegSel = pRegSel;
        jTxtidCliente.setEditable(false);
        if (pOp != AGREGAR) {
            VOAlta = (CVOCliente) pListaClientes.get(pRegSel);
            mVOCliente = new CVOCliente(VOAlta.getidCliente(), VOAlta.getNombreCliente(), VOAlta.getFechaNacimiento(),VOAlta.getSexo(),VOAlta.getTarjeta(),VOAlta.getCodigoTarjeta(),VOAlta.getDireccion(),VOAlta.getFechaInsc(),VOAlta.getidKiosco(),VOAlta.getEstadoPago(),VOAlta.getSaldo(),VOAlta.getMulta());
            jTxtidCliente.setText(VOAlta.getidCliente().toString());
            jTTarjeta.setText(Integer.toString(VOAlta.getTarjeta()));
            jTCodTarjeta.setText(Integer.toString(VOAlta.getCodigoTarjeta()));
            jTxtNomCliente.setText(VOAlta.getNombreCliente());
            jDate.setDate(VOAlta.getFechaNacimiento());//modificado
            if(VOAlta.getSexo()=='M')
                Masculino.setSelected(true);
            else
            Femenino.setSelected(true);
            Direccion.setText(VOAlta.getDireccion());
            jBtnRealizar.setText("Modificar");
            this.setTitle("Modificar un Cliente");
            if (pOp == ELIMINAR) {
                jBtnRealizar.setText("Eliminar");
                jTxtNomCliente.setEditable(false);
                jDate.setEnabled(false);
                jTTarjeta.setEditable(false);
                jTCodTarjeta.setEditable(false);
                Masculino.setEnabled(false);
                Femenino.setEnabled(false);
                Direccion.setEditable(false);
                this.setTitle("Eliminar un Cliente");
            }
        }
        else {
            jDate.setDate(Fecha());
            Masculino.setSelected(true);
            jTxtidCliente.setText(""+(pNc));
            jTxtNomCliente.requestFocus();
            
        }
        this.setVisible(true);
        
    }
     public final Date Fecha(){
      java.util.Date Date=new java.util.Date();
      java.sql.Date resta=new java.sql.Date(Date.getTime()-631138000000L);
      return resta; // Devuelve el objeto Date con los nuevos días añadidos
 }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtidCliente = new javax.swing.JTextField();
        jTxtNomCliente = new javax.swing.JTextField();
        jDate = new com.toedter.calendar.JDateChooser();
        Masculino = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        Femenino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLTarjeta = new javax.swing.JLabel();
        jTTarjeta = new javax.swing.JTextField();
        jLCod = new javax.swing.JLabel();
        jTCodTarjeta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Direccion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBtnRealizar = new javax.swing.JButton();
        jBtnRegresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agrega un Cliente");
        setBounds(new java.awt.Rectangle(300, 300, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel1.setText("ID Cliente:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 83, -1, -1));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel3.setText("Fecha de Nacimiento:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 124, -1, -1));

        jTxtidCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtidClienteActionPerformed(evt);
            }
        });
        jTxtidCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtidClienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtidClienteKeyTyped(evt);
            }
        });
        jPanel1.add(jTxtidCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 152, 30));

        jTxtNomCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNomClienteKeyTyped(evt);
            }
        });
        jPanel1.add(jTxtNomCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 152, 30));

        jDate.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(jDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 152, 30));

        Masculino.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        Masculino.setText("Masculino");
        Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasculinoActionPerformed(evt);
            }
        });
        jPanel1.add(Masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel4.setText("Sexo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        Femenino.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        Femenino.setText("Femenino");
        Femenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemeninoActionPerformed(evt);
            }
        });
        jPanel1.add(Femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel5.setText("Dirección:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLTarjeta.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLTarjeta.setText("Tarjeta :");
        jPanel1.add(jLTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jTTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTarjetaActionPerformed(evt);
            }
        });
        jPanel1.add(jTTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 152, 30));

        jLCod.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLCod.setText("Cod. Tarjeta: ");
        jPanel1.add(jLCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jTCodTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCodTarjetaActionPerformed(evt);
            }
        });
        jPanel1.add(jTCodTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 152, 30));

        Direccion.setColumns(20);
        Direccion.setRows(5);
        jScrollPane2.setViewportView(Direccion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 210, 80));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menua.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 410));

        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 380));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jBtnRealizar.setBackground(new java.awt.Color(0, 0, 0));
        jBtnRealizar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jBtnRealizar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnRealizar.setText("Agregar");
        jBtnRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRealizarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnRealizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, -1));

        jBtnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        jBtnRegresar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        jBtnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnRegresar.setText("Regresar");
        jBtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menua.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtidClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtidClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtidClienteActionPerformed

    private void jBtnRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRealizarActionPerformed
        // TODO add your handling code here:
        char sexo;
        int idki=123;
        CNAlta oNAlta;
        CVOCliente oVOAlta;
        oNAlta = new CNAlta();
        if(Masculino.isSelected())
            sexo='M';
        else
            sexo='F';
        try {
            java.util.Date utilDate = new java.util.Date();
            java.sql.Date sqlDate = new java.sql.Date(jDate.getDate().getTime());
            java.sql.Date sqlDateT = new java.sql.Date(utilDate.getTime());
            oVOAlta = new CVOCliente(Long.parseLong(jTxtidCliente.getText()), jTxtNomCliente.getText(),sqlDate,sexo,Integer.parseInt(jTTarjeta.getText()),Integer.parseInt(jTCodTarjeta.getText()),Direccion.getText(),sqlDateT,idki,"Pendiente",200L,0L);
            if(jTxtidCliente.getText().equals("")||jTxtNomCliente.getText().equals("")||Direccion.getText().equals(""))
                throw new NumberFormatException();
            if (mOp == AGREGAR) {
                oNAlta.setAgregaCliente(oVOAlta);
                mListaCliente.add(oVOAlta);
            }
            if (mOp == MODIFICAR) {
                oNAlta.setModificaCliente(oVOAlta);
                mListaCliente.set(mRegSel, oVOAlta);
            }
            if (mOp == ELIMINAR) {
                if(JOptionPane.showConfirmDialog(this, "Esta seguro que desea eliminar cliente","Confirmar",JOptionPane.YES_NO_OPTION)==0){
                oNAlta.setEliminaCliente(oVOAlta);
                mListaCliente.remove(mRegSel);
            }
                
            }

            this.dispose();
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(this,"Error de fecha, el formado debe ser dd/mm/aaaa","Error en Datos", JOptionPane.ERROR_MESSAGE); 
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Se deben de llenar todos los campos","Error en Datos", JOptionPane.ERROR_MESSAGE);           
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(this,e.getMessage(),"Error en Datos", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jBtnRealizarActionPerformed

    private void jBtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBtnRegresarActionPerformed

    private void jTxtidClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtidClienteKeyTyped
        // TODO add your handling code here:
        try{
            if(!Character.isDigit(evt.getKeyChar())&&!Character.isISOControl(evt.getKeyChar())){
                evt.consume();
                throw new Exception("El id es numerico");}
            if(jTxtidCliente.getText().length()>=10){
                evt.consume();
                throw new Exception("El id es de 10 digitos");
        }
        }
        catch(Exception E){
                JOptionPane.showMessageDialog(this,E.getMessage(),null,JOptionPane.ERROR_MESSAGE, null);
                }
        
    }//GEN-LAST:event_jTxtidClienteKeyTyped

    private void jTxtidClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtidClienteKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTxtidClienteKeyPressed

    private void jTxtNomClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNomClienteKeyTyped
        // TODO add your handling code here:
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

    private void MasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasculinoActionPerformed
        // TODO add your handling code here:
        if(Femenino.isEnabled())
            Femenino.setSelected(false);
        Masculino.setSelected(true);
    }//GEN-LAST:event_MasculinoActionPerformed

    private void FemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemeninoActionPerformed
        // TODO add your handling code here:
        if(Masculino.isEnabled())
            Masculino.setSelected(false);
        Femenino.setSelected(true);
    }//GEN-LAST:event_FemeninoActionPerformed

    private void jTCodTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCodTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCodTarjetaActionPerformed

    private void jTTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTarjetaActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Direccion;
    private javax.swing.JRadioButton Femenino;
    private javax.swing.JRadioButton Masculino;
    private javax.swing.JButton jBtnRealizar;
    private javax.swing.JButton jBtnRegresar;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLCod;
    private javax.swing.JLabel jLTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTCodTarjeta;
    private javax.swing.JTextField jTTarjeta;
    private javax.swing.JTextField jTxtNomCliente;
    private javax.swing.JTextField jTxtidCliente;
    // End of variables declaration//GEN-END:variables

}
