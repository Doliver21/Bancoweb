/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class CuentaBancaria {

    private int idCuentaBancaria; // La PK de la Cuenta Bancaria 
    private SucursalBancaria sucursalBancaria;
    private String numeroDeCuenta;
    private BigDecimal saldo;
    private String dc;
    private String cif;
    private List <MovimientoBancario> MovimientosBancarios = new ArrayList<>();
    
    public CuentaBancaria(int idCuentaBancaria ,SucursalBancaria sucursalBancaria,String numeroDeCuenta,BigDecimal saldo,String dc , String cif){
     
        this.idCuentaBancaria= idCuentaBancaria;
        this.sucursalBancaria = sucursalBancaria;
        this.numeroDeCuenta= numeroDeCuenta;
        this.saldo= saldo;
        this.dc= dc;
        this.cif=cif;
        
    }
    
    
    
    
    
    
    public int getIdCuentaBancaria() {
        return idCuentaBancaria;
    }

    public void setIdCuentaBancaria(int idCuentaBancaria) {
        this.idCuentaBancaria = idCuentaBancaria;
    }

    public SucursalBancaria getSucursalBancaria() {
        return sucursalBancaria;
    }

    public void setSucursalBancaria(SucursalBancaria sucursalBancaria) {
        this.sucursalBancaria = sucursalBancaria;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public List<MovimientoBancario> getMovimientosBancarios() {
        return MovimientosBancarios;
    }

    public void setMovimientosBancarios(List<MovimientoBancario> MovimientosBancarios) {
        this.MovimientosBancarios = MovimientosBancarios;
    }
    
    
    
    
}
