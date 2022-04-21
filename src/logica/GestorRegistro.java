/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import Utilidades.GestorPermanencia;
import apartamento.Cliente;
import apartamento.Factura;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author camil
 */
public class GestorRegistro {
    private Map<String, Factura> listaFactura;
    public GestorRegistro(){
        if (listaFactura == null){
            listaFactura = (Map<String, Factura> )GestorPermanencia.recuperar();
            if (listaFactura == null){
                listaFactura = new HashMap<>();
            }
        }
    }

    public Factura crearRegistro(String nombreCompleto, String  noIdentificacion, int valorPagado, int saldo){
        
        if (nombreCompleto == null || noIdentificacion == null ||  noIdentificacion.isEmpty()){
            return null;
        }else{
            Cliente cliente = this.crearCliente(nombreCompleto, noIdentificacion);
            Factura c = new Factura(valorPagado, cliente, saldo, nombreCompleto);
           
            listaFactura.put(c.valCodigo(),c);
            GestorPermanencia.guardar(listaFactura);
            return c;
        }
        
        
    }
    private Cliente crearCliente(String nombreCompleto, String noIdentificacion){
       Cliente c = new Cliente(nombreCompleto, noIdentificacion);
       
        
        return c;
    }
    public Map<String, Factura> obtenerLista(){
        return this.listaFactura;
    }
}
