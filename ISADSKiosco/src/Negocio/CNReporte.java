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

    public CNReporte(CDReporte oDReporte) {
        this.oDReporte = oDReporte;
    }

    public CNReporte() {
       oDReporte=new CDReporte();
    }
    
    public ArrayList<CVOReporte> getListaClientes() throws SQLException {
        return oDReporte.getListaReporte();
    }
    
    public void setAgregaReporte(CVOReporte oVReporte) throws SQLException{
        System.out.println(oVReporte.getIdCliente());
        oDReporte.setAgregaReporte(oVReporte);
        
    }
    
    public int getIdReporte() throws SQLException{
        try{
        return this.getListaClientes().size()+1;
        }catch(NullPointerException npe){
            return 0;
        }
    }
}
