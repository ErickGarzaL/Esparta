package mx.itson.prometeo.entidades;

import mx.itson.prometeo.enumeradores.Descuento;


/**
 * Entidad Articulo encargada de los articulos.
 * @author Erick Francisco Garza
 */


public class Articulo {
    
    private String nombre;
    private double precio;
    private double iva;
    private Descuento descuento;
    /**
     * Se obtiene el artiuculo deseado.
     * @return String
     */

    public String getNombre() {
        return nombre;
    }
    /**
     * Estable un nombre al articulo.
     * @param nombre 
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el precio del articulo.
     * @return  double.
     */

    public double getPrecio() {
        return precio;
    }
    /**
     * Establece precio del articulo.
     * @param precio 
     */

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Obtiene la cantidad del iva.
     * @return double
     */

    public double getIva() {
        return iva;
    }
    /**
     * Establece el iva.
     * @param iva 
     */

    public void setIva(double iva) {
        this.iva = iva;
    }
    /**
     * Obtiene el descuento que se a dado.
     * @return Descuento
     */

    public Descuento getDescuento() {
        return descuento;
    }
    /**
     * Establece un descuento en la variable.
     * @param descuento 
     */

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }
    
}