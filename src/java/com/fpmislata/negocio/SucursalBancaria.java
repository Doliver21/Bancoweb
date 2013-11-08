/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.negocio;

import com.fpmislata.negocio.EntidadBancaria;
import com.fpmislata.negocio.CuentaBancaria;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class SucursalBancaria {

    private int idSucursalBancaria;
    private EntidadBancaria entidadBancaria;
    private String codigoSucursal;
    private String nombre;
    private List<CuentaBancaria> CuentasBancarias = new ArrayList<>();
    
    
    
    
   public SucursalBancaria(int idSucursalBancaria, EntidadBancaria entidadBancaria,String codigoSucursal,String nombre ){
       
       this.idSucursalBancaria=idSucursalBancaria;
       this.entidadBancaria=entidadBancaria;
       this.codigoSucursal=codigoSucursal;
       this.nombre= nombre;
   }

    public List<CuentaBancaria> getListaCuentasBancarias() {
        return CuentasBancarias;
    }

    public void setListaCuentasBancarias(List<CuentaBancaria> CuentasBancarias) {
        this.CuentasBancarias = CuentasBancarias;
    }

    public int getIdSucursalBancaria() {
        return idSucursalBancaria;
    }

    public void setIdSucursalBancaria(int idSucursalBancaria) {
        this.idSucursalBancaria = idSucursalBancaria;
    }

    public EntidadBancaria getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(EntidadBancaria entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
