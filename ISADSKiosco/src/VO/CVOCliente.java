package VO;

import java.sql.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucas
 */
public class CVOCliente
{
  private Long idCliente = 0L;
  private String NombreCliente = "";
  private Date FechaNacimiento ;
  private char Sexo=' ';
  private int Tarjeta;
  private int CodigoTarjeta;
  private String Direccion="";
  private Date FechaInsc;
  private int idKiosco;
  private String estadoPago;
  private Long saldo;

 /*
  * Constructor por default
  */
  public CVOCliente()
  {
  }

  public CVOCliente(Long pidCliente,String pNombreCliente,Date pFechaNacimiento,char pSexo,int pTarjeta,int pCodigoTarjeta,String pDireccion,Date pFechaInsc,int pidKiosco, String pEstadoPago, Long pSaldo ){
        this.setidCliente(pidCliente);
        this.setNombreCliente(pNombreCliente);
        this.setFechaNacimiento(pFechaNacimiento);
        this.setSexo(pSexo);
        this.setTarjeta(pTarjeta);
        this.setCodigoTarjeta(pCodigoTarjeta);
        this.setDireccion(pDireccion);
        this.setFechaInsc(pFechaInsc);
        this.setidKiosco(pidKiosco);
        this.setSaldo(pSaldo);
        this.setEstadoPago(pEstadoPago);
        
  }

    public Long getIdCliente() {
        return idCliente;
    }

    public int getIdKiosco() {
        return idKiosco;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public Long getSaldo() {
        return saldo;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdKiosco(int idKiosco) {
        this.idKiosco = idKiosco;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public void setSaldo(Long saldo) {
        this.saldo = saldo;
    }
 
 public void setDireccion(String pSDireccion){
	this.Direccion = pSDireccion;
  }

 /**
  * Obtiene el Nombre
  * @return
  */
  public String getDireccion(){
	return this.Direccion;
  }
  public void setSexo(char pSSexo){
	this.Sexo = pSSexo;
  }

 /**
  * Obtiene el Nombre
  * @return
  */
  public char getSexo(){
	return this.Sexo;
  }
 /**
  * Inicializa el idcliente
  * @param pidCliente
  */
  public void setidCliente(Long pidCliente){
	this.idCliente = pidCliente;
  }

 /**
  * Obtiene el idcliente
  * @return
  */
  public Long getidCliente(){
	return this.idCliente;
  }

 /*
  * Inicializa el nombre
  * @param pNombreCliente
  */
  public void setNombreCliente(String pNombreCliente){
	this.NombreCliente = pNombreCliente;
  }

 /**
  * Obtiene el Nombre
  * @return
  */
  public String getNombreCliente(){
	return this.NombreCliente;
  }

 /**
  * Inicializa la fecha de nacimiento
  * @param pFechaNacimiento
  */
  public void setFechaNacimiento(Date pFechaNacimiento)
  {
	this.FechaNacimiento = pFechaNacimiento;
  }

 /*
  * Obtiene la fecha de nacimiento
  * @return
  */
  public Date getFechaNacimiento(){
	return this.FechaNacimiento;
  }
          /**
  * Inicializa la fecha de nacimiento
  * @param pFechaNacimiento
  */
  public void setTarjeta(int pTarjeta)
  {
	this.Tarjeta = pTarjeta;
  }

 /*
  * Obtiene la fecha de nacimiento
  * @return
  */
  public int getTarjeta(){
	return this.Tarjeta;
  }
  public void setCodigoTarjeta(int pCodigoTarjeta)
  {
	this.CodigoTarjeta = pCodigoTarjeta;
  }

 /*
  * Obtiene la fecha de nacimiento
  * @return
  */
  public int getCodigoTarjeta(){
	return this.CodigoTarjeta;
  }
  public Date getFechaInsc(){
	return this.FechaInsc;
  }
          /**
  * Inicializa la fecha de nacimiento
  * @param pFechaNacimiento
  */
  public void setFechaInsc(Date pFechaInsc)
  {
	this.FechaInsc = pFechaInsc;
  }

   public void setidKiosco(int pidKiosco)
  {
	this.idKiosco = pidKiosco;
  }

 /*
  * Obtiene la fecha de nacimiento
  * @return
  */
  public int getidKiosco(){
	return this.idKiosco;
  }
}
