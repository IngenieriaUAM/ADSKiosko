package Interfaz;

import VO.CVOCKiosco;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * @author Lucas
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CtblACKiosco extends AbstractTableModel {


    private static final long serialVersionUID = 1L;
    @SuppressWarnings("unchecked")
    ArrayList items = null;
    String columnNames[] = {"IDKIOSCO", "UBICACION", "RENTAS"};

    /*
     * Constructor por default
     */
    public CtblACKiosco() {
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
        CVOCKiosco l_VOCliente = (CVOCKiosco) items.get(renglon);

        switch (columna) {
            case 0:
                objetoRetorno = l_VOCliente.getIdKiosco();
                break;
            case 1:
                objetoRetorno = l_VOCliente.getUbicacion();
                break;
            case 2:
                objetoRetorno = l_VOCliente.getRenta();
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
