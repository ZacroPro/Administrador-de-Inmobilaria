/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Test;

import datos.Apartamento;
import datos.Factura;
import static datos.Ventana.saldo;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;



public class TestApartaTest {
  
    @Test
    public void testTest() {
		 Apartamento val = new Apartamento();
		    String nombre ="Camilo Grimaldo";
		    String identificacion ="1000808167";
		    int valorPagado = 150000000;
		    String item = "150000000";
		    val.setPrecio(Integer.parseInt(item));
		    
		     Factura fac = new Factura();
                     
		    if(valorPagado == 150000000 || valorPagado == 180000000 || valorPagado == 200000000){
		      fac.definirValorPagado(150000000);
                    
		        int saldo = fac.calcularSaldo(val.getPrecio(),fac.obtenerValorPagado());
		          System.out.println("Usuario"+ nombre+" de No, Identificascion "+ identificacion + "Su saldo es:" + saldo);
		  
		     }else{
		                 System.out.println("Verificar Datos.");
		     }
	
    }  
    @Test
    public void testTest2() {
		 Apartamento val = new Apartamento();
		    String nombre ="Camilo Grimaldo";
		    String identificacion ="1000808167";
		    int valorPagado = 150000000;
		    String item = "150000000";
		    val.setPrecio(Integer.parseInt(item));
		    
		     Factura fac = new Factura();
                     
		    if(valorPagado == 150000000 || valorPagado == 180000000 || valorPagado == 200000000){
		      fac.definirValorPagado(150000000);
                    
		        int saldo = fac.calcularSaldo(val.getPrecio(),fac.obtenerValorPagado());
		          System.out.println("Usuario"+ nombre+" de No, Identificascion "+ identificacion + "Su saldo es:" + saldo);
		  
		     }else{
		                 System.out.println("Verificar Datos.");
		     }
                    assertEquals(valorPagado,saldo);
		}
	}
        
    
    

