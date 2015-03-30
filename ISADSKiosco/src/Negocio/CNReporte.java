/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.CDReporte;
import VO.CVOReporte;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jonathan
 */
public class CNReporte {
    
    private CDReporte oDReporte;

    /**
     *
     * @param oDReporte
     */
    public CNReporte(CDReporte oDReporte) {
        this.oDReporte = oDReporte;
    }

    /**
     * Constructor de la clase
     */
    public CNReporte() {
       oDReporte=new CDReporte();
    }
    
    /**
     * Negocia una lista con un objeto de datos
     * @return ArrayList con los requisitos de la base de datos
     * @throws SQLException en caso de error SQL
     */
    public ArrayList<CVOReporte> getListaClientes() throws SQLException {
        return oDReporte.getListaReporte();
    }
    
    /**
     * Agrega el reporte a CVOReporte
     * @param oVReporte
     * @throws SQLException en caso de error SQL
     */
    public void setAgregaReporte(CVOReporte oVReporte) throws SQLException{
        System.out.println(oVReporte.getIdCliente());
        oDReporte.setAgregaReporte(oVReporte);
        
    }
    
    /**
     * Obtiene el reporte
     * @return Lista de clientes
     * @throws SQLException en caso de error SQL
     */
    public int getIdReporte() throws SQLException{
        try{
        return this.getListaClientes().size()+1;
        }catch(NullPointerException npe){
            return 0;
        }
    }
}
