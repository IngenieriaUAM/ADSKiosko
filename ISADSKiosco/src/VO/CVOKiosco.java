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
public class CVOKiosco {
    private Long idKiosco;
    private String ubicacion;

    public CVOKiosco(Long idKiosco, String ubicacion) {
        this.idKiosco = idKiosco;
        this.ubicacion = ubicacion;
    }

    public CVOKiosco() {

    }

    public Long getIdKiosco() {
        return idKiosco;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setIdKiosco(Long idKiosco) {
        this.idKiosco = idKiosco;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    
}
