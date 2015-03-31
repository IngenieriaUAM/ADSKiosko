/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;


import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import VO.CVOCliente;
import Negocio.CNAlta;
import java.awt.Color;
import java.sql.Date;

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
        java.sql.Date max= new java.sql.Date(Fecha().getTime()+63113800000L);
        java.sql.Date min= new java.sql.Date(Fecha().getTime()-1262276000000L);
        jDate.setSelectableDateRange(min, max);
        mListaCliente = pListaClientes;
        mOp = pOp;
        mRegSel = pRegSel;
        jTxtidCliente.setEditable(false);
        if (pOp != AGREGAR) {
            VOAlta = (CVOCliente) pListaClientes.get(pRegSel);
            mVOCliente = new CVOCliente(VOAlta.getidCliente(), VOAlta.getNombreCliente(), VOAlta.getFechaNacimiento(),VOAlta.getSexo(),VOAlta.getTarjeta(),VOAlta.getCodigoTarjeta(),VOAlta.getDireccion(),VOAlta.getFechaInsc(),VOAlta.getidKiosco(),VOAlta.getEstadoPago(),VOAlta.getSaldo());
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
        jBtnRealizar = new javax.swing.JButton();
        jBtnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agrega un Alumno");
        setBounds(new java.awt.Rectangle(300, 300, 0, 0));
        setResizable(false);

        jLabel1.setText("ID Cliente");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Fecha de Nacimiento:");

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

        jTxtNomCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNomClienteKeyTyped(evt);
            }
        });

        jDate.setDateFormatString("dd/MM/yyyy");

        Masculino.setText("Masculino");
        Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasculinoActionPerformed(evt);
            }
        });

        jLabel4.setText("Sexo");

        Femenino.setText("Femenino");
        Femenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemeninoActionPerformed(evt);
            }
        });

        jLabel5.setText("Dirección");

        jLTarjeta.setText("Tarjeta :");

        jLCod.setText("Cod. Tarjeta: ");

        Direccion.setColumns(20);
        Direccion.setRows(5);
        jScrollPane2.setViewportView(Direccion);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(23, 23, 23)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(jLabel2)
                    .add(jLabel3)
                    .add(jLabel4)
                    .add(jLabel5)
                    .add(jLTarjeta)
                    .add(jLCod))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jTxtNomCliente)
                            .add(jTTarjeta)
                            .add(jDate, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jTxtidCliente)
                            .add(jTCodTarjeta))
                        .add(79, 79, 79))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(Masculino)
                                .add(18, 18, 18)
                                .add(Femenino))
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(65, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jTxtidCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel2)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jTxtNomCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(21, 21, 21)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(Masculino)
                    .add(Femenino))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLTarjeta)
                    .add(jTTarjeta, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLCod)
                    .add(jTCodTarjeta, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel5)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jBtnRealizar.setText("Agregar");
        jBtnRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRealizarActionPerformed(evt);
            }
        });

        jBtnRegresar.setText("Regresar");
        jBtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegresarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(93, 93, 93)
                .add(jBtnRealizar)
                .add(39, 39, 39)
                .add(jBtnRegresar)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jBtnRealizar)
                    .add(jBtnRegresar))
                .addContainerGap())
        );

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
            oVOAlta = new CVOCliente(Long.parseLong(jTxtidCliente.getText()), jTxtNomCliente.getText(),sqlDate,sexo,Integer.parseInt(jTTarjeta.getText()),Integer.parseInt(jTCodTarjeta.getText()),Direccion.getText(),sqlDateT,idki,"Pendiente",200L);
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
                oNAlta.setEliminaCliente(oVOAlta);
                mListaCliente.remove(mRegSel);
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
                throw new Exception("La matricula es numerica");}
            if(jTxtidCliente.getText().length()>=10){
                evt.consume();
                throw new Exception("La matricula es de 10 digitos");
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTCodTarjeta;
    private javax.swing.JTextField jTTarjeta;
    private javax.swing.JTextField jTxtNomCliente;
    private javax.swing.JTextField jTxtidCliente;
    // End of variables declaration//GEN-END:variables

}
