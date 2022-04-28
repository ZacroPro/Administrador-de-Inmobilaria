
package datos;

import java.io.Serializable;


public class Factura implements Serializable {
    
    private int valorPagado;
    private Cliente cliente; 
    private int saldo;
    private String codigo;
 

    public Factura() {
    }

    public Factura(int valorPagado, Cliente cliente, int saldo, String codigo) {
        this.valorPagado = valorPagado;
        this.cliente = cliente;
        this.saldo = saldo;
        this.codigo = codigo;
    
    }

   

     public int obtenerValorPagado() {
        return valorPagado;
    }

    public void definirValorPagado(int valorPagado) {
        this.valorPagado = valorPagado;
    }
    
    public Cliente obtenerCliente() {
        return cliente;
    }

    public void obtenerCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int obtenerSaldo() {
        return saldo;
    }

    public void valSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String valCodigo() {
        return codigo;
    }

    public void valCodigo(String codigo) {
        this.codigo = codigo;
    }


  public int calcularSaldo(int precio ,int valorPagado){
     int saldo =  precio -  valorPagado;
     if(saldo < 0) {
    	int  saldop1 = saldo ; 
     }else
          System.out.println("Verificar valor a pagar");
        return saldo;
  }
}

 