package Interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import VO.CVOCliente;
import Negocio.CNAlta;

public class CIGestionClientes extends javax.swing.JFrame {

    public CIGestionClientes() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        if(tblVCliente.getHeight()!= 0)
            tblVCliente.setRowSelectionInterval(0,0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        spAlumnos = new javax.swing.JScrollPane();
        tblVCliente = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de Clientes");
        setBounds(new java.awt.Rectangle(300, 300, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(6);

        spAlumnos.setAutoscrolls(true);
        spAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tblVCliente.setModel(tblMCliente);
        initTableModelAlumno();
        spAlumnos.setViewportView(tblVCliente);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(spAlumnos, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(spAlumnos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(btnAgregar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(btnModificar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(btnRegresar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(btnEliminar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(new java.awt.Component[] {btnAgregar, btnModificar, btnRegresar}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(41, 41, 41)
                .add(btnAgregar)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(btnModificar)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(btnEliminar)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(btnRegresar)
                .addContainerGap(85, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(28, 28, 28)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane spAlumnos;
    private javax.swing.JTable tblVCliente;
    // End of variables declaration//GEN-END:variables
    private CtblACliente tblMCliente = new CtblACliente();
}
