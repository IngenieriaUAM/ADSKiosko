/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.SQLException;
import java.util.ArrayList;
import VO.CVOCKiosco;
import Datos.CDCKiosco;


/**
 *
 * @author lucas
 */
public class CNCKiosco {
    
    private CDCKiosco oDAlta;
    ArrayList<CVOCKiosco> lista;

    public CNCKiosco() {
        oDAlta = new CDCKiosco();
    }

    /*
     * Negocia una lista con un objeto de datos
     * @return ArrayList con los registros de la base de datos
     */
    public ArrayList<CVOCKiosco> getListaClientes() throws SQLException {
        return oDAlta.getListaClientes();
    }
    
    /**
     * Metod para comprara si dos objetos de CNCKiosco son iguales
     * @param oNCKiosco la instacia que se va a comparar con la que lo mando a llamar
     * @return true si la lista contiene lo mismo que la que lo mando a llamar
     */
    public boolean equals(CNCKiosco oNCKiosco) throws SQLException {
        lista = getListaClientes();
        CVOCKiosco oVOKComparar, oVOKArgumento;
        int i = 0;
        while(i<lista.size()){
            oVOKComparar = (CVOCKiosco) lista.get(i);
            oVOKArgumento = (CVOCKiosco) oNCKiosco.lista.get(i);
            if(!oVOKComparar.equals(oVOKArgumento))
                return false;
            i++;
        }
        return true;
    }
    
    public void add(CVOCKiosco elemento){
        lista.add(elemento);
    }

}
