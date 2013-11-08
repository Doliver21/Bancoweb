/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.presentacion;


import com.fpmislata.datos.EntidadBancariaDAO;
import com.fpmislata.negocio.CuentaBancaria;
import com.fpmislata.negocio.EntidadBancaria;
import com.fpmislata.negocio.MovimientoBancario;
import com.fpmislata.negocio.SucursalBancaria;
import com.fpmislata.negocio.TipoEntidadBancaria;
import com.fpmislata.negocio.TipoMovimientoBancario;
import java.math.BigDecimal;
//import java.util.Date;
import java.util.List;

public class Main {
             
   
    
public static void main(String[] args) throws Exception{
       
     Class.forName("com.mysql.jdbc.Driver");
    
   EntidadBancaria entidadBancariaIN = new EntidadBancaria(12,"3","CaixaBank","4444",TipoEntidadBancaria.BANCO);
      /* EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAO();
        
       entidadBancariaDAO.read(entidadBancariaIN.getIdEntidad());
       entidadBancariaDAO.insert(entidadBancariaIN);        
       entidadBancariaDAO.update(entidadBancariaIN);
       entidadBancariaDAO.delete(entidadBancariaIN.getIdEntidad());
       
       //Faltan variables
       System.out.println(""+entidadBancariaDAO.findAll());
       entidadBancariaDAO.findByCodigo(entidadBancariaIN.getCodigoEntidad());
        
    */
    EntidadBancaria entidadBancaria1 = new EntidadBancaria(1,"1","Banesto","1",TipoEntidadBancaria.BANCO);
    EntidadBancaria entidadBancaria2 = new EntidadBancaria(2,"2","Banesto","2",TipoEntidadBancaria.BANCO);

    
    SucursalBancaria sucursalBancaria1 = new SucursalBancaria(5,entidadBancaria1,"5","Banesto");
    SucursalBancaria sucursalBancaria2 = new SucursalBancaria(10,entidadBancaria1,"10","Banesto");    

       
    //BigDecimal a=new BigDecimal("1000");
  //  BigDecimal b=new BigDecimal("1200");
   //  BigDecimal c=new BigDecimal("300");
  //    BigDecimal e=new BigDecimal("500");
//    CuentaBancaria cuentaBancaria1= new CuentaBancaria (5,sucursalBancaria1,3,a,6);
  // CuentaBancaria cuentaBancaria2= new CuentaBancaria (12,sucursalBancaria1,3,b,8);
    
    
  //Crear objeto gregorian calendar  
   // MovimientoBancario movimientoBancario1 = new MovimientoBancario(5,TipoMovimientoBancario.DEBE,e,,a,"Prueba");
    //MovimientoBancario movimientoBancario2 = new MovimientoBancario(5,TipoMovimientoBancario.HABER,c,"ayer",b,"Prueba2");    

    //Lista en Entidad Bancaria --para-- SucursalBancaria --para-- CuentaBancaria --para-- MovimientoBancario
    
/*    List<MovimientoBancario> movimientoBancarios=cuentaBancaria1.getMovimientoBancarios();

   movimientoBancarios.add(movimientoBancario1);  
   movimientoBancarios.add(movimientoBancario2);
      
               System.out.println("Movimientos: "+movimientoBancarios.get(1)+"\n");
     
 imprimeDatosCuentaBancaria(cuentaBancaria1);*/
}     
              
static void imprimeDatosCuentaBancaria(CuentaBancaria cuentaBancaria){
        
for(MovimientoBancario movimientoBancarios:cuentaBancaria.getMovimientosBancarios()){
       System.out.println(""+cuentaBancaria.getMovimientosBancarios());
         System.out.println(""+cuentaBancaria.getSaldo());
          System.out.println(""+cuentaBancaria.getDc());
          System.out.println(""+cuentaBancaria.getSucursalBancaria());
          System.out.println(""+cuentaBancaria.getIdCuentaBancaria());
          //Ojo al imprimir objetos sale churro !!!
}

}
}
