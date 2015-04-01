package Interfaz;

import VO.CVOCliente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * @author Lucas
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CtblACliente extends AbstractTableModel {


    private static final long serialVersionUID = 1L;
    @SuppressWarnings("unchecked")
    ArrayList items = null;
    String columnNames[] = {"ID", "NOMBRE", "FECHA DE NACIMIENTO", "SEXO","DIRECCION", "TARJETA"};

    /*
     * Constructor por default
     */
    public CtblACliente() {
    }

    /*
     * Regresa el n˙mero de renglones
     * @return N˙mero de renglones
     */
    @Override
    public int getRowCount() {
        return this.items.size();
    }

    /*
     * Regresa el n˙mero de columnas
     * @return N˙mero de columnas
     */
    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    /*
     * Obtiene el valor de una celda en especÌfico
     * @param row Renglon
     * @param col Columna
     * @return Objeto con el contenido de la celda
     */
    @Override
    public Object getValueAt(int renglon, int columna) {
        Object objetoRetorno = null;
        CVOCliente l_VOCliente = (CVOCliente) items.get(renglon);

        switch (columna) {
            case 0:
                objetoRetorno = l_VOCliente.getidCliente();
                break;
            case 1:
                objetoRetorno = l_VOCliente.getNombreCliente();
                break;
            case 2:
                objetoRetorno = l_VOCliente.getFechaNacimiento();
                break;
            case 3:
                objetoRetorno = l_VOCliente.getSexo();
                break;
            case 4:
                objetoRetorno = l_VOCliente.getDireccion();
                break;
            case 5:
                objetoRetorno = l_VOCliente.getTarjeta();
                break;
        }
        return objetoRetorno;
    }

    /**
     *
     */
    @Override
    public String getColumnName(int p_i_Columna) {
        return columnNames[p_i_Columna].toString();
    }

    /**
     *
     * @param p_ListaItems
     */
    public void settblMCliente(ArrayList p_ListaItems) {
        if (p_ListaItems == null) {
            p_ListaItems = new ArrayList();
        }
        this.items = p_ListaItems;
        this.fireTableDataChanged();
    }

    /**
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public ArrayList getItems() {
        return this.items;
    }
}
