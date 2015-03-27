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
public class CVOReporte {
    int idReporte;
    String tipoReporte;
    Long idBicicleta;
    String tipoBicicleta;
    Long idCliente;
    String nombreCliente;
    String decripcionReporte;
    String fechaReporte;
    Long idRenta;

    public CVOReporte() {
    }

    public CVOReporte(int idReporte, String tipoReporte, Long idBicicleta, String tipoBicicleta, Long idCliente, String nombreCliente, String decripcionReporte, String fechaReporte,Long idRenta) {
        this.idReporte = idReporte;
        this.tipoReporte = tipoReporte;
        this.idBicicleta = idBicicleta;
        this.tipoBicicleta = tipoBicicleta;
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.decripcionReporte = decripcionReporte;
        this.fechaReporte = fechaReporte;
        this.idRenta=idRenta;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public Long getIdBicicleta() {
        return idBicicleta;
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getDecripcionReporte() {
        return decripcionReporte;
    }

    public String getFechaReporte() {
        return fechaReporte;
    }

    public Long getIdRenta() {
        return idRenta;
    }    
    
    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public void setIdBicicleta(Long idBicicleta) {
        this.idBicicleta = idBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setDecripcionReporte(String decripcionReporte) {
        this.decripcionReporte = decripcionReporte;
    }

    public void setFechaReporte(String fechaReporte) {
        this.fechaReporte = fechaReporte;
    }
    
    public void setIdRenta(Long idRenta){
        this.idRenta=idRenta;
    }
    
    
}
