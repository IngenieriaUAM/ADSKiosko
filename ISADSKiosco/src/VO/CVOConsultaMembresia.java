/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author eliza
 */
public class CVOConsultaMembresia {
    private Long idBicicleta;
    private String tipoBicicleta;
    private String fechaInicio;
    private String fechaDev;
    private String nombreCliente;

    public CVOConsultaMembresia(Long idBicicleta, String tipoBicicleta, String fechaInicio, String fechaDev, String nombreCliente) {
        this.idBicicleta = idBicicleta;
        this.tipoBicicleta = tipoBicicleta;
        this.fechaInicio = fechaInicio;
        this.fechaDev = fechaDev;
        this.nombreCliente=nombreCliente;
    }

    public CVOConsultaMembresia() {
    }

    public Long getIdBicicleta() {
        return idBicicleta;
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaDev() {
        return fechaDev;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setIdBicicleta(Long idBicicleta) {
        this.idBicicleta = idBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaDev(String fechaDev) {
        this.fechaDev = fechaDev;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    
}
