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

    /**
     * Constructor de la clase
     */
    public CNRenta() {
        oDRenta=new CDRenta();
    }

    /**
     * Agrega la renta a CVORenta
     * @param pVORenta
     * @throws SQLException en caso de error SQL
     */
    public void setAgregaRenta(CVORenta pVORenta) throws SQLException {

        oDRenta.setAgregaRenta(pVORenta);
    }
    
    /**
     * Hace la busqueda de la renta en CVORenta
     * @param pVORenta
     * @return
     * @throws SQLException en caso de error
     */
    public CVORenta buscaRenta(Long pVORenta) throws SQLException{
        return oDRenta.buscaRenta(pVORenta);
    }
    
}
