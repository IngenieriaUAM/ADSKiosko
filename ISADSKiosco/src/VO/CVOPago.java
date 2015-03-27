/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import java.sql.Date;

/**
 *
 * @author J o C e L y N
 */
public class CVOPago {
  private Long idPago;
  private Long monto;
  private Long idCliente ;
  private String nombreCliente;

    public CVOPago(Long idPago, Long monto, Long idCliente, String nombreCliente) {
        this.idPago = idPago;
        this.monto = monto;
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
    }
    
    public CVOPago(){
    }

    public Long getIdPago() {
        return idPago;
    }

    public Long getMonto() {
        return monto;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setIdPago(Long idPago) {
        this.idPago = idPago;
    }

    public void setMonto(Long monto) {
        this.monto = monto;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    
  
    
}
