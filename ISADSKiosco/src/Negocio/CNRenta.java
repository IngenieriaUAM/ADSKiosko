/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import java.sql.SQLException;
import VO.CVORenta;
import Datos.CDRenta;
/**
 *
 * @author jonathan
 */
public class CNRenta {
    private CDRenta oDRenta;

    public CNRenta() {
        oDRenta=new CDRenta();
    }
    public void setAgregaRenta(CVORenta pVORenta) throws SQLException {

        oDRenta.setAgregaRenta(pVORenta);
    }
    
    public CVORenta buscaRenta(Long pVORenta) throws SQLException{
        return oDRenta.buscaRenta(pVORenta);
    }
    
}
