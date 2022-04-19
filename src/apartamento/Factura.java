
package apartamento;


public class Factura {
    
    private double valorPagado;
    public Apartamentos apto;
    public Cliente cliente; 
    

 public void obtenerValorPagado(double valorPagado) {
        this.valorPagado = valorPagado;
 }

    public double getValorPagado() {
        return valorPagado;
    }
  
 
public double saldo(double x ,double y){
 double saldo =  x -  y;
     return saldo;
}
}