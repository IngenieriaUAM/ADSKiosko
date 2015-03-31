package Interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import VO.CVOCliente;
import Negocio.CNAlta;
import javax.swing.ImageIcon;

public class CIGestionClientes extends javax.swing.JFrame {

    public CIGestionClientes() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/bicycle_icon.jpg")).getIm­age());
        if(tblVCliente.getHeight()!= 0)
            tblVCliente.setRowSelectionInterval(0,0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        spAlumnos = new javax.swing.JScrollPane();
        tblVCliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de Clientes");
        setBounds(new java.awt.Rectangle(300, 300, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(6);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spAlumnos.setForeground(new java.awt.Color(0, 102, 0));
        spAlumnos.setAutoscrolls(true);
        spAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tblVCliente.setModel(tblMCliente);
        initTableModelAlumno();
        spAlumnos.setViewportView(tblVCliente);

        jPanel1.add(spAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 570, 197));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 43, -1, 197));

        btnAgregar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 150, -1));

        btnModificar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 150, -1));

        btnRegresar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 150, -1));

        btnEliminar.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 24)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menua.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 750, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
            EdUnCliente(1);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try{
            EdUnCliente(2);
        }catch(ArrayIndexOutOfBoundsException obe){
            JOptionPane.showMessageDialog(this,"No hay clientes en la tabla para modificar","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Interfaz.CIMenuP mp;
        mp = new CIMenuP();
        this.dispose();
        mp.setVisible(true);
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            EdUnCliente(3);
        }catch(ArrayIndexOutOfBoundsException obe){
            JOptionPane.showMessageDialog(this,"No hay clientes en la tabla para eliminar","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void EdUnCliente(final int pOp) {
        final int count = tblVCliente.getRowCount();
        final long nClt;
        if(count>0)
            nClt=(long)tblVCliente.getModel().getValueAt(count-1, 0)+1;
        else 
            nClt= 1l;
        CIAltaUsuario oIUnCliente = new CIAltaUsuario(tblMCliente.getItems(), tblVCliente.getSelectedRow(), pOp, nClt);
        eventoActualizarWind(pOp,tblVCliente.getSelectedRow(),count);
        //Oculta esta ventana
        this.setVisible(false);
        //Agrega un listener al objeto oAlumnoNuevo
        
        oIUnCliente.addWindowListener(new WindowAdapter() {
                 //Ventana cerrada
                 public void windowClosed(WindowEvent e) {
                     eventoActualizarWind(pOp,tblVCliente.getSelectedRow(),count);
                 }
                 //Ventana cerrandose
                 public void windowClosing(WindowEvent e){
                     eventoActualizarWind(pOp,tblVCliente.getSelectedRow(),count);
                 }
        });  
    }
    
    private void eventoActualizarWind(int p0p, int i, int count) {
        try{
            tblMCliente.fireTableDataChanged();
            if(tblVCliente.getHeight()!= 0)
                tblVCliente.setRowSelectionInterval(0,0);
            if(p0p==1)
                tblVCliente.setRowSelectionInterval(tblVCliente.getRowCount()-1,tblVCliente.getRowCount()-1);
            if(p0p==2)
                tblVCliente.setRowSelectionInterval(i,i);
            if(p0p==3){
                if(tblVCliente.getRowCount()== count)
                    tblVCliente.setRowSelectionInterval(i,i);
                else
                    if(i>1)
                        tblVCliente.setRowSelectionInterval(i-1,i-1);
            }
        }catch(IllegalArgumentException iae){  
        }
        this.setVisible(true);
    }
    
    /**
     * Inicializa la tabla de datos que se muestra en la interfaz
     */
    private void initTableModelAlumno() {

    //Objeto de negocio para acceder a la base de datos
    CNAlta oNcliente = new CNAlta();
    //ArrayList para contener los datos
    ArrayList<CVOCliente> lista = null;
    //invocamos al objeto de negocio
    try {
            lista = oNcliente.getListaClientes();
            tblMCliente.settblMCliente(lista);
        } 
    catch (SQLException e) {
            JOptionPane.showMessageDialog(this,e.getMessage(),"Error en Datos", JOptionPane.ERROR_MESSAGE);
            System.exit(0);//Salir de la aplicaciÛn
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane spAlumnos;
    private javax.swing.JTable tblVCliente;
    // End of variables declaration//GEN-END:variables
    private CtblACliente tblMCliente = new CtblACliente();
}
