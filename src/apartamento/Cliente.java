
package apartamento;

public class Cliente {
    
   private String nombreCompleto;
    private String  noIdentificacion;
   

    public Cliente(String nombreCompleto, String noIdentificacion, Apartamentos apto) {
        this.nombreCompleto = nombreCompleto;
        this.noIdentificacion = noIdentificacion;
  
    }

    public Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String obtenerNombreCompleto() {
        return nombreCompleto;
    }

    public void modNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String obtenerNoIdentificacion() {
        return noIdentificacion;
    }

    public void modNoIdentificacion(String noIdentificacion) {
        this.noIdentificacion = noIdentificacion;
    }

    @Override
    public String toString() {
        return " Nombre " + this.nombreCompleto + " No. Identificacion" + this.noIdentificacion;
    }

  
   
}
