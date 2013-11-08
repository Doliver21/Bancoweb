/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.negocio;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author alumno
 */
public class MovimientoBancario {

    private int idMovimientoBancario;
    private TipoMovimientoBancario tipoMovimientosBancario;
    private BigDecimal importe;
    private Date fecha;
    private BigDecimal saldoTotal;
    private String concepto;
    
    
    public MovimientoBancario(int idMovimientoBancario, TipoMovimientoBancario tipoMovimientosBancario,BigDecimal importe,Date fecha,BigDecimal saldoTotal,String concepto){
        this.idMovimientoBancario = idMovimientoBancario;
        this.tipoMovimientosBancario= tipoMovimientosBancario;
        this.importe= importe;
        this.fecha = fecha;
        this.concepto= concepto;
        this.saldoTotal = saldoTotal;
    }
    

    public int getIdMovimientoBancario() {
        return idMovimientoBancario;
    }

    public void setIdMovimientoBancario(int idMovimientoBancario) {
        this.idMovimientoBancario = idMovimientoBancario;
    }

    public TipoMovimientoBancario getTMB() {
        return tipoMovimientosBancario;
    }

    public void setTMB(TipoMovimientoBancario tipoMovimientosBancario) {
        this.tipoMovimientosBancario = tipoMovimientosBancario;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(BigDecimal saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    
    
    
    
}
