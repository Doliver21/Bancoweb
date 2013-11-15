/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.negocio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class EntidadBancaria {

    private int idEntidadBancaria;
    private String codigoEntidadBancaria;
    private String nombre;
    private String cif;
    private TipoEntidadBancaria tipoEntidadBancaria;
    private List <SucursalBancaria> Surcursales = new ArrayList <>();
    
    
    
    public EntidadBancaria(){
        
    }
    
    /*public EntidadBancaria(int idEntidad ,String codigoEntidadBancaria,String nombre,String cif , TipoEntidadBancaria tipoEntidadBancaria){
        
       this.cif=cif;
       this.codigoEntidadBancaria=codigoEntidadBancaria;
       this.idEntidadBancaria=idEntidad;
       this.nombre=nombre;
       this.tipoEntidadBancaria= tipoEntidadBancaria;
    }*/

    public EntidadBancaria(int idEntidadBancaria, String codigoEntidadBancaria, String nombre, String cif, TipoEntidadBancaria TipoEntidadBancaria  ){
        
       this.cif=cif;
       this.codigoEntidadBancaria=codigoEntidadBancaria;
       this.idEntidadBancaria=idEntidadBancaria;
       this.nombre=nombre;
       this.tipoEntidadBancaria = TipoEntidadBancaria;
        
        
        
    }

    

    public List<SucursalBancaria> getSurcursales() {
        return Surcursales;
    }

    public void setSurcursales(List<SucursalBancaria> Surcursales) {
        this.Surcursales = Surcursales;
    }
    

    public int getIdEntidadBancaria() {
        return idEntidadBancaria;
    }

    public void setIdEntidadBancaria(int IdEntidadBancaria) {
        this.idEntidadBancaria = IdEntidadBancaria;
    }

    public String getCodigoEntidadBancaria() {
        return codigoEntidadBancaria;
    }

    public void setCodigoEntidadBancaria(String codigoEntidadBancaria) {
        this.codigoEntidadBancaria = codigoEntidadBancaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public TipoEntidadBancaria getTipoEntidadBancaria() {
        return tipoEntidadBancaria;
    }

    public void setTEB(TipoEntidadBancaria tipoEntidadBancaria) {
        this.tipoEntidadBancaria = tipoEntidadBancaria;
    }
    
    
}
