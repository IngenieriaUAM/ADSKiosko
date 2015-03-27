/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author jonathan
 */
public class CVOBicicleta {
    Long idBicicleta;
    String tipoBicicleta;
    String statBicicleta;

    public CVOBicicleta() {
    }

    public CVOBicicleta(Long idBicicleta, String tipoBicicleta, String statBicicleta) {
        this.idBicicleta = idBicicleta;
        this.tipoBicicleta = tipoBicicleta;
        this.statBicicleta = statBicicleta;
    }

    public Long getIdBicicleta() {
        return idBicicleta;
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public String getStatBicicleta() {
        return statBicicleta;
    }

    public void setIdBicicleta(Long idBicicleta) {
        this.idBicicleta = idBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    public void setStatBicicleta(String statBicicleta) {
        this.statBicicleta = statBicicleta;
    }
    
    
}
