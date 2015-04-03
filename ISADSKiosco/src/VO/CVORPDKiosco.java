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
public class CVORPDKiosco {
    private Long idKiosko;
    private String ubicacionKiosko;
    private String fecha;
    private Long numeroRentas;

    public CVORPDKiosco() {
    }

    public CVORPDKiosco(Long idKiosko, String ubicacionKiosko, String fecha, Long numeroRentas) {
        this.idKiosko = idKiosko;
        this.ubicacionKiosko = ubicacionKiosko;
        this.fecha = fecha;
        this.numeroRentas = numeroRentas;
    }
    
    public boolean equals(CVORPDKiosco oVORPDKiosco){
        if(oVORPDKiosco.getIdKiosko() == this.idKiosko){
            if(oVORPDKiosco.getUbicacionKiosko().equalsIgnoreCase(this.getUbicacionKiosko())){
                if(oVORPDKiosco.getFecha().equalsIgnoreCase(this.getFecha())){
                    if(oVORPDKiosco.getNumeroRentas() == this.numeroRentas){
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public Long getIdKiosko() {
        return idKiosko;
    }

    public String getUbicacionKiosko() {
        return ubicacionKiosko;
    }

    public String getFecha() {
        return fecha;
    }

    public Long getNumeroRentas() {
        return numeroRentas;
    }

    public void setIdKiosko(Long idKiosko) {
        this.idKiosko = idKiosko;
    }

    public void setUbicacionKiosko(String ubicacionKiosko) {
        this.ubicacionKiosko = ubicacionKiosko;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNumeroRentas(Long numeroRentas) {
        this.numeroRentas = numeroRentas;
    }
    
    
            
    
}
